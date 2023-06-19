package handlers;

import client.view.ConnectView;

import javax.swing.*;
import java.io.IOException;

/**
 * ConnectViewThread makes a new thread object and when that thread runs, 
 *  it switches client's the current connect view to the welcome view and 
 *  also start the client so that the client could get the server messages.
 *
 */
public class ConnectViewThread extends Thread {
    private final ConnectView connectView;
    
    /**
     * Constructor
     * @param connectView the view that the client is originally in
     */
	public ConnectViewThread(ConnectView connectView) {
		this.connectView=connectView;
	}

	/**
	 *  Starts the client in a new ConnectView thread.
	 *  and start the client.
     *
	 */
	public void run() {
		
		try {
			connectView.getClient().start();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,
				    e.getMessage(),
				    "Error",
				    JOptionPane.ERROR_MESSAGE);
		} catch (IllegalArgumentException e1){
			JOptionPane.showMessageDialog(null,
				    "Illegal arguments",
				    "Error",
				    JOptionPane.ERROR_MESSAGE);
			e1.printStackTrace();
		}
	}
}


