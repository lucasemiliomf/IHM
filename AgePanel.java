import javax.swing.*;

public class AgePanel {
	 public static void main(String[] args) {
		 Integer ages[] = new Integer[120];
		 int i;
		 for(i = 0; i < 120; i++) ages[i] = i;
		 int n = (Integer)JOptionPane.showInputDialog(null, "Votre age:",
				 "Age", JOptionPane.QUESTION_MESSAGE, null, ages, ages[20]);
		 System.out.println(n);
	}
}

   