package com.prjmem.view.settings;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.stage.Stage;

import static com.prjmem.helpers.Globals.LOCAL_SAVE_DIR_DESC;
import static com.prjmem.helpers.Globals.REFRESH_INTERVAL_DESC;
import static com.prjmem.helpers.Globals.REMOTE_DIR_NAME_DESC;

public class SettingLayoutController {

    /**
     * Reference to settng stages
     */
    Stage settingStage;

    //Tab "Generaux"
    @FXML private TextField localSaveDirectoryField ;
    @FXML private TextField remoteDirectoryNameField;
    @FXML private TextField refreshIntervalField;



    public SettingLayoutController(){}

    @FXML
    private void initialie(){

        //Generaux tab
        //Setting fields
        localSaveDirectoryField.setTooltip(new Tooltip(LOCAL_SAVE_DIR_DESC));
        remoteDirectoryNameField.setTooltip(new Tooltip(REMOTE_DIR_NAME_DESC));
        refreshIntervalField.setTooltip(new Tooltip(REFRESH_INTERVAL_DESC));

    }

    @FXML
    private void handleCloseButton(){ settingStage.close();}



    // Setters and Getters

    public void setSettingStage(Stage settingStage) {
        this.settingStage = settingStage;
    }
}
