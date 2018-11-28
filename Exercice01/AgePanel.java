import javax.swing.*;
import java.util.*;

public class AgePanel {
	int year = Calendar.getInstance().get(Calendar.YEAR);
	int age;
	 public void setAge() {
		 Integer ages[] = new Integer[120];
		 int i;
		 for(i = 0; i < 120; i++) ages[i] = i;
		 int n = (Integer)JOptionPane.showInputDialog(null, "Votre age:",
				 "Age", JOptionPane.QUESTION_MESSAGE, null, ages, ages[20]);
		 System.out.println(n);
		 age = n;
	 }
	 public int getAge() {
		 return age;
	 }
	 public int getAnnee() {
		 return year-age;
	 }
}

   
