package com.example.hellolibgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class GameScreen implements Screen {
	
	MyGame game;
	Stage stage;
	Image bgImage;
	Image newImage;
	Image exitImage;
	
	
	public GameScreen(MyGame game) {
		super();
		this.game = game;
		
		stage = new Stage(480, 800, false);
		
		bgImage = new Image(Assets.bgRegion);
		bgImage.setSize(480, 800);
		
		newImage = new Image(Assets.newRegion);
		newImage.setPosition(30, 585);
		
		exitImage = new Image(Assets.exitRegion);
		exitImage.setPosition(110, 585);
		exitImage.setSize(Assets.newRegion.getRegionWidth(), Assets.newRegion.getRegionHeight());
		
		stage.addActor(bgImage);
		stage.addActor(exitImage);
		stage.addActor(newImage);
	}
	
	
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		stage.act();
		stage.draw();
	}
	

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(stage);
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
