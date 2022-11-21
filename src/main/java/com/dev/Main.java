package com.dev;

import java.io.File;

import com.files.FileListener;
import com.hero.Player;
import com.location.Location;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main {
    static Location currentLocation;
    public static void travel(){
        currentLocation = FileListener.locationReader("plot/locations.txt", "LocationForest_1");
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (Player.getHp() <= 0) {
                    for(int i = 0; i < currentLocation.getDist(); i++){
        
                    }
                    
                }
                
            }
            
        }).start();

    }
    public static void locationHandler(){
    } 
    
    public static void showTravelMenu(){
        Button test = new Button("1");
        App.getBtnBox().getChildren().clear();
        App.getBtnBox().getChildren().add(test);
        test.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // TODO Auto-generated method stub
                
            }
            
        });
    }


    class Fofa implements EventHandler<ActionEvent>
    {
        
    } 
}
