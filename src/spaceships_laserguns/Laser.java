package spaceships_laserguns;

import main.*;

public class Laser {
	public int x;
	public int y;
	
	public Laser(int x, int y){
		this.x = x + MainClass.SpaceShipWidth/2;
		this.y = y;
	}
}
