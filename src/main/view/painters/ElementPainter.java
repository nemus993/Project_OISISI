package main.view.painters;

import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.io.Serializable;

import main.model.elements.DiagramElement;

public abstract class ElementPainter implements Serializable {
	
	protected Shape shape;
	
	protected DiagramElement element;
	
	public ElementPainter(DiagramElement element){
		this.element=element;
	}
	
	public abstract void paint(Graphics2D g, DiagramElement element);
	
	public abstract boolean isElementAt(Point pos);

	public Shape getShape() {
		return shape;
	}

}
