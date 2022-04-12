package com.enigma.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Gasoline gasoline = (Gasoline) applicationContext.getBean("Gasoline");
        gasoline.soundEngine();
        Electric electric = (Electric) applicationContext.getBean("electrical");
        electric.soundEngine();
//        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("all-beans.xml");
//        String [] beans = applicationContext.getBeanDefinitionNames();//beans pada context
//        for (String bean : beans){
//            System.out.println(bean);
//        }
//        Electric electric = (Electric) applicationContext.getBean("electricalEngine");
//        System.out.println(electric);
//
//        Car car = (Car) applicationContext.getBean("Tesla");
//        System.out.println(car);

        //Car imprezza = new Car("subaru");
//        imprezza.setEngine(electric);
//        System.out.println(imprezza);
//        imprezza.start();


//        Diesel diesel = new Diesel();
//        Car car = new Car("Isuzu",diesel);
//        car.start();
//        System.out.println("==================================");
//
//        Car car1 = new Car("Tesla Electric electric = new Electric();",electric);
//        car1.start();


    }

}
