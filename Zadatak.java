package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;


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
		 Dimension dim= new Dimension(200,30);
         
         JPanel panCenter=new JPanel();
		 panCenter.setBackground(Color.LIGHT_GRAY);
		 BoxLayout boxCenter=new BoxLayout(panCenter, BoxLayout.Y_AXIS);
		 panCenter.setLayout(boxCenter);
		 
		 JPanel panIme= new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblIme= new JLabel("Ime: ");
		 lblIme.setPreferredSize(dim);
		 
		 JTextField Ime= new JTextField();
		 Ime.setPreferredSize(dim);
		 
		 panIme.add(lblIme);
		 panIme.add(Ime);
		 
		 JPanel panPrezime= new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblPrezime= new JLabel("Prezime: ");
		 lblPrezime.setPreferredSize(dim);
		 
		 JTextField Prezime= new JTextField();
		 Prezime.setPreferredSize(dim);
		 
		 panPrezime.add(lblPrezime);
		 panPrezime.add(Prezime);
		 
		 JPanel panJMBG= new JPanel(new FlowLayout(FlowLayout.LEFT));
		 JLabel lblJMBG= new JLabel("JMBG: ");
		 lblJMBG.setPreferredSize(dim);
		 
		 JTextField JMBG= new JTextField();
		 JMBG.setPreferredSize(dim);
		 
		 panJMBG.add(lblJMBG);
		 panJMBG.add(JMBG);
		 
		 JPanel panDugmici= new JPanel();
		 BoxLayout buttons= new BoxLayout(panDugmici,BoxLayout.X_AXIS);
		 panDugmici.setLayout(buttons);
		 
		 JButton btnOk=new JButton("Ok");
		 btnOk.setPreferredSize(new Dimension(75,25));
		 JButton btnCancel=new JButton("Cancel");
		 btnCancel.setPreferredSize(new Dimension(75,25));
		 
		 panDugmici.add(Box.createGlue());
		 panDugmici.add(btnOk);
		 panDugmici.add(Box.createHorizontalStrut(20));
		 panDugmici.add(btnCancel);
		 panDugmici.add(Box.createHorizontalStrut(20));
		 
		 panCenter.add(panIme);
		 panCenter.add(panPrezime);
		 panCenter.add(panJMBG);
		 panCenter.add(panDugmici);
		 
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
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 
		 JPanel panRight= new JPanel();
		 BoxLayout boxRight= new BoxLayout(panRight, BoxLayout.Y_AXIS);
		 panRight.setLayout(boxRight);
		 
		 JButton btnHome=new JButton();
		 btnHome.setToolTipText("Home");
		 btnHome.setIcon(new ImageIcon(((new ImageIcon("images/home166.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		 JButton btnCloud=new JButton();
		 btnCloud.setToolTipText("Go to your Cloud");
		 btnCloud.setIcon(new ImageIcon(((new ImageIcon("images/cloudy.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		 JButton btnAdd=new JButton();
		 btnAdd.setToolTipText("Add File");
		 btnAdd.setIcon(new ImageIcon(((new ImageIcon("images/add13.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		 JButton btnFav=new JButton();
		 btnFav.setToolTipText("Favorites");
		 btnFav.setIcon(new ImageIcon(((new ImageIcon("images/favourite24.png")).getImage()).getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
		 
		 panRight.add(btnHome);
		 panRight.add(btnCloud);
		 panRight.add(btnAdd);
		 panRight.add(btnFav);
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 		 
		 add(panTop,BorderLayout.NORTH);
		 add(splitPane1,BorderLayout.CENTER);
		 add(panBottom,BorderLayout.SOUTH);
		 add(panRight,BorderLayout.EAST);
	}
}
