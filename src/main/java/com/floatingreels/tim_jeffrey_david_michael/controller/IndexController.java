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

    //om gebruik te maken van alle features van de CrudRepository
    @Autowired
    ProductDAO dao;

    //om indexpagina te kunnen openen
    @RequestMapping(value = {"", "/index"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }

    //om binnen de pagina functie aan te roepen om alle producten weer te geven
    @ModelAttribute(value = "allProducts")
    public Iterable<Product> showProducts() {
        return dao.findAll();
    }

    //om te filteren per variable categorie
    @RequestMapping(value = {"/index/{category}"}, method = RequestMethod.GET)
    public String searchByCategory(ModelMap map, @PathVariable(value = "category") String category) {
        map.addAttribute("allProducts", dao.findByCategory(category));
        return "index";
    }

    //om bevestingspagina te openen
    @RequestMapping(value = {"/confirmation"}, method = RequestMethod.GET)
    public String showConfirmation() {
        return "confirmation";
    }

    //om aboutpagina te openen
    @GetMapping(value = {"/about"})
    public String showAbout() {
        return "about";
    }


}
