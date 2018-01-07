
package it.Grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;



class AscoltaPulsante implements ActionListener{//creiamo un interfaccia
           JButton pulsante;//creiamo un puntatore di tipo jbutton perche lavoreremo con il pulsante
           JLabel etichetta;
           
           int valore;
           public AscoltaPulsante(JButton pulsante,JLabel etichetta){//creiamo il costruttore da cui nel mail passeremo il valore
               this.pulsante=pulsante;
               this.etichetta=etichetta;
               valore=0;
           }
           @Override
           public void actionPerformed(ActionEvent evento){
               if(valore<5){
               valore++;
               etichetta.setText(Integer.toString(valore));
               }
               else{
                   JOptionPane.showMessageDialog(null, "Massimo");
                   //finestra di dialogo per inviare un messaggio senza opzioni con solo una stringa
                   
                   //String parola = JOptionPane.showInputDialog("inserisci");
                   
                   int valore = JOptionPane.showConfirmDialog(null, "Ricominciare?");
                   if(valore==0){
                       this.valore=0;
                       etichetta.setText(Integer.toString(this.valore));
                   }
               }
           }
           
           
           
}