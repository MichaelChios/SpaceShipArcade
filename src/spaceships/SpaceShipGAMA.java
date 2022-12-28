package spaceships;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import main.*;

public class SpaceShipGAMA extends SpaceShip{
	public static Image img;
	static{
		try{
			SpaceShipGAMA.img=ImageIO.read(MainClass.class.getResource("../images/GAMA.png"));
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public SpaceShipGAMA() {
		super(Color.WHITE);
		step = 30;
		xCoords = 0;
		yCoords = MainClass.cosmosHeight-MainClass.SpaceShipHeight-MainClass.yOffset;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipGAMA.img);
	}
	
	public void printCoords() {
		System.out.println("SpaceShip GAMA: Xcoords: " + xCoords + " Ycoords: " + yCoords);
	}
}
