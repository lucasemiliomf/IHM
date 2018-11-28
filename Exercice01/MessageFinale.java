import javax.swing.*;

public class MessageFinale {
	public static void main(String[] args) {
		NamePanel name = new NamePanel();
		AgePanel age = new AgePanel();
		NouvelleSaisie answer = new NouvelleSaisie();
		JTextArea jt = new JTextArea(3,50);
		do {
			name.setNomPrenom();
			age.setAge();
			jt.append("Nom : "+name.getNom()+"\n");
			jt.append("Prenom : "+name.getPrenom()+"\n");
			jt.append("Initiales : "+name.getInitials()+"\n");
			jt.append("Année de Naissance: "+age.getAnnee()+"\n");
		}while(answer.getAnswer());
		JOptionPane.showMessageDialog(null, jt);
	}
}
