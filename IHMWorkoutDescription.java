import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedList; 

public class IHMWorkoutDescription extends JFrame implements ActionListener{
	
	// Les Widgets à déclarer en dehors du constructeur
	private JComboBox courbeList;
	private JTextArea affHistorique;
	private JButton monBoutonAfficher;
	private JButton monBoutonEffacer;
	//private LinkedList<Courbe> maListe;
	private JTextField textChoix;
	
	public IHMWorkoutDescription(LinkedList<Workout> WorkoutList){
		maListe = WorkoutList;
		this.setTitle("IHM workout presentation window");
		this.setSize(1600,1000);
		// Pour placer la fenêtre au centre de l'écran
		 this.setLocationRelativeTo(null);
		
		// Pour empêcher le redimensionnement de la fenêtre
		this.setResizable(false);
		// Pour permettre la fermeture de la fenêtre lors de l'appui sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	//Panel 1 Title
		JPanel Title = new JPanel();
		panneauChoix.setBounds(0,0,1600,167);
		panneauChoix.setLayout(null);
		panneauChoix.setBackground(new Color (0,0,150));
		
		JLabel Titre = new JLabel();
		affChoix.setText("Workout Description");
		affChoix.setBounds(15,10,340,50);
		panneauChoix.add(affChoix);
		
	//Panel 1
		
		
	
		
		
		
		
		
		
	
	
	
	
	/*
	public void actionPerformed (ActionEvent e){
		if (e.getSource()== monBoutonEffacer){
			System.out.println("Click sur Effacer !");
			affHistorique.setText("");
		}
		if (e.getSource()== monBoutonAfficher){
			
			FenetrePlotCourbe maFramePlotCourbe=new FenetrePlotCourbe (maListe);
			System.out.println("Click sur Afficher !");
			
			int choix = Integer.parseInt(textChoix.getText());
			if (choix>maListe.size() || choix<1){
				JOptionPane.showMessageDialog(this,"Veuillez rentrer un nombre entre 1 et "+maListe.size()+" !");
			} else{
				System.out.println(maListe.get(choix-1));
				// Pour rappel, la première case du tableau est 0
				affHistorique.append("La courbe " + (choix) + " est  : \n" );
				affHistorique.append(" " +maListe.get(choix-1).toString() + "\n \n");
				
				
			} 
		}
	}
	
	
	
	
   */	
	
	
	}
}
