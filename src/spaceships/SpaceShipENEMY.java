package spaceships;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import sounds.*;

import main.*;

public class SpaceShipENEMY extends SpaceShip{
	static Random random = new Random();
	public static Image img;
	GameAudioPlayer enemyLaserSound = new GameAudioPlayer();
	static{
		try{
			SpaceShipENEMY.img = ImageIO.read(MainClass.class.getResource("../images/ENEMY.png"));
			SpaceShipENEMY.img = SpaceShipENEMY.img.getScaledInstance(MainClass.SpaceShipWidth, MainClass.SpaceShipHeight, 0);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	public SpaceShipENEMY() {
		super(Color.MAGENTA);
		step = 15;
		xCoords = MainClass.cosmosWidth-MainClass.SpaceShipWidth;
		yCoords = MainClass.yOffset;
		super.SpaceShipImageIcon=new ImageIcon(SpaceShipENEMY.img);
	}
	
	public void huntUserSpaceShip(SpaceShip userSpaceShip) {
		int mv = random.nextInt(10);
		if (mv == 0) {
			this.gun.fire(this.getX(), this.getY()+100);
			enemyLaserSound.loadLaserSound();
		}
		if (userSpaceShip.xCoords > this.xCoords) {
			this.xCoords = this.moveRIGHT();
		}
		else {
			this.xCoords = this.moveLEFT();
		}
		
		int res = random.nextInt(4);
		if (res == 2) {
			this.moveLEFT();
		}
		if (res == 3) {
			this.moveRIGHT();
		}
	}
	
	public void printCoords() {
		System.out.println("SpaceShip ENEMY: Xcoords: " + xCoords + " Ycoords: " + yCoords);
	}
}
