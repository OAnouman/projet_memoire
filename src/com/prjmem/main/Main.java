package com.prjmem.main;
/**
 * Created by MARTIAL ANOUMAN on 7/17/2017.
 */

import com.prjmem.helpers.LayoutLoader;
import com.prjmem.helpers.Result;
import com.prjmem.view.HomeLayoutController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    //Reference to primary Stage
    private Stage primaryStage;

    /**
     * Lunch the application
     * @param args data passed to the app
     */
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        //Keep primary stage
        this.primaryStage = primaryStage;
        primaryStage.setTitle("Iris Backup");

        loadRootLayout();

        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    private void loadRootLayout(){
        //Loading RootLayout.fxml with LayoutLoader helper
        Result loaerResult = LayoutLoader.load("../view/RootLayout.fxml");
        BorderPane rootLayout = (BorderPane) loaerResult.getPane();

        //Load HomePaneLayout and adding it
        // in the rootLayout center position
        rootLayout.setCenter(loadHomePaneLayout());

        //Setting rootLayout as the scene
        // of primaryStage
        this.primaryStage.setScene(new Scene(rootLayout));
    }
    private AnchorPane loadHomePaneLayout(){

        Result loaderResult = LayoutLoader.load("../view/HomeLayout.fxml");
        AnchorPane homePaneLayout = (AnchorPane) loaderResult.getPane();
        HomeLayoutController controller = loaderResult.getLoader().getController();

        //Load and add ...
        // HomeHeaderLayout
        controller.setHeadSection(loadHomeHeaderLayout());
        //...Left middle section
        controller.setLeftMiddleSection(loadHomeLeftMiddleSection());

        return homePaneLayout;

    }

    private AnchorPane loadHomeHeaderLayout(){
        Result loaderResult = LayoutLoader.load("../view/HomeHeadLayout.fxml");

        return (AnchorPane) loaderResult.getPane();;
    }
    
    private AnchorPane loadHomeLeftMiddleSection (){
        Result loaderResult = LayoutLoader.load("../view/HomeLeftMiddleLayout.fxml");

        return (AnchorPane) loaderResult.getPane();
    }
}
