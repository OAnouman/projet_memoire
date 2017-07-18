package com.prjmem.view.about;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import static com.prjmem.helpers.Globals.ABOUT_TEXT;

/**
 * About window controller
 * @author Martial Anouman
 */
public class AboutLayoutController {

    /*
        Controls form
     */
    @FXML private ImageView appIcon;
    @FXML private Label aboutTextLabel;

    /**
     * Reference to about dialog
     */
    private Stage aboutDialog;


    public AboutLayoutController(){}


    @FXML
    private void initialize(){

        appIcon.setImage(new Image("file:resources/images/iris_about.png",true));
        aboutTextLabel.setText(ABOUT_TEXT);
    }

    @FXML
    private void handleCloseButton(){
        aboutDialog.close();
    }







    /**
     * Getters and  Setters
     */
    public void setAboutDialog(Stage aboutDialog) {
        this.aboutDialog = aboutDialog;
    }
}
