package com.xworks.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ConfigClass.class);

//        Car car = applicationContext.getBean(Car.class);
//        car.carName();
//
//        Bus bus = applicationContext.getBean(Bus.class);
//        bus.busName();

        Bike bike = applicationContext.getBean(Bike.class);
        bike.bikeName();
    }
}
