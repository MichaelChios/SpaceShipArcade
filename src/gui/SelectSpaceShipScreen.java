package gui;

import javax.swing.*;
import spaceships.*;
import java.awt.*;
import sounds.*;

public class SelectSpaceShipScreen extends JPanel{
	private static final long serialVersionUID = 1L;
	GameAudioPlayer ambienceSound = new GameAudioPlayer();
	
	SelectSpaceShipScreen() {
		this.setLayout(new BorderLayout(30, 30));
		this.add(createNorthPanel(), BorderLayout.NORTH);
		this.add(createCenterPanel(), BorderLayout.CENTER);
		this.add(createSouthPanel(), BorderLayout.SOUTH);
		ambienceSound.loadSpaceAmbient();
	}
	
	private void makeBtnsTransparent(JButton x) {
		x.setOpaque(true);
		x.setContentAreaFilled(false);
		x.setBorderPainted(false);
		
	}
	
	private JPanel createNorthPanel() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 100));
		JLabel label = new JLabel("Please choose your Spaceship: ");
		label.setFont(new Font("Arcade Classic", Font.PLAIN, 25));
		label.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		panel.add(label);
		return panel;
	}
	
	private JPanel createCenterPanel() {
		JButton btnSpaceShipZero = new JButton();
		JButton btnSpaceShipAlpha = new JButton();
		JButton btnSpaceShipBeta = new JButton();
		JButton btnSpaceShipGama = new JButton();
		JButton btnSpaceShipDelta = new JButton();
		
		btnSpaceShipZero.addActionListener(new SpaceShipSelectionBtnHandler("SZERO"));
		btnSpaceShipAlpha.addActionListener(new SpaceShipSelectionBtnHandler("SALPHA"));
		btnSpaceShipBeta.addActionListener(new SpaceShipSelectionBtnHandler("SBETA"));
		btnSpaceShipGama.addActionListener(new SpaceShipSelectionBtnHandler("SGAMA"));
		btnSpaceShipDelta.addActionListener(new SpaceShipSelectionBtnHandler("SDELTA"));
		
		btnSpaceShipZero.setIcon(new ImageIcon(SpaceShipZERO.img));
		btnSpaceShipAlpha.setIcon(new ImageIcon(SpaceShipALPHA.img));
		btnSpaceShipBeta.setIcon(new ImageIcon(SpaceShipBETA.img));
		btnSpaceShipGama.setIcon(new ImageIcon(SpaceShipGAMA.img));
		btnSpaceShipDelta.setIcon(new ImageIcon(SpaceShipDELTA.img));
		
		makeBtnsTransparent(btnSpaceShipZero);
		makeBtnsTransparent(btnSpaceShipAlpha);
		makeBtnsTransparent(btnSpaceShipBeta);
		makeBtnsTransparent(btnSpaceShipGama);
		makeBtnsTransparent(btnSpaceShipDelta);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		panel.setBackground(Color.BLACK);
		panel.add(btnSpaceShipZero);
		panel.add(btnSpaceShipAlpha);
		panel.add(btnSpaceShipBeta);
		panel.add(btnSpaceShipGama);
		panel.add(btnSpaceShipDelta);
		
		return panel;
	}

	private JPanel createSouthPanel() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(Color.BLACK);
		return panel;
	}
}
