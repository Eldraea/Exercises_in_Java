/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to JavaFX
------------------------------------------------------------------------------------------------------------------------
Created on 20/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 20/06/2021
------------------------------------------------------------------------------------------------------------------------
 */
/*
Main.java
------------------------------------------------------------------------------------------------------------------------
Created by Eldr@e@
------------------------------------------------------------------------------------------------------------------------
Introduction to JavaFX
------------------------------------------------------------------------------------------------------------------------
Created on 22/06/2021
------------------------------------------------------------------------------------------------------------------------
Last Update on: 22/06/2021
------------------------------------------------------------------------------------------------------------------------
 */

package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.OverrunStyle;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(10);
        root.setHgap(10);
        Label greetings = new Label("Welcome to JavaFX!!");
        greetings.setTextFill(Color.rgb(43,84,86));
        greetings.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
        root.getChildren().add(greetings);
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 700, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
