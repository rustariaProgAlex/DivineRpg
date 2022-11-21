package com.dev;

import java.io.File;

import com.files.FileListener;
import com.hero.Player;
import com.location.Location;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main {
    static Location currentLocation;
    static boolean  pressed = false;
    public static void travel(){


        showTravelMenu();
        currentLocation = FileListener.locationReader("plot/locations.txt", "LocationForest_1");
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (Player.getHp() >= 0) {
                    for(int i = 0; i < currentLocation.getDist(); i++){
                        pressed = false;
                        final int finalI = i;
                        Platform.runLater(() ->  App.getScript().setText("Вы прошли: "+ finalI));
                       
                        while (!pressed){
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
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
        test.setOnAction((e) -> {
            pressed = true;
        });
    }


    
}


