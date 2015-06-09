package gui.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.KeyStroke;

import singleton.MainFrame.MainFrame;

public class NewProjectAction extends AbstractAction {

	public NewProjectAction(String name){
		super(name);
		
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK ));
		putValue(MNEMONIC_KEY, KeyEvent.VK_P);
		putValue(SHORT_DESCRIPTION, "Create new project");
		putValue(SMALL_ICON, new ImageIcon("images/Folder2.png"));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		MainFrame.getInstance().createInternalFrame();
	}
}
