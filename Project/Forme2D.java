package Exercice;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Forme2D {
	private Point2D P;
	private Color C;
	private int nombreFormes = 0;
	
	// Constructors
	public Forme2D(){
		this.P = new Point2D();
		setColor(java.awt.Color.blue);
		nombreFormes++;
	}
	public Forme2D(Point2D P){
		try {
			if(P.getX() < 0 || P.getY() < 0) throw new WrongOriginException();
			else this.P = P;
		}
		catch(WrongOriginException woe) {
			System.err.println(woe.getMessage());
			if(P.getX() < 0) P.setX(-P.getX());
			if(P.getY() < 0) P.setY(-P.getY());
		}
		setColor(java.awt.Color.blue);
		nombreFormes++;
	}
	public Forme2D(Color C){
		this.P = new Point2D();
		setColor(C);
		nombreFormes++;
	}
	public Forme2D(Point2D P, Color C){
		try {
			if(P.getX() < 0 || P.getY() < 0) throw new WrongOriginException();
			else this.P = P;
		}
		catch(WrongOriginException woe) {
			System.err.println(woe.getMessage());
			if(P.getX() < 0) P.setX(-P.getX());
			if(P.getY() < 0) P.setY(-P.getY());
		}
		setColor(C);
		nombreFormes++;
	}
	
	// Setter and getters
	public void setColor(int r, int g, int b) {
		this.C = new Color(r,g,b);
	}
	public void setColor(Color C) {
		this.C = C;
	}
	void setPoint(int x, int y) {
		P.setX(x);
		P.setY(y);
	}
	public Color getColor() {
		return this.C;
	}
	public Point2D getOrigin() {
		return this.P;
	}
	public int getX() {
		return this.P.getX();
	}
	public int getY() {
		return this.P.getY();
	}
	public int getNombreFormes() {
		return nombreFormes;
	}
	
	// 
	public void translation(Point2D P) {
		this.P = P;
	}
	public String toString() {
		return P.toString()+':'+getColor();
	}
	public abstract double surface();
	public abstract void dessine(Graphics g);
	
}
