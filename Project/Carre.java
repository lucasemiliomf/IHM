package Exercice;

import java.awt.Color;
import java.awt.Graphics;

public class Carre extends Forme2D{
	private int cote;
	
	public Carre(int cote){
		setCote(cote);
	}
	public Carre(int cote, int x, int y){
		setCote(cote);
		setPoint(x,y);
	}
	public Carre(int cote, int x, int y, Color C){
		setCote(cote);
		setPoint(x,y);
		setColor(C);
	}
	void setCote(int cote) {
		this.cote = cote;
	}
	public int getCote() {
		return cote;
	}
	@Override
	public double surface() {
		return cote*cote;
	}
	public void dessine(Graphics g) {
	    g.setColor(getColor());
		g.drawRect(getX(), getY(), cote, cote);
	}
	public String toString() {
		return "Carre:"+super.toString()+":"+cote+":"+surface();
	}
}
