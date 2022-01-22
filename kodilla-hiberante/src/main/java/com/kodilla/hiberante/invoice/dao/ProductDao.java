package com.kodilla.hiberante.invoice.dao;

import com.kodilla.hiberante.invoice.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
