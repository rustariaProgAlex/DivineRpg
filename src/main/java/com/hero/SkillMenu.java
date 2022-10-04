package com.hero;

import com.dev.App;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class SkillMenu {

    public static void showSkillMenu() {
        VBox btnBox = App.getBtnBox();
        Button strBtn = new Button("1");
        Button dexBtn = new Button("2");
        Button magBtn = new Button("3");
        App.getScript().setText("Выбирите куда хоити потритить очки навыков \n"
                + "1. STR = " + Player.getSTR() + "\n"
                + "2. DEX = " + Player.getDEX() + "\n"
                + "3. MAG = " + Player.getMAG());
        btnBox.getChildren().add(strBtn);
        btnBox.getChildren().add(dexBtn);
        btnBox.getChildren().add(magBtn);
        strBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                Player.setSTR(Player.getSTR() + 1);
            }

        });
        dexBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                Player.setDEX(Player.getDEX() + 1);
            }

        });
        magBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                Player.setMAG(Player.getMAG() + 1);
            }

        });

    }

}
