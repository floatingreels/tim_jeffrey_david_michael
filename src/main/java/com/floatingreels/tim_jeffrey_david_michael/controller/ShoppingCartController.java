package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.Product;
import com.floatingreels.tim_jeffrey_david_michael.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
public class ShoppingCartController {

    @Autowired
    ProductDAO dao;

    static ArrayList<Product> cart = new ArrayList<Product>();

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String showCart(ModelMap map) {
        return "cart";
    }

    @ModelAttribute(value = "showCart")
    public ArrayList<Product> showCart() {
        return cart;
    }

    @GetMapping(value = "/cart/add/{id}")
    public String addToCart(@PathVariable(value = "id") int id) {
        Product p = dao.findById(id).get();
        cart.add(p);
        return "redirect:/index";
    }

    @RequestMapping(value = "/cart/del/{id}", method = RequestMethod.GET)
    public String delFromCart(@PathVariable(value = "id") int id) {
        Product c = dao.findById(id).get();
        cart.remove(c);
        return "redirect:/cart";
    }

    @RequestMapping(value = "/cart/clear", method = RequestMethod.GET)
    public String clearCart() {
        cart.clear();
        return "redirect:/confirmation";
    }

}
