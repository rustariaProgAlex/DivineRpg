package com.location;

import java.util.Random;

public class Location {
    private int dist;
    private String name;
    public Location(String name){
        dist = new Random().nextInt(10) + 10;
        this.name = name;
        
    }
    public static void 
    public int getDist() {
        return dist;
    }
    public void setDist(int dist) {
        this.dist = dist;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
         
}
