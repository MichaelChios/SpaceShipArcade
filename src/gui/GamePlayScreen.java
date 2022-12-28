package gui;

import java.awt.event.*;
import javax.swing.*;

import main.MainClass;
import spaceships.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;
import sounds.*;

public class GamePlayScreen extends JPanel implements KeyListener {
	private static final long serialVersionUID = 1L;
	private SpaceShip userSpaceShip;
	private SpaceShipENEMY enemySpaceShip;
	GameAudioPlayer soundObj = new GameAudioPlayer();
	
	GamePlayScreen(){
		addKeyListener(this);
		this.setVisible(true);
		this.setBackground(Color.BLACK);
		createDaemon();
	}
	
	void intGame(SpaceShip user) {
		userSpaceShip = user;
		enemySpaceShip = new SpaceShipENEMY();
	}
	
	private void createDaemon() {
		Timer timer = new Timer();
		TimerTask task = new monitorDaemonGame();
		timer.schedule(task, 100, 100);
	}
	
	class monitorDaemonGame extends TimerTask {
		public void run() {
			repaint();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		enemySpaceShip.huntUserSpaceShip(userSpaceShip);
		userSpaceShip.getIcon().paintIcon(this, g, userSpaceShip.getX(), userSpaceShip.getY());
		enemySpaceShip.getIcon().paintIcon(this, g, enemySpaceShip.getX(), enemySpaceShip.getY());
		showLaserShootings(g);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) {
			userSpaceShip.moveUP();
		}
		if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			userSpaceShip.moveDOWN();
		}
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			userSpaceShip.moveLEFT();
		}
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			userSpaceShip.moveRIGHT();
		}
		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			userSpaceShip.gun.fire(userSpaceShip.getX(), userSpaceShip.getY());
			soundObj.loadLaserSound();
		}
		this.repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {}
	
	@Override
	public void keyTyped(KeyEvent e) {}
	void setUserSpaceShip(SpaceShip user) {
		userSpaceShip = user;
	}
	
	private void showLaserShootings(Graphics g) {
		userSpaceShip.gun.laserShootersLinkedList.forEach((tmp)->{
			g.setColor(userSpaceShip.gun.lasercolor);
			g.drawLine(tmp.x, tmp.y, tmp.x, tmp.y-15);
			while(tmp.y<=MainClass.cosmosHeight) {
				tmp.y-=15;	// Shoot upwards
				if(tmp.y<=enemySpaceShip.getY()+MainClass.SpaceShipHeight-10 && tmp.x>=enemySpaceShip.getX() && tmp.x<=enemySpaceShip.getX()+MainClass.SpaceShipWidth) {
					SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
					soundObj.loadWinnerSound();
				}
				break;
			}
		});
		
		enemySpaceShip.gun.laserShootersLinkedList.forEach((tmp)->{
			g.setColor(enemySpaceShip.gun.lasercolor);
			g.drawLine(tmp.x, tmp.y, tmp.x, tmp.y+15);
			while(tmp.y<=MainClass.cosmosHeight) {
				tmp.y+=15;	// Shoot downwards
				if(tmp.y>=userSpaceShip.getY()+10 && tmp.x>=userSpaceShip.getX() && tmp.x<=userSpaceShip.getX()+MainClass.SpaceShipWidth) {
					SpaceFrame.cardLayout.next(SpaceFrame.spaceFramePanel);
					soundObj.loadDeadSound();
				}
				break;
			}
		});
		
	}
}
