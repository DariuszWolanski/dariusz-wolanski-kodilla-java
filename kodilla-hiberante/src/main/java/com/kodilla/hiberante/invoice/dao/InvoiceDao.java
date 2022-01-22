package com.kodilla.hiberante.invoice.dao;

import com.kodilla.hiberante.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;

public interface InvoiceDao extends CrudRepository<Invoice, Integer> {
}
