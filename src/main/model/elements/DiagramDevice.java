package main.model.elements;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Paint;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.util.ArrayList;



public abstract class DiagramDevice extends DiagramElement {
	
	protected Dimension size;
	protected Point2D position;
	protected double scale;
	protected double rotation;

	protected int inputNo;
	protected int outputNo;
	
	protected ArrayList<InputOutputElement> inputs=new ArrayList<InputOutputElement>();
	protected ArrayList<InputOutputElement> outputs=new ArrayList<InputOutputElement>();
	
	public DiagramDevice(Point2D position, Dimension size, Stroke stroke, Paint paint,Color  strokeColor,int inputNo,int outputNo){
		super(stroke, paint,strokeColor);
		
		this.size=size;
		
		position.setLocation(position.getX()-size.getWidth()/2,position.getY()-size.getHeight()/2);
		this.position = position;
		this.inputNo=inputNo;
		this.outputNo=outputNo;
		this.strokeColor=strokeColor;
		this.scale=1;
		this.rotation=0;
	}
	
	public Point2D getPosition() {
		return position;
	}

	public void setPosition(Point2D position) {
		this.position = position;
	}

	public Dimension getInitSize(){
		return size;
	}


	public void setSize(Dimension size) {
		this.size = size;
	}
}
