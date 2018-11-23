import javax.swing.*;

public class NamePanel {
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog(null,"Prénom NOM","Entréee",JOptionPane.WARNING_MESSAGE);
		System.out.println("Merci "+name);
		
	}
}
