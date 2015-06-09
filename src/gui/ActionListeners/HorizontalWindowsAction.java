package gui.ActionListeners;

import gui.MyInternalFrame;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

import singleton.MainFrame.MainFrame;

public class HorizontalWindowsAction extends AbstractAction {

	public HorizontalWindowsAction(String name){
		super(name);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		putValue(MNEMONIC_KEY, KeyEvent.VK_H);
		putValue(SHORT_DESCRIPTION, "Vertical Tile Windows mode");
		putValue(SMALL_ICON, new ImageIcon("images/Direction Horz.png"));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JInternalFrame[] allframes= MainFrame.getInstance().getDesktop().getAllFrames();
		int count=allframes.length;
		if (count==0) return;
		
		Dimension d=MainFrame.getInstance().getDesktop().getSize();
		int w=d.width/count;
		int h=d.height;
		int x=0;
		int y=0;
		
		for(int i=0; i<count; i++){
			
			allframes[i].reshape( x, y, w, h);
			x+=w;
		}
	
	}
}
