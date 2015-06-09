package gui.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class PrintAction extends AbstractAction {

	public PrintAction(String name){
		super(name);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		putValue(MNEMONIC_KEY, KeyEvent.VK_P);
		putValue(SHORT_DESCRIPTION, "Print preview");
		putValue(SMALL_ICON, new ImageIcon("images/Printer.png"));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
