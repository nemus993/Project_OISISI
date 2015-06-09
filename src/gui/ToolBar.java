package gui;

import gui.ActionListeners.AboutAction;
import gui.ActionListeners.CascadeWindowsAction;
import gui.ActionListeners.HorizontalWindowsAction;
import gui.ActionListeners.NewProjectAction;
import gui.ActionListeners.NextWindowAction;
import gui.ActionListeners.OpenAction;
import gui.ActionListeners.PreviousWindowAction;
import gui.ActionListeners.PrintAction;
import gui.ActionListeners.SaveAction;
import gui.ActionListeners.VerticalWindowsAction;

import java.awt.Color;

import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class ToolBar extends JToolBar{

	public ToolBar(){
		
		super(SwingConstants.HORIZONTAL);
			
		Action newProject=new NewProjectAction("");
		JButton btnNew = new JButton(newProject);
		add(btnNew);
		
		JButton btnNewD = new JButton();
		btnNewD.setToolTipText("New Diagram");
		btnNewD.setIcon(new ImageIcon("images/Plus.png"));
		add(btnNewD);

		addSeparator();
		
		Action opn=new OpenAction("");
		JButton btnOpen = new JButton(opn);
		add(btnOpen);
		
		Action save=new SaveAction("");
		JButton btnSave = new JButton(save);
		add(btnSave);
	
		addSeparator();
		
		JButton btnImport = new JButton();
		btnImport.setToolTipText("Import Document");
		btnImport.setIcon(new ImageIcon("images/Arrow1 Down.png"));
		add(btnImport);
		
		JButton btnExport = new JButton();
		btnExport.setToolTipText("Export Document");
		btnExport.setIcon(new ImageIcon("images/Arrow1 Up.png"));
		add(btnExport);
		
		Action print=new PrintAction("");
		JButton btnPrint = new JButton(print);
		add(btnPrint);
		
		addSeparator();
		
		JButton btnUndo = new JButton();
		btnUndo.setToolTipText("Undo");
		btnUndo.setIcon(new ImageIcon("images/Arrow2 Left.png"));
		add(btnUndo);
		
		JButton btnRedo = new JButton();
		btnRedo.setToolTipText("Redo");
		btnRedo.setIcon(new ImageIcon("images/Arrow2 Right.png"));
		add(btnRedo);
		
		addSeparator();
		
		JButton btnCut = new JButton();
		btnCut.setToolTipText("Cut");
		btnCut.setIcon(new ImageIcon("images/Clipboard Cut.png"));
		add(btnCut);
		
		JButton btnCopy = new JButton();
		btnCopy.setToolTipText("Copy");
		btnCopy.setIcon(new ImageIcon("images/Clipboard Copy.png"));
		add(btnCopy);
		
		JButton btnPaste = new JButton();
		btnPaste.setToolTipText("Paste");
		btnPaste.setIcon(new ImageIcon("images/Clipboard Paste.png"));
		add(btnPaste);
		
		addSeparator();
		
		JButton btnRotateCCW = new JButton();
		btnRotateCCW.setToolTipText("Rotate Counterclockwise");
		btnRotateCCW.setIcon(new ImageIcon("images/Back.png"));
		add(btnRotateCCW);
		
		JButton btnRotateCW = new JButton();
		btnRotateCW.setToolTipText("Rotate Clockwise");
		btnRotateCW.setIcon(new ImageIcon("images/Forward.png"));
		add(btnRotateCW);
		
		JButton btnZoomIn = new JButton();
		btnZoomIn.setToolTipText("Zoom In");
		btnZoomIn.setIcon(new ImageIcon("images/Zoom In.png"));
		add(btnZoomIn);
		
		JButton btnZoomOut = new JButton();
		btnZoomOut.setToolTipText("Zoom Out");
		btnZoomOut.setIcon(new ImageIcon("images/Zoom Out.png"));
		add(btnZoomOut);
		
		addSeparator();
		
		Action cascadeAction=new CascadeWindowsAction("");
		JButton btnCascade = new JButton(cascadeAction);
		add(btnCascade);
		
		Action vert=new VerticalWindowsAction("");
		JButton btnVert = new JButton(vert);
		add(btnVert);
		
		Action horiz=new HorizontalWindowsAction("");
		JButton btnHor = new JButton(horiz);
		add(btnHor);
		
		Action previous=new PreviousWindowAction("");
		JButton btnPrev = new JButton(previous);
		add(btnPrev);
		
		Action nxt=new NextWindowAction("");
		JButton btnNext = new JButton(nxt);
		add(btnNext);
		
		addSeparator();
		Action aboutAction=new AboutAction("");
		JButton btnAbout = new JButton(aboutAction);
		add(btnAbout);
		
		setFloatable(false);
		setBackground(new Color(100,100,100));
	
	}

}
