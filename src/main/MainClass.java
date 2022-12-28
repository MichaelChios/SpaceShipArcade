package main;

import gui.*;

public class MainClass {
	public static int cosmosWidth = 800;
	public static int cosmosHeight = 600;
	public static int SpaceShipWidth = 100;
	public static int SpaceShipHeight = 100;
	public static int yOffset = 30;
	public static SpaceFrame myShootingGame;
	public static void main(String[] args) {
		myShootingGame = new SpaceFrame (cosmosWidth, cosmosHeight);
	}
}
