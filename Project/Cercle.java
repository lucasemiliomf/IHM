package Exercice;

import java.awt.Graphics;

public class Cercle extends Forme2D{
	private int rayon;
	public Cercle(){
		rayon = 0;
	}
	public Cercle(int rayon){
		this.rayon = rayon;
	}
	public Cercle(int rayon, Point2D P){
		this.rayon = rayon;
		setPoint(P.getX(),P.getY());
	}
	
	@Override
	public double surface() {
		return rayon*rayon*Math.PI;
	}
	@Override
	public void dessine(Graphics g) {
	    g.setColor(getColor());
		g.drawOval(getX(), getX(), 2*rayon, 2*rayon);
	}
	@Override
	public String toString() {
		return "Cercle:"+super.toString()+":"+rayon+":"+surface();
	}
}
