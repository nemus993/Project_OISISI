package gui.ActionListeners;


import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;



public class ExitProgramAction extends AbstractAction{
	
	public ExitProgramAction(String name) {
		super(name);
		putValue(ACCELERATOR_KEY,KeyStroke.getKeyStroke(
		        KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
		putValue(SHORT_DESCRIPTION, "Exit your application");
		putValue(MNEMONIC_KEY,KeyEvent.VK_X);
		}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}
