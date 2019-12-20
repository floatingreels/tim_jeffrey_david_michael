package com.floatingreels.tim_jeffrey_david_michael.model;

import org.springframework.data.repository.CrudRepository;

//Author DG

public interface ProductDAO extends CrudRepository<Product, Integer> {
    //om te kunnen filteren
    Iterable<Product> findByCategory(String category);
}
