package com.floatingreels.tim_jeffrey_david_michael.model;

import org.springframework.data.repository.CrudRepository;
//datasource voor klanten
public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
