package client;

import client.view.MainWindow;

import javax.swing.*;

/**
 * The entry point of the Client side of the Collaborative Editor program.
 *
 */
public class ClientMain {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
		    public void run() {
		    	MainWindow main = new MainWindow();
				main.setVisible(true);
		    }
		});

	} 
}
