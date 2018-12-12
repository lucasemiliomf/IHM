import java.awt.Color;

public class Forme2D {
	private Point2D P;
	private Color C;
	
	// Constructors
	Forme2D(){
		this.P = new Point2D();
		this.C = new Color(0,0,255);
	}
	Forme2D(Point2D P){
		try {
			if(P.getX() < 0 || P.getY() < 0) throw new WrongOriginException();
			else this.P = P;
		}
		catch(WrongOriginException woe) {
			System.err.println(woe.getMessage());
		}
		this.C = new Color(0,0,255);
	}
	Forme2D(Color C){
		this.P = new Point2D();
		this.C= C;
	}
	Forme2D(Point2D P, Color C){
		try {
			if(P.getX() < 0 || P.getY() < 0) throw new WrongOriginException();
			else this.P = P;
		}
		catch(WrongOriginException woe) {
			System.err.println(woe.getMessage());
		}
		this.C = C;
	}
	
	
	// Setter and getters
	void setColor(int r, int g, int b) {
		this.C = new Color(r,g,b);
	}
	void setColor(Color C) {
		this.C = C;
	}
	Color getColor() {
		return this.C;
	}
	Point2D getOrigin() {
		return this.P;
	}
	double getX() {
		return this.P.getX();
	}
	double getY() {
		return this.P.getY();
	}
	
	// 
	void translation(Point2D P) {
		this.P = P;
	}
	public String toString() {
		return P.toString()+':'+getColor();
	}
	double surface() {
		return 0;
	}
}
