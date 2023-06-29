package com.vishwa.ideaApp;

import org.springframework.stereotype.Component;

@Component // used for creation of object
public class laptop {
    private String brand;
    private  int age;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void compile()
        {
            System.out.println("THis  is laptop");
        }

    }

