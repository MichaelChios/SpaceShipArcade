package gui;

import java.awt.*;
import javax.swing.*;

public class SpaceFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	static int width;
	static int height;
	static StartingScreen startingScreen = new StartingScreen();
	static SelectSpaceShipScreen selectSpaceShipScreen = new SelectSpaceShipScreen();
	static GamePlayScreen gamePlayScreen = new GamePlayScreen();
	static GameOverScreen gameOverScreen = new GameOverScreen();
	static CardLayout cardLayout = new CardLayout();
	static JPanel spaceFramePanel = new JPanel();
	
	public SpaceFrame(int width, int height) {
		SpaceFrame.width = width;
		SpaceFrame.height = height;
		this.setSize(width, height);
		this.setTitle("Astra Game Simulation");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setFocusable(true);
		setupMasterPanel();
		setResizable(false);
		this.setVisible(true);
	}
	//Add a new screen
	void setupMasterPanel() {
		spaceFramePanel.setLayout(cardLayout);
		spaceFramePanel.add(startingScreen);
		spaceFramePanel.add(selectSpaceShipScreen);
		spaceFramePanel.add(gamePlayScreen);
		spaceFramePanel.add(gameOverScreen);
		this.add(spaceFramePanel);
	}
}
