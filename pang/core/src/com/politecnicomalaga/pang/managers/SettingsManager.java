package com.politecnicomalaga.pang.managers;

public class SettingsManager {
    private static SettingsManager singleton;

    public static final short SCREEN_WIDTH = 1024;
    public static final short SCREEN_HEIGHT = 768;
    public static final String jugar="Jugar";

    public static SettingsManager getSingleton() {
        if (singleton == null) {
            singleton = new SettingsManager();
        }
        return singleton;
    }

}
