package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import sounds.*;

import main.*;

public class StartingScreen extends JPanel {
	private static final long serialVersionUID = 1L;
	GameAudioPlayer introSound = new GameAudioPlayer();
	public static Image img;
	static{
		try{
			StartingScreen.img=ImageIO.read(MainClass.class.getResource("../images/starwars.jpg"));
			StartingScreen.img=StartingScreen.img.getScaledInstance(800, 400, 0);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	StartingScreen() {
		this.setLayout(new BorderLayout(0, 0));
		this.add(createNorthPanel(), BorderLayout.NORTH);
		this.add(createCenterPanel(), BorderLayout.CENTER);
		this.add(createSouthPanel(), BorderLayout.SOUTH);
		introSound.loadStartingSound();
	}
	
	private JPanel createNorthPanel() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(Color.BLACK);
		return panel;
	}
	
	private JPanel createCenterPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		panel.setLayout(new GridLayout());
		label.setIcon(new ImageIcon(StartingScreen.img));
		panel.add(label);
		return panel;
	}
	
	private JPanel createSouthPanel() {
		JPanel panel = new JPanel();
		JButton btnStart = new JButton();
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(Color.BLACK);
		btnStart.addActionListener(new SpaceShipSelectionBtnHandler("START"));
		btnStart.setText("CLICK HERE TO PLAY");
		panel.add(btnStart);
		return panel;
	}
}
