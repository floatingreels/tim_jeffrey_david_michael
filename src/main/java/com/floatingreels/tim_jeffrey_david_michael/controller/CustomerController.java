//package com.floatingreels.tim_jeffrey_david_michael.controller;
//
//import com.floatingreels.tim_jeffrey_david_michael.model.Customer;
//import com.floatingreels.tim_jeffrey_david_michael.model.CustomerDAO;
//import com.floatingreels.tim_jeffrey_david_michael.model.Product;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import javax.validation.Valid;
//
////Author DG
////aangemaakt maar nog niet operationeel
//@Controller
//public class CustomerController {
//
//    //om gebruik te maken van alle features van de CrudRepository
//    @Autowired
//    CustomerDAO repo;
//
//    //om methode uit te voeren wanneer er in de pagina iets moet uitgevoerd worden
//    @ModelAttribute(value = "registerCustomer")
//    public Customer registerCustomer(Customer c) {
//        return repo.save(c);
//    }
//
//    //Om pagina weer te geven wanneer er aanvraag binnenkomt
//    @RequestMapping(value = "/register/new", method = RequestMethod.GET)
//    public String registerCustomer() {
//        return "register";
//    }
//
//    @RequestMapping(value = "/register/new", method = RequestMethod.POST)
//    //ModelAttribute hier zodat je de info van de newProduct opnieuw krijgt als er fouten zijn en geen volledig leeg formulier
//    //BindingResult gaat resultaat van formulier toevoegen aan database
//    public String saveCustomer(@ModelAttribute("newCustomer") @Valid Customer newCustomer, BindingResult bindingResult) {
//        if (bindingResult.hasErrors()) {
//            return "index";
//        } else repo.save(newCustomer);
//        return "redirect:/register";
//    }
//}

