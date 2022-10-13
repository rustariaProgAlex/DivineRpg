package com.hero;

import com.dev.App;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SkillMenu {

    private static String madifBtn = "";

    public static void showSkillMenu() {
        VBox btnBox = App.getBtnBox();
        Button strBtn = new Button("1");
        Button dexBtn = new Button("2");
        Button magBtn = new Button("3");
        Button cancelBtn = new Button("0");
        btnBox.getChildren().clear();
        btnBox.getChildren().add(strBtn);
        btnBox.getChildren().add(dexBtn);
        btnBox.getChildren().add(magBtn);
        updateSkillPoint();
        strBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                madifBtn = "str";
                skillPointsCounter();
            }

        });
        dexBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                madifBtn = "dex";
                skillPointsCounter();

            }

        });
        magBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                madifBtn = "mag";
                skillPointsCounter();
            }

        });
        cancelBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
            }

        });

    }

    private static void updateSkillPoint() {
        App.getScript().setText("Выбирите куда хотите потритить очки навыков \n"
                + "1. STR = " + Player.getSTR() + "\n"
                + "2. DEX = " + Player.getDEX() + "\n"
                + "3. MAG = " + Player.getMAG() + "\n"
                + "0. Выход ");

    }

    private static void skillPointsCounter() {
        if (Player.getSkillPoints() > 0) {
            if (madifBtn.equals("str")) {
                Player.setSTR(Player.getSTR() + 1);
            }
            if (madifBtn.equals("dex")) {
                Player.setDEX(Player.getDEX() + 1);
            }
            if (madifBtn.equals("mag")) {
                Player.setMAG(Player.getMAG() + 1);
            }
            Player.setSkillPoints(Player.getSkillPoints() - 1);
            SkillMenu.updateSkillPoint();
        } else {
            App.getScript().setText("У вас кончились очки навыков, для выхода из меню нажмите 4");
        }
    }
}
