package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.Product;
import com.floatingreels.tim_jeffrey_david_michael.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

//added by DG
@Controller
public class IndexController {

    @Autowired
    ProductDAO dao;

    //om indexpagina te laden
    @RequestMapping(value = {"", "/index"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }

    //om binnen de indexpagina alles weer te geven
    @ModelAttribute(value = "allProducts")
    public Iterable<Product> showProducts() {
        return dao.findAll();
    }

    //om te filteren op categorie, methode callen die in datasource is gemaakt
    @RequestMapping(value = {"/index/{category}"}, method = RequestMethod.GET)
    public String searchByCategory(ModelMap map, @PathVariable(value = "category") String category) {
        map.addAttribute("allProducts", dao.findByCategory(category));
        return "index";
    }

    //om bevestigingspagina te laden
    @RequestMapping(value = {"/confirmation"}, method = RequestMethod.GET)
    public String showConfirmation() {
        return "confirmation";
    }
    //om aboutpagina te laden
    @GetMapping(value = {"/about"})
    public String showAbout() {
        return "about";
    }


}
