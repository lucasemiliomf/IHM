package Exercice;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
	ZoneDessin zd = new ZoneDessin();
	public Fenetre() {
		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		JFrame jf = new JFrame("Editeur Graphique 2D");
		JLabel jl = new JLabel("TP4");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(800,600);
		jf.setContentPane(jp);
		jf.add(jl,BorderLayout.NORTH);
		jf.setVisible(true);
		
		jf.add(zd);
		
		JPanel jB = new JPanel();
		
		jB=creeBoutons();
		jf.add(jB,BorderLayout.SOUTH);
		zd.repaint();
	}
	
	private JPanel creeBoutons() {
		// créé un panel avec des éléments alignés à gauche
		final JPanel panel =
		new JPanel(new FlowLayout(FlowLayout.CENTER,200,0));
		// création du bouton ajouter
		final JButton ajouter = new JButton("+");
		// création d’une action pour ajouter dans la liste
		ActionAjouter actionAjout = new ActionAjouter(zd);
		// affectation de cette action au bouton
		ajouter.addActionListener(actionAjout);
		// ajout du bouton dans la fenetre
		panel.add(ajouter);
		
		// création du bouton supprimer
		final JButton supprimer = new JButton("-");
		// création d’une action pour supprimer dans la liste
		ActionSupprimer actionSupprimer = new ActionSupprimer(zd);
		// affectation de cette action au bouton
		supprimer.addActionListener(actionSupprimer);
		// ajout du bouton dans la fenetre
		panel.add(supprimer);
		return panel;
	}
}
