package com.kodilla.good.patterns.challenges;

public class Product {

    private String nameProduct;

    public Product(String nameProduct) {
        this.nameProduct = nameProduct;

    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }


    @Override
    public String toString() {
        return  nameProduct;
    }
}
