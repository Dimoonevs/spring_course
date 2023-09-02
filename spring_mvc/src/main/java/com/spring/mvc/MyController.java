package com.spring.mvc;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/employee")
public class MyController {
    @RequestMapping("/")
    public String showFirstView(){
        return "index";
    }
    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model){
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }
    @RequestMapping("/showDetails")
    public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                      BindingResult result){
        if (result.hasErrors()) {
            return "ask-emp-details-view";
        }
        String number = employee.getPhoneNumber();
        number = "(+380) " + number;
        employee.setPhoneNumber(number);
        return "show-emp-details-view";
    }

}
