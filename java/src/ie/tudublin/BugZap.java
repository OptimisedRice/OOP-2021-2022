package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet
{
	float playerX, playerY, playerwidth;

	float bugX, bugY, bugwidth;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);

		smooth();
		playerX = width / 2;
		playerY = height - 50;
		playerwidth = 50;

		resetBug();

	}

	private void resetBug()
	{
		bugX = random(bugwidth / 2, width - (bugwidth / 2));
		bugY = 50;
		bugwidth = 50;
	}

	void drawBug(float x, float y, float w)
	{
		float halfw = w/2;
		stroke(255);
		noFill();
		triangle(x - halfw, y + halfw, x, y - halfw, x + halfw, y + halfw);
	}

	void drawPlayer(float x, float y, float w)
	{
		stroke(255);
		noFill();
		rectMode(CENTER);
		rect(x, y, w, 20);
		line(x,y - 10, x, y-20);

	}

	float playerSpeed = 5;

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			playerX -= playerSpeed;
		}
		if (keyCode == RIGHT)
		{
			playerX += playerSpeed;
		}
	}

	void moveBug()
	{
		bugY ++;
		bugX += random (-20, 20);
	}
	
	public void draw()
	{	
		background(0);
		strokeWeight(2);
		drawPlayer(playerX, playerY, playerwidth);
		drawBug(bugX, bugY, bugwidth);
		if (frameCount % 20 == 0)
		{
			moveBug();
		}
		
	}
}
