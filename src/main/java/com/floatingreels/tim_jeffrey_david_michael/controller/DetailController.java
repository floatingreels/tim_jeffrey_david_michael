package com.floatingreels.tim_jeffrey_david_michael.controller;

import com.floatingreels.tim_jeffrey_david_michael.model.ProductDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.server.ResponseStatusException;

/*author : Michael */
@Controller
public class DetailController {

    @Autowired
    ProductDAO dao;


    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String showDetails(ModelMap map, @PathVariable(name = "id") int id) {
        if (dao.findById(id).isPresent()) {
            map.addAttribute("product", dao.findById(id).get());
            return "details";
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Error: Product was not found; Try again please!");
        }
    }
}
