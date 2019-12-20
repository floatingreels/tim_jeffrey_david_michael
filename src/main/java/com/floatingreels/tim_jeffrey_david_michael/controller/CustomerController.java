package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.Customer;
import com.floatingreels.tim_jeffrey_david_michael.model.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CustomerController {

    @Autowired
    CustomerDAO repo;

    @ModelAttribute(value = "registerCustomer")
    public Customer registerCustomer(Customer c) {
        return repo.save(c);
    }

    @RequestMapping(value = "/registration/newcustomer", method = RequestMethod.GET)
    public String registerCustomer(){
        return "redirect:/regcomfirm";
    }
}
