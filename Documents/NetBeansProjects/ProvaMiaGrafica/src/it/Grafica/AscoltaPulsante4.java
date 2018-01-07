
package it.Grafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;



class AscoltaPulsante4 implements ActionListener{//creiamo un interfaccia
           JButton pulsante;//creiamo un puntatore di tipo jbutton perche lavoreremo con il pulsante
           JCheckBox chk1;
           JCheckBox chk2;
           JCheckBox chk3;
           JLabel label;
           
           public AscoltaPulsante4(JLabel label, JCheckBox chk1, JCheckBox chk2, JCheckBox chk3){//creiamo il costruttore da cui nel mail passeremo il valore
               this.chk1=chk1;
               this.chk2=chk2;
               this.chk3=chk3;
               this.label=label;
           }
           @Override
           public void actionPerformed(ActionEvent evento){
               String str="";
               if(chk1.isSelected()){
                   str=str+"uno ";
               }
               if(chk2.isSelected()){
                   str=str+"due ";
               }
               if(chk3.isSelected()){
                   str=str+"tre ";
               }
               label.setText(str);
           }
           
           
           
}