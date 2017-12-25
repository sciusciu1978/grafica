
package grafica;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;


public class Grafica {

  
    public static void main(String[] args) {
        //Stazione s = new Stazione();
        
        //CREO LA FINESTRA PRINCIPALE
      JFrame finestra = new JFrame("Programma");
      finestra.setResizable(false);
      finestra.setSize(500,400);
      finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      finestra.setLocation(600, 400); // x e y
      
      // OTTENGO IL PANNELLO COL METODO getContentPane()
      Container panel = finestra.getContentPane(); //metodo che ritorna l'oggetto Pannello Principale
      //panel.setLayout(new FlowLayout()); // funzione che imposta l'impazione del pannello
      panel.setLayout(new GridLayout(2, 2));
      
      //CREO I VARI OGGETTI
      JLabel etichetta = new JLabel("Testo prova");
      etichetta.setBounds(10, 10, 50, 50);
      etichetta.setForeground(Color.green);
     // etichetta.setLocation(10, 10);
      panel.add(etichetta);
      
      JLabel etichetta2 = new JLabel("Testo 2");
      panel.add(etichetta2);
      
      JTextField casellaDiTesto = new JTextField();
      casellaDiTesto.setPreferredSize(new Dimension(100, 20)); //per ridimensionare un oggetto -> setPreferredSize()
      panel.add(casellaDiTesto);
      
      JPanel pan2 = new JPanel();
      pan2.setLayout(new GridLayout(2, 1));
      pan2.setPreferredSize(new Dimension(40, 40));
      pan2.setBackground(Color.green);
      JButton bottone = new JButton("Click");
      bottone.setBackground(Color.blue); //colore di background del pulsante
      bottone.setForeground(Color.white); //colore testo
      bottone.setBorder(BorderFactory.createDashedBorder(null, 3, 2, 3, false)); //set Border (  oggetto BorderFacotry con il tipo di bordo corrispondente  )
      bottone.setPreferredSize(new Dimension(25, 20));
      bottone.addActionListener(new AscoltaPulsante(etichetta, casellaDiTesto));
      pan2.add(bottone); //bottone dentro il pannello
      
      JButton bottone2 = new JButton("Click 2");
      bottone2.setBackground(Color.red); //colore di background del pulsante
      bottone2.setForeground(Color.white); //colore testo
      bottone2.setBorder(BorderFactory.createDashedBorder(null, 3, 2, 3, false)); //set Border (  oggetto BorderFacotry con il tipo di bordo corrispondente  )
      bottone2.setPreferredSize(new Dimension(25, 20));
      bottone2.addActionListener(new AscoltaPulsante2(bottone2));
      pan2.add(bottone2); //bottone dentro il pannello
      
      panel.add(pan2);
      
      
      
      
      //finestra.pack(); // adatta la grandezza della finestra agli oggetti contenuti
      
      finestra.setVisible(true);
      
      
    }
    
}

class AscoltaPulsante implements ActionListener {
    JLabel blabla;
    JTextField casella;
    public AscoltaPulsante(JLabel e, JTextField c){
        this.blabla=e;
        this.casella=c;
    }
    
    public void actionPerformed(ActionEvent evento){
        blabla.setText(casella.getText());
    }

    
}

class AscoltaPulsante2 implements ActionListener {
    JButton bottone;
    public AscoltaPulsante2(JButton b){
        this.bottone=b;
    }
    
    public void actionPerformed(ActionEvent evento){
        if(bottone.getBackground()==Color.yellow)
        bottone.setBackground(Color.cyan);
        else{
        bottone.setBackground(Color.yellow);

        }
    }

    
}
