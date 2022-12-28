package spaceships;

import java.awt.*;
import java.util.LinkedList;
import javax.swing.*;
import main.*;
import spaceships_laserguns.*;

abstract public class SpaceShip implements Navigation{
	public int xCoords;
	public int yCoords;
	public int step;
	public LinkedList<Laser> laserShootersLinkedList = new LinkedList<Laser>();
	public Lasergun gun;
	protected ImageIcon SpaceShipImageIcon;
	
	SpaceShip(Color str){
		gun = new Lasergun(str);
	}
	
	public ImageIcon getIcon() {
		return SpaceShipImageIcon;
	}
	
	public int getX() {
		return xCoords;
	}
	
	public int getY() {
		return yCoords;
	}
	
	public int moveUP() {
		yCoords -= step;
		if (yCoords < MainClass.yOffset) {
			yCoords += step;
		}
		return yCoords;
	}
	
	public int moveDOWN() {
		yCoords += step;
		if (yCoords > MainClass.cosmosHeight - MainClass.SpaceShipHeight - MainClass.yOffset) {
			yCoords -= step;
		}
		return yCoords;
	}
	
	public int moveRIGHT() {
		xCoords += step;
		if (xCoords > MainClass.cosmosWidth - MainClass.SpaceShipWidth) {
			xCoords -= step;
		}
		return xCoords;
	}
	
	public int moveLEFT() {
		xCoords -= step;
		if (xCoords < 0) {
			xCoords += step;
		}
		return xCoords;
	}
	
	public void fire(int x, int y) {
		laserShootersLinkedList.add(laserShootersLinkedList.size(), new Laser(x, y));		
	}
	
	abstract public void printCoords();
}
