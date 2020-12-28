package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 *@Component creates an object in the spring's Container
 */
@Component
public class Alien {

    private int aId;
    private String aName;
    private String aTech;
    /*
    * @Autowired connects an object to another object in the Spring Container
    * @Qualifier searches the component by the name assigned to the component
    * */
    @Autowired
    @Qualifier("laptop")
    private Laptop laptop;

    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaTech() {
        return aTech;
    }

    public void setaTech(String aTech) {
        this.aTech = aTech;
    }

    public void initAlien(){
        System.out.println("Initializing Alien Life....");
        laptop.initLaptop();
    }
}
