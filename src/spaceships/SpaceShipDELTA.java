package spaceships;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import main.*;

public class SpaceShipDELTA extends SpaceShip{
	public static Image img;
	static{
		try{
			SpaceShipDELTA.img=ImageIO.read(MainClass.class.getResource("../images/DELTA.png"));
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public SpaceShipDELTA() {
		super(Color.YELLOW);
		step = 40;
		xCoords = 0;
		yCoords = MainClass.cosmosHeight-MainClass.SpaceShipHeight-MainClass.yOffset;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipDELTA.img);
	}
	
	public void printCoords() {
		System.out.println("SpaceShip DELTA: Xcoords: " + xCoords + " Ycoords: " + yCoords);
	}
}
