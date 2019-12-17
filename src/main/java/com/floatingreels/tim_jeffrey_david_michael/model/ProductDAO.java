package com.floatingreels.tim_jeffrey_david_michael.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

/*author: Michael */

public interface ProductDAO extends CrudRepository<Product, Integer> {

    //added by DG
    ArrayList<Product> cart = new ArrayList<Product>();
    ArrayList<Product> addToCart(Product p);

    @Query("SELECT b FROM Product b WHERE b.category like 'FOOD'")
    Iterable<Product> getCatFood();

    @Query("SELECT b FROM Product b WHERE b.category like 'TOY'")
    Iterable<Product> getCatToy();

    @Query("SELECT b FROM Product b WHERE b.category like 'HABITAT'")
    Iterable<Product> getCatHabitat();


}
