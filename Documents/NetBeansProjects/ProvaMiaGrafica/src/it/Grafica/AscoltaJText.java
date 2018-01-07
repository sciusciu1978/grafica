
package it.Grafica;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import javafx.event.ActionEvent;
import javax.swing.JTextField;

class AscoltaJText implements TextListener{
    JTextField casella;

    public AscoltaJText(JTextField casella) {
        this.casella = casella;
    }

    @Override
    public void textValueChanged(TextEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(casella.getText().length()<4){
            casella.setForeground(Color.red);
        }
        else{
            casella.setForeground(Color.green);
        }
    }
    
    
    
    
}
