package com.mygdx.game;

import java.util.Scanner;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

public class GameScreen extends ScreenAdapter{
	
	private GuitarGame guitarGame;
	Array<Rectangle> noteArray;
	Texture img;
	Song note;
	Texture pinRed,pinBlue,pinGreen,pinYellow,ember;
	int x,y;

	public GameScreen(GuitarGame guitargame)
	{
		this.guitarGame = guitargame;
		img = new Texture("badlogic.jpg");
		pinBlue = new Texture("note/bluePin.png");
		pinRed = new Texture("note/redPin.png");
		pinYellow = new Texture("note/yellowPin.png");
		pinGreen = new Texture("note/greenPin.png");
		ember = new Texture("note/Spark.png");
		x=500-25;
		y=500;
	}
	
	 public void render(float delta) {
		 	Gdx.gl.glClearColor(0, 0, 0, 1);
	        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	        SpriteBatch batch = guitarGame.batch;
	        batch.begin();
	        isKeyPress(batch);
	        batch.draw(pinBlue, 800-50, 50,100,100);
	        batch.draw(pinYellow, 600-50, 50,100,100);
	        batch.draw(pinRed, 400-50, 50,100,100);
	        batch.draw(pinGreen, 200-50, 50,100,100);
	        batch.end();
	   }
	 
	 
	 public void isKeyPress(SpriteBatch batch)
	 {
		 if(Gdx.input.isKeyPressed(Input.Keys.H))
		 {
			 batch.draw(ember,200-110,150,200,200);
		 }
		 if(Gdx.input.isKeyPressed(Input.Keys.J))
		 {
			 batch.draw(ember,400-110,150,200,200);
		 }
		 if(Gdx.input.isKeyPressed(Input.Keys.K))
		 {
			 batch.draw(ember,600-110,150,200,200);
		 }
		 if(Gdx.input.isKeyPressed(Input.Keys.L))
		 {
			 batch.draw(ember,800-110,150,200,200);
		 }
	 }
	 
	 public void spawnNote()
	 {
		 for(int i=0;i<3;i++)
		 {
			 
		 }
	 }
	 
	 
	 
}
