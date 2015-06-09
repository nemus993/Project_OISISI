package gui.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class OpenAction extends AbstractAction {

	public OpenAction(String name){
		super(name);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		putValue(MNEMONIC_KEY, KeyEvent.VK_O);
		putValue(SHORT_DESCRIPTION, "Open...");
		putValue(SMALL_ICON, new ImageIcon("images/Folder3.png"));
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
