package Calculator;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame{
	JButton[] numberBoutons = new JButton[10];
    JButton[] operatorBoutons = new JButton[4];
    JButton boutonequals;
    JButton boutonpoint;
    JButton boutonclr;
    JTextField jf;

    
    public CalculatorWindow(){
        super("UNISTRA CALC");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        for(int i =0; i < 10; i++) {
        	String number = String.valueOf(i);
        	numberBoutons[i] = new JButton(number);
        }
        operatorBoutons[0] = new JButton("+");
        operatorBoutons[1] = new JButton("-");
        operatorBoutons[2] = new JButton("x");
        operatorBoutons[3] = new JButton("/");
        boutonequals = new JButton("=");
        boutonpoint = new JButton(".");
        boutonclr = new JButton("CLR");
        
        jf = new JTextField(10);   
        
        add(jf);
        add(boutonclr);
        
        for(int i =0; i < 10; i++) {
        	add(numberBoutons[i]);
        }
        add(boutonpoint);
        add(operatorBoutons[0]);
        add(operatorBoutons[1]);
        add(operatorBoutons[2]);
        add(operatorBoutons[3]);
        add(boutonequals);
        
        
        setSize(220,200);
        setResizable(false);
        setVisible(true);
         
    }
}
