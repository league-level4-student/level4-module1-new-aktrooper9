package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph {

	public MovingMorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
 x=x+10;
 
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
			g.setColor(Color.blue);
			g.fillRect(x, y, 50, 50);
		}

	}


