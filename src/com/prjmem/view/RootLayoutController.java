package com.prjmem.view;

import com.prjmem.helpers.LayoutLoader;
import com.prjmem.helpers.Result;
import com.prjmem.main.Main;
import com.prjmem.view.about.AboutLayoutController;
import com.prjmem.view.home.HomeLayoutController;
import com.prjmem.view.settings.SettingLayoutController;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * This class is responsible for RootLayout.
 * Manage applicaion main menu
 */
public class RootLayoutController {


    /**
     * Main menu
     */
    @FXML private MenuBar mainMenu;
    @FXML private MenuItem aboutMenuItem;
    @FXML private MenuItem settingsMenuItem;


    /**
     * ToolBar buttosns
     */
    @FXML private ToolBar toolBar;
    @FXML private Button siteManagerTb;

    /**
     * We need reference to HomeLayout controller
     */
    HomeLayoutController homeController;

    /**
     * Reerence to Main class
     */
    private Main mainApp ;


    public RootLayoutController (){}

    @FXML
    private void initialize(){

        /*
         * ToolBar buttons
         */
        siteManagerTb.setText(null);
        siteManagerTb.setGraphic(new ImageView(new Image("file:resources/images/gest_site.png")));



    }

    @FXML
    private void handleAboutMenu(){
        Stage aboutWindow = new Stage();
        aboutWindow.initOwner(mainApp.getPrimaryStage());

        Result result = LayoutLoader.load("../view/about/AboutLayout.fxml");
        aboutWindow.setScene(new Scene(
                result.getPane()
        ));

        AboutLayoutController controller = result.getLoader().getController();

        //Pass a reference to aboutWindow
        //to be able to manipulate it in the AboutController
        controller.setAboutDialog(aboutWindow);

        aboutWindow.setTitle("A Propos de Iris Backup");
        aboutWindow.showAndWait();
    }

    @FXML
    private void handleSettings(){
        Stage settingsStage = new Stage();
        settingsStage.initOwner(mainApp.getPrimaryStage());

        Result result = LayoutLoader.load("../view/settings/SettingLayout.fxml");
        settingsStage.setScene(new Scene(result.getPane()));

        SettingLayoutController controller = result.getLoader().getController();
        controller.setSettingStage(settingsStage);

        settingsStage.setTitle("Paramètres");
        settingsStage.showAndWait();

    }


    //Setters / Getters

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
}
