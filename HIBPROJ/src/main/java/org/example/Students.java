package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
    @Id
    private int rollNo;
    private String sName;
    private int sAge;

    public Students(){}

    public Students(int rollNo, String sName, int sAge) {
        this.rollNo = rollNo;
        this.sName = sName;
        this.sAge = sAge;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getsName() {
        return sName;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                '}';
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }


}
