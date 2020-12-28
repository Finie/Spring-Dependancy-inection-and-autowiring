package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Alien {

    private int aId;
    private String aName;
    private String aTech;

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
    }
}
