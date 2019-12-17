package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ShoppingCartController {

    @Autowired
    ProductDAO dao;

    @RequestMapping(value="showCart", method = RequestMethod.GET)
    public String showCart(ModelMap map){
        return "shoppingcart";
    }

    @ModelAttribute(value = "addToCart")
    public Product saveSnack(){
        return new Snack();
    }




}
