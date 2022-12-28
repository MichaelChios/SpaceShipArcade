package sounds;

import javax.sound.sampled.*;
import main.*;

public class GameAudioPlayer {
	private AudioInputStream audioInputStream;
	Clip clip;
	
	public GameAudioPlayer() {
		// Do nothing
	}
	
	public void loadSpaceAmbient() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(MainClass.class.getResource("../audio/space-ambience.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.loop(Clip.LOOP_CONTINUOUSLY);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-15.0f);
			
			clip.start();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void loadStartingSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(MainClass.class.getResource("../audio/Star wars.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-15.0f);
			
			clip.start();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void loadSpaceShipSelection() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(MainClass.class.getResource("../audio/spaceShipSelection.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-15.0f);
			
			clip.start();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void loadLaserSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(MainClass.class.getResource("../audio/mixkit-short-laser-gun-shot-1670.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-15.0f);
			
			clip.start();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void loadDeadSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(MainClass.class.getResource("../audio/mixkit-laser-game-over-1946.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-15.0f);
			
			clip.start();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
	
	public void loadWinnerSound() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(MainClass.class.getResource("../audio/mixkit-game-level-completed-2059.wav"));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			
			FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
			gainControl.setValue(-15.0f);
			
			clip.start();
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
	}
}
