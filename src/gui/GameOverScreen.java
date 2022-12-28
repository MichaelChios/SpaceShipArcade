package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

import main.*;

public class GameOverScreen extends JPanel {
	private static final long serialVersionUID = 1L;
	public static Image img;
	static{
		try{
			GameOverScreen.img=ImageIO.read(MainClass.class.getResource("../images/gameover.jpg"));
			GameOverScreen.img=GameOverScreen.img.getScaledInstance(800, 400, 0);
		}
		catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	GameOverScreen() {
		this.setLayout(new BorderLayout(0, 0));
		this.add(createNorthPanel(), BorderLayout.NORTH);
		this.add(createCenterPanel(), BorderLayout.CENTER);
		this.add(createSouthPanel(), BorderLayout.SOUTH);
	}
	
	private JPanel createNorthPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel("<html><i>0.5€ → 1 Game <br>1€ → 2 Games <br>2€ → 5 Games</i><html>");
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(Color.BLACK);
		label.setFont(new Font("Arcade Classic", Font.PLAIN, 25));
		label.setForeground(Color.WHITE);
		panel.add(label);
		return panel;
	}
	
	private JPanel createCenterPanel() {
		JPanel panel = new JPanel();
		JLabel label = new JLabel();
		panel.setLayout(new GridLayout());
		label.setIcon(new ImageIcon(GameOverScreen.img));
		panel.add(label);
		return panel;
	}
	
	private JPanel createSouthPanel() {
		JPanel panel = new JPanel();
		JButton btnPlayAgain = new JButton();
		panel.setPreferredSize(new Dimension(100, 100));
		panel.setBackground(Color.BLACK);
		btnPlayAgain.addActionListener(new SpaceShipSelectionBtnHandler("PLAYAGAIN"));
		btnPlayAgain.setText("PLAY AGAIN");
		panel.add(btnPlayAgain);
		return panel;
	}
}
