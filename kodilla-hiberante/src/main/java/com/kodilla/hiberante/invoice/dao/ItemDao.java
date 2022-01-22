package com.kodilla.hiberante.invoice.dao;

import com.kodilla.hiberante.invoice.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemDao extends CrudRepository<Item, Integer> {
}
