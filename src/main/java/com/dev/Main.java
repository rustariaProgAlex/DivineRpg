package com.dev;

import java.io.File;

import com.files.FileListener;
import com.hero.Player;
import com.location.Location;

import javafx.scene.control.Button;

public class Main {
    static Location currentLocation;
    public static void travel(){
        currentLocation = FileListener.locationReader("plot/locations.txt", "LocationForest_1");
        while (Player.getHp() <= 0) {
            for(int i = 0; i < currentLocation.getDist(); i++){

            }
            
        }

    }
    public static void locationHandler(){
    } 
    
    private void 
    
}
