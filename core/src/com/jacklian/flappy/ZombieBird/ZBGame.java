package com.jacklian.flappy.ZombieBird;

import com.badlogic.gdx.Game;
import com.jacklian.flappy.Screens.SplashScreen;
import com.jacklian.flappy.ZBHelpers.AssetLoader;

public class ZBGame extends Game {

	@Override
	public void create() {
		AssetLoader.load();
		setScreen(new SplashScreen(this));
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}

}