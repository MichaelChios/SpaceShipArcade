package spaceships;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import main.*;

public class SpaceShipZERO extends SpaceShip{
	public static Image img;
	static{
		try{
			SpaceShipZERO.img=ImageIO.read(MainClass.class.getResource("../images/ZERO.png"));
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public SpaceShipZERO() {
		super(Color.RED);
		step = 5;
		xCoords = 0;
		yCoords = MainClass.cosmosHeight-MainClass.SpaceShipHeight-MainClass.yOffset;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipZERO.img);
	}
	
	public void printCoords() {
		System.out.println("SpaceShip ZERO: Xcoords: " + xCoords + " Ycoords: " + yCoords);
	}
}
