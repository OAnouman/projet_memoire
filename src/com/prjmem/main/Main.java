package com.prjmem.main;/**
 * Created by MARTIAL ANOUMAN on 7/17/2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    //Reference to primary Stage
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //Keep primary stage
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Iris Backup");



        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
