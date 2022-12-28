package gui;

import java.awt.event.*;
import spaceships.*;
import sounds.*;

public class SpaceShipSelectionBtnHandler implements ActionListener {
	String name;
	GameAudioPlayer selectionSound = new GameAudioPlayer();
	
	public SpaceShipSelectionBtnHandler(String x) {
		name = x;
	}
	
	public void actionPerformed(ActionEvent ev) {
		SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
		SpaceFrame.gamePlayScreen.setFocusable(true);			// In order to catch key events
		SpaceFrame.gamePlayScreen.requestFocus();
		
		if(name.equalsIgnoreCase("SZERO")) {
			SpaceFrame.gamePlayScreen.intGame(new SpaceShipZERO());
			selectionSound.loadSpaceShipSelection();
		}
		if(name.equalsIgnoreCase("SALPHA")) {
			SpaceFrame.gamePlayScreen.intGame(new SpaceShipALPHA());
			selectionSound.loadSpaceShipSelection();
		}
		if(name.equalsIgnoreCase("SBETA")) {
			SpaceFrame.gamePlayScreen.intGame(new SpaceShipBETA());
			selectionSound.loadSpaceShipSelection();
		}
		if(name.equalsIgnoreCase("SGAMA")) {
			SpaceFrame.gamePlayScreen.intGame(new SpaceShipGAMA());
			selectionSound.loadSpaceShipSelection();
		}
		if(name.equalsIgnoreCase("SDELTA")) {
			SpaceFrame.gamePlayScreen.intGame(new SpaceShipDELTA());
			selectionSound.loadSpaceShipSelection();
		}
		if(name.equalsIgnoreCase("PLAYAGAIN")) {
			SpaceFrame.cardLayout.show(SpaceFrame.spaceFramePanel, "selectSpaceShipScreen");
		}
		if(name.equalsIgnoreCase("START")) {
			SpaceFrame.cardLayout.show(SpaceFrame.spaceFramePanel, "startingScreen");
		}
	}
}
