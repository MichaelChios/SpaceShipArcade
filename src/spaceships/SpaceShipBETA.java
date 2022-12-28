package spaceships;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import main.*;

public class SpaceShipBETA extends SpaceShip{
	public static Image img;
	static{
		try{
			SpaceShipBETA.img=ImageIO.read(MainClass.class.getResource("../images/BETA.png"));
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public SpaceShipBETA() {
		super(Color.PINK);
		step = 20;
		xCoords = 0;
		yCoords = MainClass.cosmosHeight-MainClass.SpaceShipHeight-MainClass.yOffset;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipBETA.img);
	}
	
	public void printCoords() {
		System.out.println("SpaceShip BETA: Xcoords: " + xCoords + " Ycoords: " + yCoords);
	}
}
