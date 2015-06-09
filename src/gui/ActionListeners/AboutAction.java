package gui.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;

import singleton.MainFrame.MainFrame;

public class AboutAction extends AbstractAction{
	
	public AboutAction(String name){
		super(name);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK+ActionEvent.SHIFT_MASK));
		putValue(MNEMONIC_KEY, KeyEvent.VK_A);
		putValue(SHORT_DESCRIPTION, "Information about application");
		putValue(SMALL_ICON, new ImageIcon("images/Info.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(MainFrame.getInstance(), "Nemanja Stojanovic AI7/2012       Marko Maletin AI12/2012", "About", JOptionPane.PLAIN_MESSAGE);
	}

}
