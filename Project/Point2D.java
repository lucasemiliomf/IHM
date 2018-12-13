package Exercice;

public class Point2D {
	private int x, y;
	Point2D(){
		setPoint(0,0);
	}
	Point2D(int x, int y){
		setPoint(x,y);
	}
	void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void setX(int x) {
		this.x = x;
	}
	void setY(int y) {
		this.y = y;
	}
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	public String toString() {
		return "("+x+";"+y+")";
	}
}
