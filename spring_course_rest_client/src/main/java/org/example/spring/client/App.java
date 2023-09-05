package org.example.spring.client;

import org.example.spring.client.configuration.MyConfig;
import org.example.spring.client.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);

        System.out.println("*___________________________________________*");

        Employee employeeById = communication.getEmployeeById(1);
        System.out.println(employeeById);

        System.out.println("*___________________________________________*");

//        Employee employee = new Employee("Sveta", "Socolova", "HR", 400);
//        communication.saveEmployee(employee);

        System.out.println("*___________________________________________*");

//        Employee employee1 = new Employee("Anton", "Malinovskyi", "Sales", 800);
//        employee1.setId(2);
//        communication.saveEmployee(employee1);

        System.out.println("*___________________________________________*");

        communication.deleteEmployee(22);

    }
}
