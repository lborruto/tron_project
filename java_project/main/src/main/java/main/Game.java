package main;

import javax.swing.JFrame;

public class Game {

	public Game() {
		
		JFrame window = new JFrame("TRON GAME");
		window.setContentPane(new GamePanel());
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.pack();
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}