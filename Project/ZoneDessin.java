package Exercice;

import java.awt.Component;
import java.awt.Graphics;
import java.util.ArrayList;

public class ZoneDessin extends Component{
	ArrayList<Forme2D> l;
	public ZoneDessin() {
		super();
		repaint();
        l = new ArrayList<Forme2D>();
	}
	
	public void paint(Graphics g){
			for(Forme2D f: l) {
				f.dessine(g);
		}
	}
}

