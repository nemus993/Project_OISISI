package gui;

import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class ToolBox extends JToolBar{

	public ToolBox() {
		super(SwingConstants.VERTICAL);
				
		JButton btnMove = new JButton();
		btnMove.setToolTipText("Move Tool");
		btnMove.setIcon(new ImageIcon("images/Directions.png"));
		add(btnMove);
		
		addSeparator();

		JButton btnCrop = new JButton();
		btnCrop.setToolTipText("Crop Tool");
		btnCrop.setIcon(new ImageIcon("images/Crop.png"));
		add(btnCrop);

		addSeparator();

		JButton btnLine = new JButton();
		btnLine.setToolTipText("New Line");
		btnLine.setIcon(new ImageIcon("images/Line.png"));
		add(btnLine);
		
		addSeparator();

		JButton btnRect = new JButton();
		btnRect.setToolTipText("New Rectangle");
		btnRect.setIcon(new ImageIcon("images/Rect.png"));
		add(btnRect);
		
		addSeparator();
		
		JButton btnTriangle = new JButton();
		btnTriangle.setToolTipText("New Triangle");
		btnTriangle.setIcon(new ImageIcon("images/Triangle.png"));
		add(btnTriangle);
		
		addSeparator();
		
		JButton btnCircle = new JButton();
		btnCircle.setToolTipText("New Circle");
		btnCircle.setIcon(new ImageIcon("images/Circle.png"));
		add(btnCircle);
		
		addSeparator();

		JButton btnStar = new JButton();
		btnStar.setToolTipText("New Star");
		btnStar.setIcon(new ImageIcon("images/Star.png"));
		add(btnStar);
		
		addSeparator();

		JButton btnText = new JButton();
		btnText.setToolTipText("Text Tool");
		btnText.setIcon(new ImageIcon("images/Text Large.png"));
		add(btnText);
		
		addSeparator();

		
		
		setFloatable(true);
		setBackground(new Color(100,100,100));
	}

}