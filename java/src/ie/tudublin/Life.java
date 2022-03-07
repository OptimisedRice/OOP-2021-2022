package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

	

	public void settings() {
		size(500, 500);
		board = new Board(100, this);
		board.randomise;
	}

	public void setup() {
		colorMode(HSB);

	}

	
	public void draw() {
		board.render();
	}
}
