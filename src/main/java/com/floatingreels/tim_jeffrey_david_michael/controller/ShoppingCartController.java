package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.Product;
import com.floatingreels.tim_jeffrey_david_michael.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
public class ShoppingCartController {

    @Autowired
    ProductDAO dao;

    ArrayList<Product> cart = new ArrayList<Product>();

    @RequestMapping(value="/cart", method = RequestMethod.GET)
    public String showCart(ModelMap map){
        return "cart";
    }

    @ModelAttribute(value="showCart")
    public ArrayList<Product> showCart(){
        return cart;
    }

    @ModelAttribute(value = "addToCart")
    public ArrayList<Product> addToCart(ArrayList<Product> cart, Product p){
        cart.add(p);
        return cart;
    }

    @ModelAttribute(value = "removeFromCart")
    public ArrayList<Product> removeFromCart(ArrayList<Product> cart, Product p){
        cart.remove(p);
        return cart;
    }


}
