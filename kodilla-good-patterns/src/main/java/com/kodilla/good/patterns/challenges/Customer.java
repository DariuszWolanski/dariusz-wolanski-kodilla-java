package com.kodilla.good.patterns.challenges;

public class Customer {

    private String nameCustomer;
    private String iDCustomer;

    public Customer(String nameCustomer, String iDCustomer) {
        this.nameCustomer = nameCustomer;
        this.iDCustomer = iDCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getiDCustomer() {
        return iDCustomer;
    }

    public void setiDCustomer(String iDCustomer) {
        this.iDCustomer = iDCustomer;
    }


    @Override
    public String toString() {
        return nameCustomer + " (ID:  " + iDCustomer + ")";
    }
}
