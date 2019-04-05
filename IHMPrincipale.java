import java.*;
import java.util.LinkedList; 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import  java.awt.Font;

public class IHMPrincipale extends JFrame{ //implements ActionListener, KeyListener{
	
	
	public IHMPrincipale(String nom, int width, int height){
		super(nom);
		setSize(width, height);
		setLocation(50,100);	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel monEtiquette = new JLabel();
		monEtiquette.setBounds(750,75,200,50);
		Font police = new Font(" Arial ",Font.BOLD,30);
		monEtiquette.setFont(police);
		monEtiquette.setText("HOME");
		
		JLabel monImage = new JLabel();
		monImage= new JLabel(new ImageIcon("compte_utilisateur.png"));
		monImage.setSize(100,100);
		monImage.setLocation(1450,10);
		
		JLabel monEtiquette21 = new JLabel();
		monEtiquette21.setBounds(300,10,200,50);
		Font police21 = new Font(" Arial ",Font.BOLD,20);
		monEtiquette21.setFont(police21);
		monEtiquette21.setText("HEIGHT");
		
		JLabel monEtiquette22 = new JLabel();
		monEtiquette22.setBounds(600,10,200,50);
		Font police22 = new Font(" Arial ",Font.BOLD,20);
		monEtiquette22.setFont(police22);
		monEtiquette22.setText("WEIGHT");
		
		JLabel monEtiquette23 = new JLabel();
		monEtiquette23.setBounds(900,10,200,50);
		Font police23 = new Font(" Arial ",Font.BOLD,20);
		monEtiquette23.setFont(police23);
		monEtiquette23.setText("OBJECTIVE");
		
		JLabel monEtiquette24= new JLabel();
		monEtiquette24.setBounds(1200,10,200,50);
		Font police24 = new Font(" Arial ",Font.BOLD,20);
		monEtiquette24.setFont(police24);
		monEtiquette24.setText("DAILY");
				
		JLabel monEtiquette3 = new JLabel();
		monEtiquette3.setBounds(725,10,200,50);
		Font police3= new Font(" Arial ",Font.BOLD,30);
		monEtiquette3.setFont(police3);
		monEtiquette3.setText("WORKOUT");
		
		JLabel monEtiquette31= new JLabel();
		monEtiquette31.setBounds(250,250,200,50);
		Font police31 = new Font(" Arial ",Font.BOLD,20);
		monEtiquette31.setFont(police31);
		monEtiquette31.setText("UPPER BODY");
		
		JLabel monImage31 = new JLabel();
		monImage31= new JLabel(new ImageIcon("Torse2.jpg"));
		monImage31.setSize(200,200);
		monImage31.setLocation(270,50);
		
		JLabel monEtiquette32= new JLabel();
		monEtiquette32.setBounds(700,250,200,50);
		Font police32 = new Font(" Arial ",Font.BOLD,20);
		monEtiquette32.setFont(police32);
		monEtiquette32.setText("LOWER BODY");
		
		JLabel monImage32 = new JLabel();
		monImage32= new JLabel(new ImageIcon("Torse2.png"));
		monImage32.setSize(200,200);
		monImage32.setLocation(725,50);
		
		JLabel monEtiquette33= new JLabel();
		monEtiquette33.setBounds(1200,250,200,50);
		Font police33 = new Font(" Arial ",Font.BOLD,20);
		monEtiquette33.setFont(police33);
		monEtiquette33.setText("FULL BODY");
		
		JLabel monImage33 = new JLabel();
		monImage33= new JLabel(new ImageIcon("Torse2.jpg"));
		monImage33.setSize(200,200);
		monImage33.setLocation(1225,50);
		
		JLabel monEtiquette4 = new JLabel();
		monEtiquette4.setBounds(750,10,200,50);
		Font police4= new Font(" Arial ",Font.BOLD,30);
		monEtiquette4.setFont(police4);
		monEtiquette4.setText("MEALS");
		
		
		JTextField monText4= new JTextField();
		monText4.setBounds(725,120,150,50);
		monText4.setText("Enter Calories");
		
		JLabel monEtiquette5 = new JLabel();
		monEtiquette5.setBounds(700,10,300,50);
		Font police5= new Font(" Arial ",Font.BOLD,30);
		monEtiquette5.setFont(police5);
		monEtiquette5.setText("OTHER ACTIVITIES");
		
		JPanel monConteneur1 = new JPanel();
		monConteneur1.setLayout(null);
		monConteneur1.setBackground(new Color(0,0,150));
		
		JPanel monConteneur2 = new JPanel();
		monConteneur2.setLayout(null);
		monConteneur2.setBackground(new Color(200,200,200));
		
		JPanel monConteneur3 = new JPanel();
		monConteneur3.setLayout(null);
		monConteneur3.setBackground(new Color(200,200,200));
		
		JPanel monConteneur4 = new JPanel();
		monConteneur4.setLayout(null);
		monConteneur4.setBackground(new Color(200,200,200));
		
		JPanel monConteneur5 = new JPanel();
		monConteneur5.setLayout(null);
		monConteneur5.setBackground(new Color(200,200,200));
		
		JPanel monConteneur7 = new JPanel();
		monConteneur7.setLayout(null);
	
		monConteneur1.add(monImage);
		monConteneur1.add(monEtiquette) ;
		monConteneur3.add(monEtiquette3) ;
		monConteneur3.add(monEtiquette31) ;
		monConteneur3.add(monImage31);
		monConteneur3.add(monEtiquette32) ;
		monConteneur3.add(monImage32);
		monConteneur3.add(monEtiquette33) ;
		monConteneur3.add(monImage33);
		monConteneur2.add(monEtiquette21) ;
		monConteneur2.add(monEtiquette22) ;
		monConteneur2.add(monEtiquette23) ;
		monConteneur2.add(monEtiquette24) ;
		monConteneur4.add(monEtiquette4) ;
		monConteneur4.add(monText4);
		monConteneur5.add(monEtiquette5) ;
		monConteneur1.setBounds(0,0,1590,167);
		monConteneur2.setBounds(0,167,1590,167);
		monConteneur3.setBounds(0,334,1590,334);
		monConteneur4.setBounds(0,668,1590,167);
		monConteneur5.setBounds(0,835,1590,167);
		monConteneur7.setBounds(0,0,1590,1000);
		monConteneur7.setBackground(new Color(200,200,200));
		monConteneur7.add(monConteneur1);
		monConteneur7.add(monConteneur2);
		monConteneur7.add(monConteneur3);
		monConteneur7.add(monConteneur4);
		monConteneur7.add(monConteneur5);
		add(monConteneur7);
		setVisible(true);
		
		
		
		
		
		
		
	}	
}
