package com.prjmem.main;
/**
 * Created by MARTIAL ANOUMAN on 7/17/2017.
 */

import com.prjmem.helpers.LayoutLoader;
import com.prjmem.helpers.Result;
import com.prjmem.view.RootLayoutController;
import com.prjmem.view.home.HomeLayoutController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import static com.prjmem.helpers.Globals.APP_NAME;

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
        primaryStage.setTitle(APP_NAME);

        loadRootLayout();

        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    private void loadRootLayout(){
        //Loading RootLayout.fxml with LayoutLoader helper
        Result loaderResult = LayoutLoader.load("../view/RootLayout.fxml");
        BorderPane rootLayout = (BorderPane) loaderResult.getPane();

        //Load HomePaneLayout and adding it
        // in the rootLayout center position
        rootLayout.setCenter(loadHomePaneLayout());

        //Retrieve rootLayout controller
        RootLayoutController controller = loaderResult.getLoader().getController();
        controller.setMainApp(this);

        //Setting rootLayout as the scene
        // of primaryStage
        Scene scene = new Scene(rootLayout);
        scene.getStylesheets().add("file:resources/css/rootStyle.css");
        this.primaryStage.setScene(scene);
    }
    private AnchorPane loadHomePaneLayout(){

        Result loaderResult = LayoutLoader.load("../view/home/HomeLayout.fxml");
        AnchorPane homePaneLayout = (AnchorPane) loaderResult.getPane();
        HomeLayoutController controller = loaderResult.getLoader().getController();

        //Load and add ...
        // HomeHeaderLayout
        controller.setHeadSection(loadHomeHeaderLayout());
        //...Left middle section
        controller.setLeftMiddleSection(loadHomeLeftMiddleSection());
        //... Right middle ecction
        controller.setRightMiddleSection(loadHomeRightMiddleSection());

        return homePaneLayout;
    }

    private AnchorPane loadHomeHeaderLayout(){
        Result loaderResult = LayoutLoader.load("../view/home/HomeHeadLayout.fxml");

        return (AnchorPane) loaderResult.getPane();
    }
    
    private AnchorPane loadHomeLeftMiddleSection (){
        Result loaderResult = LayoutLoader.load("../view/home/HomeLeftMiddleLayout.fxml");

        return (AnchorPane) loaderResult.getPane();
    }

    private AnchorPane loadHomeRightMiddleSection (){
        Result loaderResult = LayoutLoader.load("../view/home/HomeRightMiddleLayout.fxml");

        return (AnchorPane) loaderResult.getPane();
    }
}
