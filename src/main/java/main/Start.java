package main;

import impls.car.CreateCar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main (String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("by.java.spring.training.impls.car");
        CreateCar createCar=(CreateCar)context.getBean("createCar");
        createCar.go();


    }


}
