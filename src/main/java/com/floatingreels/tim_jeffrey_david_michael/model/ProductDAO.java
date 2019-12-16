package com.floatingreels.tim_jeffrey_david_michael.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<Product, Integer> {
    @Query("SELECT b FROM Blog b ORDER BY b.Ca DESC")
    Iterable<Product> getCatVoeding();

}
