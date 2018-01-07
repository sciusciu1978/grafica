
package it.Grafica;

import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javafx.event.ActionEvent;
import javax.swing.JTextField;

class AscoltaJTextField implements FocusListener{
    JTextField casella;

    public AscoltaJTextField(JTextField casella) {
        this.casella = casella;
    }

    @Override
    public void focusGained(FocusEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (casella.getText().equals("Digita il testo")) {
            casella.setText("");
    }
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (casella.getText().equals("")) {
            casella.setText("Digita il testo");
    }
    }
    
    
}
