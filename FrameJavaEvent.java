package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameJavaEvent extends JFrame{
	
	

	public FrameJavaEvent() {
		

		setSize(new Dimension(500,80));
		setTitle("Java Event");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel panel=new JPanel();
		panel.setPreferredSize(new Dimension(500,80));
		BoxLayout box=new BoxLayout(panel, BoxLayout.X_AXIS);
		panel.setLayout(box);
		JPanel panLbl=new JPanel();
		JLabel lbl=new JLabel("Stampac: ");
		panLbl.add(lbl);
		JPanel panTxt=new JPanel();
		JTextField txt=new JTextField("HP LaserJet 5200 Q7543AA3");
		panTxt.setPreferredSize(new Dimension(200,40));
		txt.setPreferredSize(new Dimension(200,20));
		txt.setDisabledTextColor(Color.LIGHT_GRAY);
		txt.setEditable(false);
		txt.setBackground(Color.WHITE);
		panTxt.add(txt);
		panTxt.add(JavaEventListener.tekst);
		JButton btn=new JButton("Prikazi detalje");
		btn.setPreferredSize(new Dimension(100,80));
		
		btn.addActionListener(new JavaEventListener());
		panel.add(panLbl);
		panel.add(Box.createHorizontalStrut(30));
		panel.add(panTxt);
		panel.add(Box.createHorizontalStrut(30));
		panel.add(btn);
		panel.add(Box.createHorizontalStrut(10));
		add(panel);
    
	}
}
