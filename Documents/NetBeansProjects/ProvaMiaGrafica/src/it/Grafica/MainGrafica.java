package it.Grafica;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;




public class MainGrafica {

  
    public static void main(String[] args) {
        JFrame finestra =new JFrame("Gestione clienti");//creaiamo oggetto finestra e passiamo un a stringa per dare un titolo
        finestra.setSize(500, 500);//metodo per la grandezza
        finestra.setLocation(1300, 250);//metodo per posizione di apertura della finestra
        finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//metodo poter chiudere la finestra in runtime
        //finestra.setVisible(true);//metodo per l avisione della finestra,se false non si vede a video
        /*dopo la creazione della finestra bisogna creare una pannello dentro la finestra*/
        
        Container pannello=finestra.getContentPane();/*creaiamo puntatore di tipo container e creiamo oggetto passando il metodo,e importiamo la classe container*/
        
        pannello.setLayout(new GridLayout(2, 2));//creiamo il tipo di pannello
        
        JPanel pannello1 =new JPanel(new FlowLayout());//creiamo 4 pannelli da reinserire gridlayout dato che è diviso in 4
        JPanel pannello2 =new JPanel(new BorderLayout());
        JPanel pannello3 =new JPanel();
        pannello3.setLayout(new BoxLayout(pannello3, BoxLayout.Y_AXIS));
        JPanel pannello4 =new JPanel(new GridLayout(2, 2));
        pannello.add(pannello1);/*aggiungiamo i pannelli al gridlayout*/
        pannello.add(pannello2);
        pannello.add(pannello3);
        pannello.add(pannello4);
        
        pannello1.setBackground(Color.LIGHT_GRAY);/*settiamo i colori di sfondo di ogni pannello nella cella*/
        pannello2.setBackground(Color.red);
        pannello3.setBackground(Color.cyan);
        
        pannello1.setBorder(new EmptyBorder(30,30,30,30)); //bordo vuoto, ovvero cornice invisibile per lasciare uno spazio attorno agli oggetti
        pannello2.setBorder(new EmptyBorder(10,10,10,10));
        
        
        /* creiamo i vari oggetti del primo pannello nella prima cella*/
        JLabel etichetta = new JLabel("Programma di prova");/*creiamo un o etichetta con un campo di scrittura*/
        etichetta.setForeground(Color.magenta);
        etichetta.setPreferredSize(new Dimension(150, 50));
        pannello1.add(etichetta);
        
        
        /*creiamo bottone*/
        JButton pulsante = new JButton("iptv");
        pulsante.setForeground(Color.ORANGE);//colore testo
        pulsante.setBackground(Color.BLUE);//colore sfondo pulsante
        pulsante.setBorder(BorderFactory.createLineBorder(Color.CYAN, 2, true));
        pulsante.setPreferredSize(new Dimension(150, 50));
        pulsante.addActionListener(new AscoltaPulsante(pulsante,etichetta));
        pannello1.add(pulsante);//aggiungi oggetto pulsante al pannello
        
        /*creiamo casella di testo*/
        JTextField casellaDitesto= new JTextField();
        casellaDitesto.setPreferredSize(new Dimension(150, 50));//modifichiamo le dimensioni
        casellaDitesto.setForeground(Color.YELLOW);//colore scrittura
        casellaDitesto.setBackground(Color.black);//colore sfondo pulsante
        pannello1.add(casellaDitesto);//aggiungiamo a pannello
        
        /*creiamo oggetti per i secondo pannello*/
        JButton bottone2 =new JButton("Gestione Utenti");
        bottone2.setForeground(Color.BLUE);
        bottone2.setBackground(Color.GREEN);
        bottone2.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        bottone2.setPreferredSize(new Dimension(150, 50));
        pannello2.add(bottone2, BorderLayout.NORTH);
        
        /*creiamo secondo bottone*/
        JButton bottone3 =new JButton("Gestione Utenti");
        bottone3.setForeground(Color.MAGENTA);
        bottone3.setBackground(Color.ORANGE);
        bottone3.setBorder(BorderFactory.createLineBorder(Color.yellow, 1));
        bottone3.setPreferredSize(new Dimension(150, 50));
        pannello2.add(bottone3, BorderLayout.CENTER);
        /*creiamo casella di testo*/
        JTextField casella1 =new JTextField("Digita il testo");
        casella1.setPreferredSize(new Dimension(150, 50));
            casella1.setBackground(Color.darkGray);
            casella1.setForeground(Color.green);
            pannello2.add(casella1, BorderLayout.SOUTH);
            casella1.addFocusListener(new AscoltaJTextField(casella1));
         //ascoltatore del testo
            
        /*creiamo oggetti per il terzo pannello*/
        JButton bottone4 = new JButton("Click");
        
        bottone4.setForeground(Color.pink);
        bottone4.setBackground(Color.BLACK);
        bottone4.setPreferredSize(new Dimension(150, 50));
        bottone4.setMaximumSize(bottone4.getPreferredSize());
        bottone4.setBorder(BorderFactory.createLineBorder(Color.yellow));
        
        
        pannello3.add(bottone4);
        JLabel etichetta1 =new JLabel("Terzo pannello");
        etichetta1.setPreferredSize(new Dimension(150, 50));
        etichetta1.setMaximumSize(etichetta1.getPreferredSize());
        etichetta1.setForeground(Color.ORANGE);
        
        
        pannello3.add(etichetta1);
        
        JTextField casella2= new JTextField("Scrivi");
        casella2.setPreferredSize(new Dimension(150, 50));
        casella2.setMaximumSize(casella2.getPreferredSize());
        casella2.setForeground(Color.CYAN);
        casella2.setBackground(Color.BLACK);
        pannello3.add(casella2);
        
        JPanel checkPanel = new JPanel();
        checkPanel.setLayout(new FlowLayout());
        checkPanel.setMaximumSize(new Dimension(80,50));
        JCheckBox check1 = new JCheckBox();
        JCheckBox check2 = new JCheckBox();
        JCheckBox check3 = new JCheckBox();
        checkPanel.add(check1);
        checkPanel.add(check2);
        checkPanel.add(check3);
        bottone4.addActionListener(new AscoltaPulsante4(etichetta1, check1, check2, check3));
        pannello3.add(checkPanel);
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setMaximumSize(new Dimension(80,50));
        buttonPanel.setLayout(new FlowLayout());
        JRadioButton btn1 = new JRadioButton();
        JRadioButton btn2 = new JRadioButton();
        ButtonGroup gruppo = new ButtonGroup();
        gruppo.add(btn1);
        gruppo.add(btn2);
        buttonPanel.add(btn1);
        buttonPanel.add(btn2);
        
        pannello3.add(buttonPanel);
        
        //quarta cella,pannello grid layout,creazine de 4 oggetti
        JButton botton =new JButton("Click");
        botton.setPreferredSize(new Dimension(200, 100));
        botton.setForeground(Color.red);
        pannello4.add(botton);
        
        JTextField casella= new JTextField("Scrivi");
        casella.setPreferredSize(new Dimension(150, 100));
        pannello4.add(casella);
        
         JButton botton1 =new JButton("Click");
        botton1.setPreferredSize(new Dimension(150, 100));
        botton1.setForeground(Color.red);
        pannello4.add(botton1);
        
        JLabel etichet= new JLabel("pannello grid layout");
        etichet.setPreferredSize(new Dimension(150, 100));
        etichet.setForeground(Color.BLUE);
       
       
        etichet.setBorder(BorderFactory.createLineBorder(Color.yellow, 2));
        pannello4.add(etichet);
        
        finestra.setVisible(true);
        //finestra.pack();
        
     }//main
    
}//classe


