package gui.ActionListeners;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

import singleton.MainFrame.MainFrame;

public class CascadeWindowsAction extends AbstractAction {

	public CascadeWindowsAction(String name){
		super(name);
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		putValue(MNEMONIC_KEY, KeyEvent.VK_C);
		putValue(SHORT_DESCRIPTION, "Cascade Windows mode");
		putValue(SMALL_ICON, new ImageIcon("images/Database.png"));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JInternalFrame[] allframes= MainFrame.getInstance().getDesktop().getAllFrames();
		int count=allframes.length;
		if (count==0) return;
		
		Dimension d=MainFrame.getInstance().getDesktop().getSize();
		int w=d.width/3;
		int h=d.height/3;
		int x=0;
		int y=0;
		
		for(int i=0; i<count; i++){
			
			allframes[i].reshape( x, y, w, h);
			try{
			allframes[i].setSelected(true);
			}
			catch (PropertyVetoException e) {
				// TODO: handle exception
			}
			x+=30;
			y+=30;
		}
		
	}
}
