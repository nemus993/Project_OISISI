package gui;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class MyMenu extends JMenuBar {

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public MyMenu () {
	
		JMenu novo = new JMenu("New");
		JMenu fajl= new JMenu("File");
		JMenuItem projekat= new JMenuItem("Project");
		JMenuItem diagram= new JMenuItem("Diagram");
		JMenuItem sacuvaj= new JMenuItem("Save");
		JMenuItem sacuvajkao= new JMenuItem("Save As...");
		JMenuItem stampaj= new JMenuItem("Print");
		JMenuItem stampaj2= new JMenuItem("Print Preview");
		JMenu uvezi= new JMenu("Import");
		JMenu izvezi= new JMenu("Export");
		JMenuItem izadji= new JMenuItem("Close");
		JMenuItem projekat2= new JMenuItem("Project");
		JMenuItem projekat3= new JMenuItem("Project");
		JMenuItem diagram2= new JMenuItem("Diagram");
		JMenuItem diagram3= new JMenuItem("Diagram");
		
		novo.add(projekat);
		novo.add(diagram);
		uvezi.add(projekat2);
		uvezi.add(diagram2);
		izvezi.add(projekat3);
		izvezi.add(diagram3);
		
		fajl.add(novo);
		fajl.addSeparator();
		fajl.add(sacuvaj);
		fajl.add(sacuvajkao);
		fajl.addSeparator();
		fajl.add(stampaj);
		fajl.add(stampaj2);
		fajl.addSeparator();
		fajl.add(uvezi);
		fajl.add(izvezi);
		fajl.addSeparator();
		fajl.add(izadji);
		
		fajl.setMnemonic(KeyEvent.VK_F);
		novo.setMnemonic(KeyEvent.VK_N);
		projekat.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_N, ActionEvent.ALT_MASK));
		diagram.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_D, ActionEvent.ALT_MASK));
		sacuvaj.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		stampaj.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		izadji.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_Q, ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JMenu edit= new JMenu("Edit");
		JMenuItem nazad= new JMenuItem("Undo");
		JMenuItem napred= new JMenuItem("Redo");
		JMenuItem brisi= new JMenuItem("Delete");
		
		edit.add(nazad);
		edit.add(napred);
		edit.addSeparator();
		edit.add(brisi);
		
		edit.setMnemonic(KeyEvent.VK_E);
		nazad.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		napred.setAccelerator(KeyStroke.getKeyStroke(
		        KeyEvent.VK_Y, ActionEvent.CTRL_MASK));
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JMenu prozor= new JMenu("Window");
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JMenu about= new JMenu("About");
		JMenuItem pomoc= new JMenuItem("Help");
		about.add(pomoc);
		
		about.setMnemonic(KeyEvent.VK_A);
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		this.add(fajl);
		this.add(edit);
		this.add(prozor);
		this.add(about);
		
		
		
		
		
	
	}	
}
