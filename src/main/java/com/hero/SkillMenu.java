package com.hero;

import com.dev.App;

import javafx.scene.control.Button;

public class SkillMenu {

    public static void showSkillMenu(){
       App.getScript().setText("Выбирите куда хоити потритить очки навыков \n" 
            + "1. STR = " + Player.getSTR() +"\n"
            + "2. DEX = " + Player.getDEX() + "\n"
            + "3. MAG = " + Player.getMAG());
        
    }

}
