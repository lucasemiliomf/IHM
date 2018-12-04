package Calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame implements ActionListener{
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
        	numberBoutons[i].addActionListener(this);
        }
        operatorBoutons[0] = new JButton("+");
        operatorBoutons[0].addActionListener(this);
        operatorBoutons[1] = new JButton("-");
        operatorBoutons[1].addActionListener(this);
        operatorBoutons[2] = new JButton("x");
        operatorBoutons[2].addActionListener(this);
        operatorBoutons[3] = new JButton("/");
        operatorBoutons[3].addActionListener(this);
        boutonequals = new JButton("=");
        boutonequals.addActionListener(this);
        boutonpoint = new JButton(".");
        boutonpoint.addActionListener(this);
        boutonclr = new JButton("CLR");
        boutonclr.addActionListener(this);
        
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
    String exp = new String("");
    CalculatorOperation co = new CalculatorOperation();
    char op = '=';
    boolean aux = true;
    
    public void actionPerformed(ActionEvent e){
    	if(aux) {
    		for(int i =0; i < 10; i++) {
    			if(e.getSource() == numberBoutons[i]) {
    				aux = false;
    				break;
    			}
            }
    	}
    	if(aux == false){
    		if(e.getSource() == boutonclr) {
	    		exp = "";
	    		op = '=';
	    	}
    		else if(e.getSource() == boutonequals){
	    		co.calcula(exp, op);
				exp = co.getExp();
	    		op = '=';
	    	}
    		else {
	    		for(int i =0; i < 4; i++) {
	    			if(e.getSource() == operatorBoutons[i]) {
	    				co.calcula(exp, op);
	    				exp = co.getExp();
	    				op = e.getActionCommand().charAt(0);
	    				aux = true;
	    			}
	            }
	    		exp+= e.getActionCommand();
	    	}
	    	
    	}
    	jf.setText(exp);
    	add(jf);
    }
    
    /*public void actionPerformed(ActionEvent e){
    	for(int i =0; i < 10; i++) {
    		if (e.getSource()==numberBoutons[i]) num = i;
        }
    	if(e.getSource()==operatorBoutons[0]) num = i;
    	
    }*/
}
