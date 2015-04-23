package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Zadatak extends JFrame{

	public Zadatak(){
		super();
		 setTitle("Naslov_Zadatak");
		 setSize(800,800);
		 setLocationRelativeTo(null);
		 setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 setVisible(true);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			 
		 JPanel panTop=new JPanel();
		 panTop.setPreferredSize(new Dimension(100,30));
		 panTop.setBackground(Color.LIGHT_GRAY);
		 panTop.add(new JLabel("Ovo je obična labela"));
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			 
		 JPanel panLeft=new JPanel(new BorderLayout());
		 panLeft.setPreferredSize(new Dimension(100,100));
		 JTextArea area1=new JTextArea();
		 JScrollPane scrollPane = new JScrollPane(area1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
         panLeft.add(scrollPane,BorderLayout.CENTER);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 
		 JPanel panCenter=new JPanel(new BorderLayout(20,20));
		 panCenter.setBackground(Color.LIGHT_GRAY);
		 BoxLayout boxCenter=new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		 panCenter.setLayout(boxCenter);
		 
		 
		 
		 JSplitPane splitPane1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,panLeft,panCenter);
		 
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////			 
		 JPanel panBottom=new JPanel();
		 panBottom.setPreferredSize(new Dimension(100,30));
		 panBottom.setBackground(Color.LIGHT_GRAY);
		 BoxLayout box= new BoxLayout(panBottom, MAXIMIZED_HORIZ);
		 panBottom.setLayout(box);
		 for(int i=1; i<=5; i++){
			 JPanel pan2= new JPanel();
			 pan2.setBackground(Color.WHITE);
			 pan2.setBorder(BorderFactory.createRaisedBevelBorder());
			 pan2.add(new JLabel(""+i));
			 panBottom.add(pan2);
		 }
		 add(panTop,BorderLayout.NORTH);
		 add(splitPane1,BorderLayout.CENTER);
		 add(panBottom,BorderLayout.SOUTH);
	}
}
