package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Laptop laptop1=new Laptop();
        laptop1.setBrand("Dell");
        laptop1.setModel("ROX");
        laptop1.setRam(32);
        laptop1.setLid(101);

        Laptop laptop2=new Laptop();
        laptop2.setBrand("Asus");
        laptop2.setModel("Vivobook");
        laptop2.setRam(16);
        laptop2.setLid(102);

        Laptop laptop3 =new Laptop();
        laptop3.setBrand("Apple");
        laptop3.setModel("Macbook");
        laptop3.setRam(8);
        laptop3.setLid(103);


        Alien alien1 =new Alien();
        alien1.setAid(1001);
        alien1.setTech("Java");
        alien1.setAname("Abhishek");

        Alien alien2 =new Alien();
        alien2.setAid(1002);
        alien2.setTech("C++");
        alien2.setAname("Aviraj");




        alien1.setLaptops(Arrays.asList(laptop1, laptop2));
        alien2.setLaptops(Arrays.asList(laptop3));
//        alien3.setLaptops(Arrays.asList(laptop2));


        SessionFactory sf= new Configuration().addAnnotatedClass(org.example.Alien.class)
                .addAnnotatedClass(org.example.Laptop.class)
                .configure()
                .buildSessionFactory();
        Session session=sf.openSession();


        session.persist(laptop1);
        session.persist(laptop2);
        session.persist(laptop3);

        session.persist(alien1);
        session.persist(alien2);



        Transaction transaction=session.beginTransaction();
        transaction.commit();

        Alien a1=session.find(Alien.class,1001);
        System.out.println(a1);

        session.close();
        sf.close();


    }
}