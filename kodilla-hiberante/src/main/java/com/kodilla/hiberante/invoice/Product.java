package com.kodilla.hiberante.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PRODUCT")
public class Product {

    private int id;
    private String name;

    public Product() {

    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "NAME_PRODUCT")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
