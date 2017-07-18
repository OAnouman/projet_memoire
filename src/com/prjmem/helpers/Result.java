package com.prjmem.helpers;

/**
 * Created by MARTIAL ANOUMAN on 7/17/2017.
 */

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

/**
 * Class for holding Layout loader result.
 * @author MArtial Anouman
 */
public class Result {

    private FXMLLoader loader;
    private Pane pane;

    public Result(FXMLLoader loader, Pane pane){

        this.loader = loader;
        this.pane = pane;
    }

    public FXMLLoader getLoader() {
        return loader;
    }

    public Pane getPane() {
        return pane;
    }
}
