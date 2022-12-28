package spaceships;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import main.*;

public class SpaceShipALPHA extends SpaceShip{
	public static Image img;
	static{
		try{
			SpaceShipALPHA.img=ImageIO.read(MainClass.class.getResource("../images/ALPHA.png"));
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public SpaceShipALPHA() {
		super(Color.BLUE);
		step = 10;
		xCoords = 0;
		yCoords = MainClass.cosmosHeight-MainClass.SpaceShipHeight-MainClass.yOffset;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipALPHA.img);
	}
	
	public void printCoords() {
		System.out.println("SpaceShip ALPHA: Xcoords: " + xCoords + " Ycoords: " + yCoords);
	}
}
