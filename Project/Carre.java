
public class Carre extends Forme2D{
	private double cote;
	
	void setCote(double cote) {
		this.cote = cote;
	}
	public double getCote() {
		return cote;
	}
	double surface() {
		return cote*cote;
	}
	public String toString() {
		return "Carre:"+super.toString()+":"+cote+":"+surface();
	}
}
