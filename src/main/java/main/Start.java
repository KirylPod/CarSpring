package main;

import impls.car.CreateCar;
import interfaces.Car;
import interfaces.CarConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main (String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("all_context.xml");

        CarConveyor ferrariConveyor = (CarConveyor)context.getBean("ferrariConveyor");
        Car ferrari1 = ferrariConveyor.createCar();
        Car ferrari2 = ferrariConveyor.createCar();
        Car ferrari3 = ferrariConveyor.createCar();

        System.out.println("ferrari1" + ferrari1);
        System.out.println("ferrari2" + ferrari2);
        System.out.println("ferrari3" + ferrari3);


 //       CreateCar createCar=(CreateCar)context.getBean("createCarOld");
  //      CreateCar createCar=(CreateCar)context.getBean("createCar");
//       CreateCar createCar=(CreateCar)context.getBean("createCarNew");
//        createCar.go();
 //       createCar.brake();


    }


}
