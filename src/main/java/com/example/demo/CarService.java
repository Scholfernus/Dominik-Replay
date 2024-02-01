package com.example.demo;

import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Getter
public class CarService {
    private final List<Car>carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }
    public CarService(){
        Car car1 = new Car("Ford","Mustang");
        Car car2 = new Car("Opel","Astra");
        Car car3 = new Car("Nissan","Micro");
        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }
}
