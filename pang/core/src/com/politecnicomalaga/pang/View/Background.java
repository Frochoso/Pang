package com.politecnicomalaga.pang.View;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Background extends Actor {
    private int x,y;
    private Texture skin;

    public Background(int x,int y, Texture skin){
        this.x=x;
        this.y=y;
        this.skin=skin;
    }
}
