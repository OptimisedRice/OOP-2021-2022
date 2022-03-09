package ie.tudublin;

import processing.core.PApplet;

public class Life extends PApplet {

	LifeBoard board;

	public void settings() {
		size(720, 720);
		board = new LifeBoard(360, this);
		board.randomise();
		//println(board.countCellsAround(1,1));
	}

	public void setup() {
		colorMode(RGB);

	}

	
	public void draw() {
		board.render();
		board.update();
	}
}
