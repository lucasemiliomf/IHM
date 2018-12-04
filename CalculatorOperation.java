package Calculator;

public class CalculatorOperation {
	String exp = new String();
	
	void setExp(String exp) {
		this.exp = exp;
	}
	
	void calcula(String exp, char op) {
		if(op == '+'){
			String[] splitted = exp.split("[+]");
			try {
				float num1 = Float.parseFloat(splitted[0]);
				float num2 = Float.parseFloat(splitted[1]);
				float num = num1 + num2;
				this.exp = String.valueOf(num);
			}
			catch(NumberFormatException nfe) {
				System.out.println("Error");
			}
			
		}
		if(op == '-'){
			String[] splitted = exp.split("[-]");
			try {
				float num1 = Float.parseFloat(splitted[0]);
				float num2 = Float.parseFloat(splitted[1]);
				float num = num1 - num2;
				this.exp = String.valueOf(num);
			}
			catch(NumberFormatException nfe) {
				System.out.println("Error");
			}
			
		}
		if(op == 'x'){
			String[] splitted = exp.split("[x]");
			float num;
			float num1 = Float.parseFloat(splitted[0]);
			float num2 = Float.parseFloat(splitted[1]);
			num = num1 * num2;
			this.exp = String.valueOf(num);
		}
		if(op == '/'){
			String[] splitted = exp.split("[/]");
			float num;
			float num1 = Float.parseFloat(splitted[0]);
			float num2 = Float.parseFloat(splitted[1]);
			num = num1 / num2;
			this.exp = String.valueOf(num);
		}
		if(op == '=') {
			this.exp = exp;
		}
	}
	String getExp(){
		return exp;
	}
}

