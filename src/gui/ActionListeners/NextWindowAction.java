package gui.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

import singleton.MainFrame.MainFrame;

public class NextWindowAction extends AbstractAction {

	public NextWindowAction(String name){
		super(name);
		
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK ));
		putValue(MNEMONIC_KEY, KeyEvent.VK_N);
		putValue(SHORT_DESCRIPTION, "Select Next Window");
		putValue(SMALL_ICON, new ImageIcon("images/Player Next.png"));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		MainFrame.getInstance().getDesktop().selectFrame(true);
		
		/*for(int i=0; i<allframes.length; i++){
			try{
			if(allframes[i].isSelected()){
				int next=i+1;
				
				allframes[next].setSelected(true);
				allframes[next].toFront();
				return;
			}
				}
			catch (PropertyVetoException e) {
				
			}
		}*/
	}
}
