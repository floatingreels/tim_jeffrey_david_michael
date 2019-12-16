package com.floatingreels.tim_jeffrey_david_michael.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/*author: Michael */

public interface ProductDAO extends CrudRepository<Product, Integer> {

    @Query("SELECT b FROM Product b WHERE b.category=FOOD")
    Iterable<Product> getCatFood();

    @Query("SELECT b FROM Product b WHERE b.category=TOY")
    Iterable<Product> getCatToy();

    @Query("SELECT b FROM Product b WHERE b.category=HABITAT")
    Iterable<Product> getCatHabitat();


}
