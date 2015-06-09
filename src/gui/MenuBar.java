package gui;

import gui.ActionListeners.AboutAction;
import gui.ActionListeners.CascadeWindowsAction;
import gui.ActionListeners.ExitProgramAction;
import gui.ActionListeners.HorizontalWindowsAction;
import gui.ActionListeners.NewProjectAction;
import gui.ActionListeners.NextWindowAction;
import gui.ActionListeners.OpenAction;
import gui.ActionListeners.PreviousWindowAction;
import gui.ActionListeners.PrintAction;
import gui.ActionListeners.SaveAction;
import gui.ActionListeners.VerticalWindowsAction;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuBar extends JMenuBar{
	
	public MenuBar (){
		
	    JMenu file=new JMenu("File");
	    file.setMnemonic(KeyEvent.VK_F);
	    JMenu miNew =new JMenu("New");
	    miNew.setMnemonic(KeyEvent.VK_N);
	    miNew.setIcon(new ImageIcon("images/Plus.png"));
	    Action newProject=new NewProjectAction("Project");
		JMenuItem miProject=new JMenuItem(newProject);
		JMenuItem miDiagram=new JMenuItem("Diagram");
		miDiagram.setIcon(new ImageIcon("images/Plus.png"));
		miDiagram.setMnemonic(KeyEvent.VK_D);
		miDiagram.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK +  ActionEvent.ALT_MASK));
	    
		miNew.add(miProject);
		miNew.add(miDiagram);
		
		Action opn=new OpenAction("Open...");
		JMenu miOpen =new JMenu(opn);
		JMenuItem openProject=new JMenuItem("Project");
		openProject.setMnemonic(KeyEvent.VK_P);
		JMenuItem openDiagram=new JMenuItem("Diagram");
		openDiagram.setMnemonic(KeyEvent.VK_D);
		miOpen.add(openProject);
		miOpen.add(openDiagram);
		Action save=new SaveAction("Save");
		JMenuItem miSave =new JMenuItem(save);
		JMenuItem miSaveAs =new JMenuItem("Save As...");
		miSaveAs.setMnemonic(KeyEvent.VK_A);
		miSaveAs.setIcon(new ImageIcon("images/Save.png"));
		miSaveAs.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK +  ActionEvent.ALT_MASK));
		Action print=new PrintAction("Print");
		JMenuItem miPrint =new JMenuItem(print);
		
		JMenu miImport=new JMenu("Import");
		miImport.setMnemonic(KeyEvent.VK_I);
		miImport.setIcon(new ImageIcon("images/Arrow1 Down.png"));
		JMenu miExport=new JMenu("Export");
		miExport.setMnemonic(KeyEvent.VK_O);
		miExport.setIcon(new ImageIcon("images/Arrow1 Up.png"));
		
		JMenuItem imProject=new JMenuItem("Project");
		imProject.setMnemonic(KeyEvent.VK_P);
		JMenuItem imDiagram=new JMenuItem("Diagram");
		imDiagram.setMnemonic(KeyEvent.VK_D);
		JMenuItem exProject=new JMenuItem("Project");
		exProject.setMnemonic(KeyEvent.VK_P);
		JMenuItem exDiagram=new JMenuItem("Diagram");
		exDiagram.setMnemonic(KeyEvent.VK_D);
		
		miImport.add(imProject);
		miImport.add(imDiagram);
		miExport.add(exProject);
		miExport.add(exDiagram);
		
		Action closeAction=new ExitProgramAction("Exit");
		JMenuItem close=new JMenuItem(closeAction);
					
		file.add(miNew);
		file.addSeparator();
		file.add(miOpen);
		file.addSeparator();
		file.add(miSave);
		file.add(miSaveAs);
		file.addSeparator();
		file.add(miPrint);
		file.addSeparator();
		file.add(miImport);
		file.add(miExport);
		file.addSeparator();
		file.add(close);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
		JMenu edit=new JMenu("Edit");
		edit.setMnemonic(KeyEvent.VK_E);
		JMenuItem undo =new JMenuItem("Undo");
		undo.setMnemonic(KeyEvent.VK_U);
	    undo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
	    undo.setIcon(new ImageIcon("images/Arrow2 Left.png"));
	    
		JMenuItem redo =new JMenuItem("Redo");
		redo.setMnemonic(KeyEvent.VK_R);
		redo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, ActionEvent.CTRL_MASK));
	    redo.setIcon(new ImageIcon("images/Arrow2 Right.png"));
	    
	    JMenuItem cut=new JMenuItem("Cut");
	    cut.setMnemonic(KeyEvent.VK_T);
	    cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
	    cut.setIcon(new ImageIcon("images/Clipboard Cut.png"));
	    JMenuItem copy=new JMenuItem("Copy");
	    copy.setMnemonic(KeyEvent.VK_C);
	    copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
	    copy.setIcon(new ImageIcon("images/Clipboard Copy.png"));
	    JMenuItem paste=new JMenuItem("Paste");
	    paste.setMnemonic(KeyEvent.VK_P);
	    paste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
	    paste.setIcon(new ImageIcon("images/Clipboard Paste.png"));
	    
	    JMenuItem selAll=new JMenuItem("Select All");
	    selAll.setMnemonic(KeyEvent.VK_A);
	    JMenuItem deAll=new JMenuItem("Deselect All");
	    deAll.setMnemonic(KeyEvent.VK_D);
		JMenuItem delete =new JMenuItem("Close/Delete");
		delete.setMnemonic(KeyEvent.VK_S);
		delete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		
		JMenuItem pref=new JMenuItem("Preferences");
		pref.setMnemonic(KeyEvent.VK_R);
		pref.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK + ActionEvent.ALT_MASK));
		
		edit.add(undo);
		edit.add(redo);
		edit.addSeparator();
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.add(delete);
		edit.addSeparator();
		edit.add(selAll);
		edit.add(deAll);
		edit.addSeparator();
		edit.add(pref);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
		JMenu view=new JMenu("View");
		view.setMnemonic(KeyEvent.VK_V);
		
		JMenu rotate=new JMenu("Rotate");
		rotate.setMnemonic(KeyEvent.VK_R);
		rotate.setIcon(new ImageIcon("images/Forward.png"));
		JMenuItem rot90cw=new JMenuItem("CW 90°");
		rot90cw.setIcon(new ImageIcon("images/Forward.png"));
		JMenuItem rot180cw=new JMenuItem("CW 180°");
		rot180cw.setIcon(new ImageIcon("images/Forward.png"));
		JMenuItem rot90ccw=new JMenuItem("CCW 90°");
		rot90ccw.setIcon(new ImageIcon("images/Back.png"));
		JMenuItem rot180ccw=new JMenuItem("CW 180°");
		rot180ccw.setIcon(new ImageIcon("images/Back.png"));
		rotate.add(rot90cw);
		rotate.add(rot180cw);
		rotate.add(rot90ccw);
		rotate.add(rot180ccw);
		
		JMenu zoom=new JMenu("Zoom");
		zoom.setMnemonic(KeyEvent.VK_Z);
		zoom.setIcon(new ImageIcon("images/Zoom In.png"));
		JMenuItem zoomin=new JMenuItem("Zoom In");
		zoomin.setMnemonic(KeyEvent.VK_I);
		zoomin.setIcon(new ImageIcon("images/Zoom In.png"));
		zoomin.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, ActionEvent.CTRL_MASK));
		JMenuItem zoomout=new JMenuItem("Zoom Out");
		zoomout.setMnemonic(KeyEvent.VK_O);
		zoomout.setIcon(new ImageIcon("images/Zoom Out.png"));
		zoomout.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, ActionEvent.CTRL_MASK));
		zoom.add(zoomin);
		zoom.add(zoomout);
		
		view.add(rotate);
		view.add(zoom);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
		JMenu window=new JMenu("Window");
		window.setMnemonic(KeyEvent.VK_W);
		Action cascadeAction=new CascadeWindowsAction("Cascade Windows");
		JMenuItem cascade=new JMenuItem(cascadeAction);
		Action vertAction=new VerticalWindowsAction("Tile Windows Verticaly");
		JMenuItem vert=new JMenuItem(vertAction);
		Action horizAction=new HorizontalWindowsAction("Tile Windows Horizontaly");
		JMenuItem horiz=new JMenuItem(horizAction);
		
		Action previous=new PreviousWindowAction("Previous Window");
		JMenuItem prev=new JMenuItem(previous);
		Action nxt=new NextWindowAction("Next Window");
		JMenuItem next=new JMenuItem(nxt);
		
		window.add(cascade);
		window.add(vert);
		window.add(horiz);
		window.addSeparator();
		window.add(prev);
		window.add(next);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
		JMenu tools=new JMenu("Tools");
		tools.setMnemonic(KeyEvent.VK_T);
		
		JMenuItem mov=new JMenuItem("Move");
		mov.setMnemonic(KeyEvent.VK_M);
		mov.setIcon(new ImageIcon("images/Directions.png"));
		JMenuItem crop=new JMenuItem("Crop");
		crop.setMnemonic(KeyEvent.VK_C);
		crop.setIcon(new ImageIcon("images/Crop.png"));
		JMenu draw=new JMenu("Draw");
		draw.setMnemonic(KeyEvent.VK_D);
		draw.setIcon(new ImageIcon("images/Line.png"));
		JMenuItem line=new JMenuItem("Line");
		line.setMnemonic(KeyEvent.VK_L);
		JMenuItem circle=new JMenuItem("Circle");
		circle.setMnemonic(KeyEvent.VK_I);
		JMenuItem rectangle=new JMenuItem("Rectangle");
		rectangle.setMnemonic(KeyEvent.VK_R);
		JMenuItem star=new JMenuItem("Star");
		star.setMnemonic(KeyEvent.VK_S);
		draw.add(line);
		draw.add(circle);
		draw.add(rectangle);
		draw.add(star);
		JMenuItem txt=new JMenuItem("Add Text");
		txt.setMnemonic(KeyEvent.VK_A);
		txt.setIcon(new ImageIcon("images/Text Large.png"));
		
		tools.add(mov);
		tools.add(crop);
		tools.add(draw);
		tools.add(txt);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////						
		JMenu help=new JMenu("Help");
		help.setMnemonic(KeyEvent.VK_H);
		Action aboutAction=new AboutAction("About...");
		JMenuItem about=new JMenuItem(aboutAction);
		
		help.add(about);
		
		add(file);
		add(edit);
		add(view);
		add(window);
		add(tools);
		add(help);
		
	}

}
