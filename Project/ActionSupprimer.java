package Exercice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionSupprimer implements ActionListener{
	ZoneDessin zd;
	public ActionSupprimer(ZoneDessin zd){
		this.zd = zd;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		zd.l.remove(zd.l.size()-1);
		zd.repaint();
		
	}

}
