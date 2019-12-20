package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.Customer;
import com.floatingreels.tim_jeffrey_david_michael.model.CustomerDAO;
import com.floatingreels.tim_jeffrey_david_michael.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class CustomerController {

    @Autowired
    CustomerDAO repo;

    @ModelAttribute(value = "registerCustomer")
    public Customer registerCustomer(Customer c) {
        return repo.save(c);
    }

//    @RequestMapping(value = "/registration/newcustomer", method = RequestMethod.GET)
//    public String registerCustomer(){
//        return "redirect:/regcomfirm";
//    }

    @RequestMapping(value = "/register/new", method = RequestMethod.POST)
    //ModelAttribute hier zodat je de info van de newProduct opnieuw krijgt als er fouten zijn en geen volledig leeg formulier
    //BindingResult gaat resultaat van formulier toevoegen aan database
    public String saveCustomer(@ModelAttribute("newCustomer") @Valid Customer newCustomer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "index";
        } else repo.save(newCustomer);
        return "redirect:/register";
    }
}


