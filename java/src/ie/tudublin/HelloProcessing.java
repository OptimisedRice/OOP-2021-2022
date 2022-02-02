package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		
	}
	public void draw()
	{	
		noStroke();
		background(255, 0, 0);
		fill(255, 200, 0);
		circle(250, 300, 400); // cx, cy, r
		fill(0, 255, 255);
		triangle(50, 450, 250, 50, 450, 450); // x1, y1, x2, y2, x3, y3
		fill(228, 228, 228);
		ellipse(250, 250, 190, 100); // cx, cy, w, h
		fill(0, 0, 0);
		circle(250, 250, 75);

		
		/*rectMode(CENTER);
		rect(300, 20, 100, 20); // tlx, tly, w, h

		rectMode(CORNER);
		rect(200, 20, 100, 20); // tlx, tly, w, h

		point(20, 300); */

		


	}
}
