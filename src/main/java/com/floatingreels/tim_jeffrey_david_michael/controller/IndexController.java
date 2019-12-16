package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.Product;
import com.floatingreels.tim_jeffrey_david_michael.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//added by DG

@Controller
public class IndexController {
    @Autowired
    ProductDAO dao;

    @RequestMapping(value = {"", "/index"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }

    @ModelAttribute(value = "allProducts")
    public Iterable<Product> showProducts() {
        return dao.findAll();
    }

    @ModelAttribute(value = "categoryFood")
    public Iterable<Product> showCategoryFood() {
        return dao.getCatFood();
    }

    @ModelAttribute(value = "categoryToy")
    public Iterable<Product> showCategoryToy() {
        return dao.getCatToy();
    }

    @ModelAttribute(value = "categoryHabitat")
    public Iterable<Product> showCategoryHabitat() {
        return dao.getCatHabitat();
    }

    @RequestMapping(value = {"/confirmation"}, method = RequestMethod.GET)
    public String showConfirmation(ModelMap map) {
        return "confirmation";


    }
}
