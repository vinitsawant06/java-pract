package se.arraysDependancy;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class ArrayDependacy {

    private String[] myArray = new String[5];
    private ArrayList fruits = new ArrayList();
    private HashSet cricketers = new HashSet();
    private HashMap country_Capitals = new HashMap();
    private Properties drivers;
    private String name;

    @Autowired
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pringCountry() {
        Set keys = country_Capitals.keySet();
        for(Object key:keys) {
            System.out.println(key+" "+country_Capitals.get(key));
        }
    }

    public Properties getDrivers() {
        return drivers;
    }

    @Autowired
    public void setDrivers(Properties drivers) {
        this.drivers = drivers;
    }

    public String[] getMyArray() {
        return myArray;
    }

    public ArrayList getFruits() {
        return fruits;
    }

    @Autowired
    public void setFruits(ArrayList fruits) {
        this.fruits = fruits;
    }

    public HashSet getCricketers() {
        return cricketers;
    }

    @Autowired
    public void setCricketers(HashSet cricketers) {
        this.cricketers = cricketers;
    }

    public HashMap getCountry_Capitals() {
        return country_Capitals;
    }

    @Autowired
    public void setCountry_Capitals(HashMap country_Capitals) {
        this.country_Capitals = country_Capitals;
    }

    @Autowired
    public void setMyArray(String[] myArray) {
        this.myArray = myArray;
    }

}
