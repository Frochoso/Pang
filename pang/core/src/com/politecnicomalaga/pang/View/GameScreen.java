package com.politecnicomalaga.pang.View;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.politecnicomalaga.pang.model.Jugador;

import com.politecnicomalaga.pang.managers.AssetManager;

public class GameScreen implements Screen {

    private final Stage stage;
    private final Game game;
    private final Jugador player;
    private Animation<TextureRegion> skin;

    public GameScreen(Game aGame){
        skin=null;

        game = aGame;
        stage = new Stage(new ScreenViewport());

        Background fondo = new Background(0, 0,new Texture(AssetManager.FONDO_JUEGO));
        stage.addActor(fondo);

        Gdx.input.setInputProcessor(stage);
        player =new Jugador(stage);
        player.addCaptureListener(new InputListener(){
            public void clicked(InputEvent event, float x, float y, int pointer, int button) {
                //return true;
            }
            public void tocarIzqda(InputEvent event, float x, float y, int pointer, int button){
                if(x<player.getX()){
                    TextureAtlas atlas = new TextureAtlas(Gdx.files.internal(AssetManager.ATLAS_FILE));
                    skin = new Animation<TextureRegion>(0.25f, atlas.findRegions(AssetManager.JUGADOR_IZQDA), Animation.PlayMode.LOOP);

                }
            }
            public void tocarDcha(InputEvent event, float x, float y, int pointer, int button){
                if(x>player.getX()){
                    TextureAtlas atlas = new TextureAtlas(Gdx.files.internal(AssetManager.ATLAS_FILE));
                    skin = new Animation<TextureRegion>(0.25f, atlas.findRegions(AssetManager.JUGADOR_DCHA), Animation.PlayMode.LOOP);

                }
            }
        });
//        player.setTouchable(Touchable.enabled);
        stage.addActor(player);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
