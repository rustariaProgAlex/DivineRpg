package com.location;

import java.util.ArrayList;
import java.util.Random;

public class Location {
    private int dist = 1;
    private String name;
    private String type;
    private ArrayList<String> links;
    public Location(String name, int dist, String  type, ArrayList<String> links){
        this.name = name;
        this.dist = dist;
        this.type = type;
        this.links = links;
        
        
    }
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
    public ArrayList<String> getLinks() {
        return links;
    }
         
}
