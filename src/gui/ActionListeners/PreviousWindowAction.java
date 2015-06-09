package gui.ActionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.beans.PropertyVetoException;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.KeyStroke;

import singleton.MainFrame.MainFrame;

public class PreviousWindowAction extends AbstractAction {

	public PreviousWindowAction(String name){
		super(name);
		
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK + ActionEvent.SHIFT_MASK ));
		putValue(MNEMONIC_KEY, KeyEvent.VK_P);
		putValue(SHORT_DESCRIPTION, "Select Previous Window");
		putValue(SMALL_ICON, new ImageIcon("images/Player Previous.png"));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		MainFrame.getInstance().getDesktop().selectFrame(false);
		
		/*for(int i=0; i<allframes.length; i++){
			try{
			if(allframes[i].isSelected()){
				int prev=i-1;
				while (prev != i && allframes[prev].isIcon())
					prev--;

				if (prev == i) return;
				
				allframes[prev].setSelected(true);
				allframes[prev].toFront();
				return;
			}
				}
			catch (PropertyVetoException e) {
				
			}
		}*/
		
	}
}
