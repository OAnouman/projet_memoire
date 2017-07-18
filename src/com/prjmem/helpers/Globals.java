package com.prjmem.helpers;

/**
 * This class contains all statics values
 *
 * @author Martial Anouman
 */
public  class Globals {


    /**
     * App name
     */
    public static final String APP_NAME = "Iris Backup";

    /**
     * About dialog text
     */
    public static final String ABOUT_TEXT =
            Globals.APP_NAME + " est un projet de fin d'étude. \n" +
                    "Cette application permet de faire des sauvegardes automatiques sur un serveur ftp distant.\n" +
                    "\nDéveloppeurs : \n" +
                    "\tMartial Anouman\n" +
                    "\tEric Kouadjo" ;

    public static final String LOCAL_SAVE_DIR_DESC = "Répertoire local à sauvegarder.";

    public static final String REMOTE_DIR_NAME_DESC = "Nom du répertoire distant.";

    public static final String REFRESH_INTERVAL_DESC = "Temps de rafraichissement du répertoire local en seconde.";
}
