import javax.swing.*;

public class NamePanel {
	String prenom, nom;
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public void setNomPrenom() {
		String name = JOptionPane.showInputDialog(null,"Prénom NOM","Entréee",JOptionPane.WARNING_MESSAGE);
		System.out.println("Merci "+name);
		String[] splitted= name.split(" ");
		setPrenom(splitted[0]);
		setNom(splitted[1]);
	}
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public String getInitials() {
		char iniPrenom = prenom.charAt(0);
		char iniNom = nom.charAt(0);
		String initials = "" + iniPrenom + "." + iniNom + ".";
		return initials;
	}
}
