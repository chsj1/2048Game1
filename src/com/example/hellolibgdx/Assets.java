package com.example.hellolibgdx;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * 资源管理类
 * @author Administrator
 *
 */
public class Assets {
	static TextureAtlas atlas;
	static TextureRegion bgRegion;
	static TextureRegion newRegion;
	static TextureRegion exitRegion;
	
	public static void load(){
		atlas = new TextureAtlas(Gdx.files.internal("data/2048.txt"));
		
		bgRegion = atlas.findRegion("background");
		newRegion = atlas.findRegion("new");
		exitRegion = atlas.findRegion("exit");
	}
}
