package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.Product;
import com.floatingreels.tim_jeffrey_david_michael.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

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

//    @ModelAttribute(value="categoryFood")
//    public Iterable<Product> showCategoryFood(){
//        return dao.getCatFood();
//    }
//
//    @ModelAttribute(value="categoryToy")
//    public Iterable<Product> showCategoryToy(){
//        return dao.getCatToy();
//    }
//
//    @ModelAttribute (value="categoryHabitat")
//    public Iterable<Product> showCategoryHabitat(){
//        return dao.getCatHabitat();
//    }

    @RequestMapping(value = "/{category}", method = RequestMethod.GET)

    public Iterable<Product> searchByCategory(ModelMap map, @PathVariable(value = "category") String category) {
        map.addAttribute("category",dao.findByCategory(category);
        return dao.findByCategory(category);
    }

    @RequestMapping(value = {"/confirmation"}, method = RequestMethod.GET)
    public String ShowConfirmation() {
        return "confirmation";
    }

}
