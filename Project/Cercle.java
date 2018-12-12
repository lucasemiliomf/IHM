import java.awt.*;

public class Cercle extends Forme2D{
	private double rayon;
	Cercle(){
		rayon = 0;
	}
	Cercle(double rayon){
		this.rayon= rayon;
	}
	
	double surface() {
		return rayon*rayon*Math.PI;
	}

	public String toString() {
		return "Cercle:"+super.toString()+":"+rayon+":"+surface();
	}
}
