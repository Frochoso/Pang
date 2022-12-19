package com.politecnicomalaga.pang.managers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class AssetManager {
    public static final String FONDO_JUEGO = "screens/fondo.jpg";
    public static final String FONDO_INICIO = "screens/pantalla_inicial.png";
    private static Skin textSkin;
    private static String jugar="Jugar";
    public static final String JUGADOR_DCHA="andando";
    public static final String JUGADOR_IZQDA="andandoIZQ";
    public static final String ATLAS_FILE = "pang.atlas";
    public static final String BIG_FONT = "big-black";

    public static Skin getTextSkin() {
        if (textSkin == null) {
            textSkin = new Skin(Gdx.files.internal("sprites/glassy-ui.json"));
        }
        return textSkin;
    }
}
