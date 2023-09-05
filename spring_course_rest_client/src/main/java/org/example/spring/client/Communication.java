package org.example.spring.client;

import org.example.spring.client.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {
    @Autowired
    private RestTemplate restTemplate;
    private final String URL = "http://localhost:8080/api/employees";

    public List<Employee> getAllEmployees(){
        ResponseEntity<List<Employee>> responseEntity =
        restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {});
        List<Employee> allEmployees = responseEntity.getBody();
        return allEmployees;
    }
    public Employee getEmployeeById(Integer id){

        Employee employee = restTemplate.getForObject(URL + "/" + id, Employee.class);
        return employee;
    }
    public void saveEmployee(Employee employee){
        Integer id = employee.getId();
        if (id == null){
            ResponseEntity<String> responseEntity =
                    restTemplate.postForEntity(URL, employee, String.class);
            System.out.println("New Employee was added to DB");
            System.out.println(responseEntity.getBody());
        }else {
            HttpHeaders headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            headers.set("Your-Header-Name", "Your-Id-Value");
            headers.set("id", id.toString());
            restTemplate.exchange(URL, HttpMethod.PUT, new HttpEntity<>(employee, headers), Void.class);
            System.out.println("Employee with ID: " + id + " was updated!");
        }
    }
    public void deleteEmployee(Integer id){
        restTemplate.delete(URL + "/" + id);

        System.out.println("Employee with ID: " + id + " was deleted!");
    }

}
