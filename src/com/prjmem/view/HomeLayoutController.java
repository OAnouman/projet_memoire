package com.prjmem.view;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 * Created by MARTIAL ANOUMAN on 7/18/2017.
 * This class is responsible for Home UI managment
 * @author Martial Anouman
 */
public class HomeLayoutController {


    @FXML private BorderPane headSection;
    @FXML private BorderPane leftMiddleSection;
    @FXML private BorderPane rightMiddleSection;
    @FXML private BorderPane footerSection;

    public HomeLayoutController(){}

    @FXML
    private void initialize(){}

    public void setHeadSection(Pane child){
        this.headSection.setCenter(child);
    }

    public void setLeftMiddleSection(Pane leftMiddleSection) {
        this.leftMiddleSection.setCenter(leftMiddleSection);
    }

    public void setRightMiddleSection(Pane rightMiddleSection) {
        this.rightMiddleSection.setCenter(rightMiddleSection);
    }

    public void setFooterSection(Pane footerSection) {
        this.footerSection.setCenter(footerSection);
    }
}
