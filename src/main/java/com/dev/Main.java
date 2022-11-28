package com.dev;

import java.io.File;

import com.files.FileListener;
import com.hero.Player;
import com.hero.SkillMenu;
import com.location.Location;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class Main {
    static Location currentLocation;
    static boolean pressed = false;

    public static void travel() {

        showTravelMenu();
        currentLocation = FileListener.locationReader("LocationForest_1");
        new Thread(new Runnable() {


            @Override
            public void run() {
                while (Player.getHp() >= 0) {
                    for (int i = 0; i < currentLocation.getDist(); i++) {
                        pressed = false;
                        final int finalI = i;
                        Platform.runLater(() -> App.getScript().setText("Вы прошли: " + finalI));
                        while (!pressed) {
                            try {
                                Thread.sleep(100);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                    Platform.runLater(() -> {
                        App.getBtnBox().getChildren().clear();
                    });
                    for (int i = 0; i < currentLocation.getLinks().size(); i++) {
                        Location newLoc = FileListener.locationReader(currentLocation.getLinks().get(i));
                        Button locationBtn = new Button(newLoc.getName());
                        Platform.runLater(() -> {
                            App.getBtnBox().getChildren().add(locationBtn);
                        });
                        locationBtn.setOnAction((e) -> {
                            currentLocation = newLoc;
                            showTravelMenu();
                            System.out.println(currentLocation.getLinks());
                        });
                        

                    }

                }

             

            }
           

        }).start();
    }

    public static void locationHandler() {
    }

    public static void showTravelMenu() {
        Button goBtn = new Button("Идти дальше");
        Button inventoryBtn = new Button("Инвентарь");
        Button campBtn = new Button("Разбить лагерь");
        Button exitBtn = new Button("Выйти");
        App.getBtnBox().getChildren().clear();
        App.getBtnBox().getChildren().add(goBtn);
        goBtn.setOnAction((e) -> {
            pressed = true;
        });

    }

    public static void showStartDialog() {
        String path = "plot/start.txt";
        Button nextBtn = new Button("Начать игру");
        App.getBtnBox().getChildren().add(nextBtn);
        nextBtn.setOnAction(new EventHandler<ActionEvent>() {
            int next = 1;

            @Override
            public void handle(ActionEvent arg0) {
                if (next == 1)
                    nextBtn.setText("Далее");
                App.getScript().setText(FileListener.textReading("start_" + next, path));
                next++;
                if (next == 4) {
                    SkillMenu.showSkillMenu();
                }
            }

        });
    }

}
