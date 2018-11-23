import javax.swing.*;
import java.util.*;
import java.awt.Font;

public class MessageFinale {
	public static void main(String[] args) {
		JTextArea textArea = new JTextArea("Zone editable",10,10);
		textArea.setFont(new Font("Serif", Font.ITALIC, 16));
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true); //Afficher
		JOptionPane.showMessageDialog(null, textArea); //Remplacer ou affacer contenu
		textArea.setText("");
		JOptionPane.showMessageDialog(null, textArea); //Ajouter text
		textArea.append("Bonjour\n");
		textArea.append("Saisir\n");
		JOptionPane.showMessageDialog(null, textArea); //get
		String s = textArea.getText();
		System.out.println(s); //désactiver edition
		textArea.setEditable(false);
		JOptionPane.showMessageDialog(null, textArea);
	}
}