
public class Point2D {
	private double x, y;
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
	double getX() {
		return x;
	}
	double getY() {
		return y;
	}
	public String toString() {
		return "("+x+";"+y+")";
	}
}
