package org.example;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Laptop {
    private String model;
    private int ram;
    private String brand;
    @Id
    private int lid;


    public Laptop(){}



    public String getBrand() {
        return brand;
    }
//    public List<Alien> getAliens(){
//        return aliens;
//    }
//
//    public void setAliens(List<Alien> aliens){
//        this.aliens=aliens;
//    }

//    public Alien getAlien() {
//        return alien;
//    }
//
//    public void setAlien(Alien alien) {
//        this.alien = alien;
//    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", lid=" + lid +
                '}';
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }



    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }


}
