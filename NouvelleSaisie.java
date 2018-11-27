import javax.swing.*;

public class NouvelleSaisie {
	public boolean getAnswer() {
		Object[] options = { "Nouvelle Saisie", "Terminer"};
		String title = "Choisir une option";
		String message = "Votre option : ";
		int choice = JOptionPane.showOptionDialog(null, title, message, JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		if (choice == JOptionPane.YES_OPTION) return true;
		return false;
	}
}
