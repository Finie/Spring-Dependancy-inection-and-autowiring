package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private int lId;
    private String lBrand;
    private String lName;


    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public String getlBrand() {
        return lBrand;
    }

    public void setlBrand(String lBrand) {
        this.lBrand = lBrand;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "lId=" + lId +
                ", lBrand='" + lBrand + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }



    public void initLaptop(){
        System.out.println("Initializing alien Laptop...");
    }
}
