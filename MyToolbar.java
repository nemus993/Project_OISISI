package gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class MyToolbar extends JToolBar  {

	
	public MyToolbar() {
		
		super(SwingConstants.HORIZONTAL);
		
		JButton novo= new JButton();
		novo.setToolTipText("New");
		novo.setIcon (new ImageIcon ((new ImageIcon("images/round75.png").getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		this.add(novo);
//////////////////////////////////////////////////////////////////////////////////////////////////
		this.addSeparator();
//////////////////////////////////////////////////////////////////////////////////////////////////
		JButton open= new JButton();
		open.setToolTipText("Open");
		open.setIcon(new ImageIcon ((new ImageIcon("images/expand43.png").getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		this.add(open);
//////////////////////////////////////////////////////////////////////////////////////////////////
		this.addSeparator();
//////////////////////////////////////////////////////////////////////////////////////////////////
		JButton zoomin= new JButton();
		zoomin.setToolTipText("Zoom In");
		zoomin.setIcon(new ImageIcon ((new ImageIcon("images/zoom72.png").getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		this.add(zoomin);
//////////////////////////////////////////////////////////////////////////////////////////////////
		this.addSeparator();
//////////////////////////////////////////////////////////////////////////////////////////////////
		JButton zoomout= new JButton();
		zoomout.setToolTipText("Zoom Out");
		zoomout.setIcon(new ImageIcon ((new ImageIcon("images/zoom71.png").getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		this.add(zoomout);
//////////////////////////////////////////////////////////////////////////////////////////////////
		this.addSeparator();
//////////////////////////////////////////////////////////////////////////////////////////////////
		JButton brisi= new JButton();
		brisi.setToolTipText("Delete");
		brisi.setIcon(new ImageIcon ((new ImageIcon("images/delete85.png").getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		this.add(brisi);
		
		setFloatable(true);
		setBackground(new Color(255,255,204));
		
	}
}
