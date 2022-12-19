package com.politecnicomalaga.pang.model;

import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

import com.politecnicomalaga.pang.managers.AssetManager;


public class Jugador extends Actor {
    private final Animation<TextureRegion> skin;
    private final Stage baseStage;
//    private final ShootManager Shooters;
//    private float shootTime = 0;

    public Jugador(Stage baseStage) {
        super();
//        Shooters = ShootManager.getSingleton();
        this.baseStage = baseStage;
        TextureAtlas atlas = new TextureAtlas("sprites/pang.atlas");
        skin = new Animation<TextureRegion>(0.25f, atlas.findRegions(AssetManager.JUGADOR_DCHA), Animation.PlayMode.LOOP);
        this.setBounds(0, 20, 32, 64);
        this.setX(512 - 16);
        this.setY(50);
    }

}
