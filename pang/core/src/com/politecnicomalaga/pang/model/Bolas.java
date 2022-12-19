package com.politecnicomalaga.pang.model;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class Bolas extends Actor {
    //Atributos
    //Hay que representarlo mediante la textura adecuada y el cuerpo "Circle"

    //posiciones
    //velocidades
    //aceleración SOLO Y
    //radio

    //stage contenedor

    //Constructor
    public Bolas(float posX, float posY, Stage miContenedor) {
        //Hay que crear las bolas (sólo es necesario instanciar una) donde nos digan
        //pero la acelY es siempre 0.2 y la velY es 0 al principio.
    }
    //Comportamiento - Métodos


    @Override
    public void act(float delta) {
        super.act(delta);

        //Vamos a necesitar como otributos una velX que es constante, pero + o - y cambia
        //al tocar las paredes.
        //También una velY que empieza siendo 0. Pero que cuando actua el actor, cambia a
        //velY = velY - acelY
        //Hay que cambiar la velocidad si la bola llega al suelo (20 pixeles en Y). La velocidad
        //debe ser velY=radio * 0.10 - 6
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);

        //Aquí dibujamos la texture de la bola con respecto a su radio
    }
}
