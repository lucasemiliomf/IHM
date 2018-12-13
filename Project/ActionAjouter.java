package Exercice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionAjouter implements ActionListener{
	ZoneDessin zd;
	public ActionAjouter(ZoneDessin zd){
		this.zd = zd;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int r = (int) (Math.random()*255);
		int g = (int) (Math.random()*255);
		int b = (int) (Math.random()*255);
		Color C = new Color(r,g,b);
		int x = (int) (Math.random()*650);
		int y = (int) (Math.random()*450);
		int cote = (int) (50+Math.random()*(150-50));
		Carre A = new Carre(cote,x,y,C);
		zd.l.add(A);
		zd.repaint();
		
	}

}
