package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
private String model;
private String marka;

    public Car(String model, String marka) {
        this.model = model;
        this.marka = marka;
    }
}
