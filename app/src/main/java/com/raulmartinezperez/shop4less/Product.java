package com.raulmartinezperez.shop4less;

import java.io.Serializable;

public class Product implements Serializable{

    private int price;
    private String name = "";


    public Product() {
    }

    public Product(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {

        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return price + "€ " + name;
    }
}
