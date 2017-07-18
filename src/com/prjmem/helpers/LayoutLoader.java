package com.prjmem.helpers;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.net.URL;

/**
 * Created by MARTIAL ANOUMAN on 7/17/2017.
 *
 * @author Martial Anouman
 */
public class LayoutLoader {


    @Nullable
    public static Result load(String path){

        //Creating url from file path
        URL url = LayoutLoader.class.getResource(path);

        //Creating FXMLLoader with url
        FXMLLoader loader = new FXMLLoader(url);
        Pane pane ;
        try{
            pane = loader.load();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }

        return new Result(loader, pane);
    }

}
