package com.dev;

import com.files.FileListener;
import com.hero.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;
    private static Label script;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("main"), 640, 480);
        stage.setScene(scene);  
        stage.show();
        Stats.defaultStats();
        script = (Label)scene.lookup("#script");
        imitButton();
        initStats();
        //huis
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    } 
    private static void initStats(){
        Label hp = (Label)scene.lookup("#hp");
        Label maxHp = (Label)scene.lookup("#maxHp");
        Label stamina = (Label)scene.lookup("#stamina");
        Label maxStamina = (Label)scene.lookup("#maxStamina");
        Label mana = (Label)scene.lookup("#mana");
        Label maxMana = (Label)scene.lookup("#maxMana");

  
        hp.setText(String.valueOf(Player.getHp()));
        maxHp.setText(String.valueOf(Player.getMaxHp()));
        stamina.setText(String.valueOf(Player.getStamina()));
        maxStamina.setText(String.valueOf(Player.getMaxStamina()));
        mana.setText(String.valueOf(Player.getMana()));
        maxMana.setText(String.valueOf(Player.getMaxMana()));
       

    }
    private static void imitButton(){
        VBox btnBox = (VBox)scene.lookup("#actionBox");
        Button firstButton = new Button("1");
        Button secondButton = new Button("2");
        Button thirdButton = new Button("3");
        Button fourthButton = new Button("4");
        btnBox.getChildren().add(firstButton);
        btnBox.getChildren().add(secondButton);
        btnBox.getChildren().add(thirdButton);
        btnBox.getChildren().add(fourthButton);
        
        String path = "plot/start.txt";

        firstButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                script.setText(FileListener.textReading("start_1", path));
            }
            
        });
        secondButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                script.setText(FileListener.textReading("start_2", path));
                
            }
            
        });
        thirdButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                script.setText(FileListener.textReading("start_3", path));
                
            }
            
        });
        fourthButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                SkillMenu.showSkillMenu();
                
            }
            
        });

        }
public static Label getScript() {
    return script;
}
}

