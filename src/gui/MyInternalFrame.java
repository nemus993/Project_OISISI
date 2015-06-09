package gui;

import javax.swing.JInternalFrame;

public class MyInternalFrame extends JInternalFrame {

	static int openFrameCount=0;
	
	static final int xOffset = 30, yOffset = 30;
	
	public MyInternalFrame() {
		super("New project #" +(++openFrameCount), 
				true, //resiable
				true, //closeable
				true, //maximizable
				true);//iconifiable
		
		setSize(400,300);
		setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
		setVisible(true);
	}
}
