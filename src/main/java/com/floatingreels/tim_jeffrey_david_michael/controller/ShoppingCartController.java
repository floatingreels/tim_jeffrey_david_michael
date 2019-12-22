package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.Product;
import com.floatingreels.tim_jeffrey_david_michael.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;

@Controller
public class ShoppingCartController {
    //om gebruik te maken van alle features van de CrudRepository
    @Autowired
    ProductDAO dao;

    //statische lijst met producten die winkelwagen voorstelt, meteen geïitialiseerd
    static ArrayList<Product> cart = new ArrayList<Product>();
    static double totaalPrijs = 0;


    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String showCart(ModelMap map) {
        return "cart";
    }

    @ModelAttribute(value = "showCart")
    public ArrayList<Product> showCart() {
        return cart;
    }
   //voegt een item toe aan de cart, gelinkt aan de id
    @GetMapping(value = "/cart/add/{id}")
    public String addToCart(@PathVariable(value = "id") int id) {
        Product p = dao.findById(id).get();
        cart.add(p);

        updateTotal();

        return "redirect:/index";
    }
    //verwijdert een item uit de cart, gelinkt aan id
    @RequestMapping(value = "/cart/del/{id}", method = RequestMethod.GET)
    public String delFromCart(@PathVariable(value = "id") int id) {
        Product c = dao.findById(id).get();
        cart.remove(c);

        updateTotal();

        return "redirect:/cart";
    }

    //verwijst naar de confirmatiepagina.
    @RequestMapping(value = "/cart/clear", method = RequestMethod.GET)
    public String clearCart() {
        cart.clear();

        totaalPrijs = 0;
        return "redirect:/confirmation";
    }

    public void updateTotal() {
        totaalPrijs = cart.stream().mapToDouble(Product::getPrice).sum();
    }

}
