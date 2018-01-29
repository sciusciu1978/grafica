
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominatore
 */
public class AscoltaMenuCrea implements ActionListener{
    JTextField text1;
    JTextField text2;
    JTextField text3;
    JTextField text4;
    JComboBox box;
    JTextArea area;
    JButton salva;
    GestioneIptv iptv;

    public AscoltaMenuCrea(GestioneIptv iptv, JTextField text1, JTextField text2, JTextField text3, JTextField text4, JComboBox box, JTextArea area, JButton salva) {
        this.text1 = text1;
        this.text2 = text2;
        this.text3 = text3;
        this.text4 = text4;
        this.box = box;
        this.area = area;
        this.iptv=iptv;
        this.salva=salva;
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if(iptv.server.size()>0){
        text1.setEnabled(true); //abilità la proprietà enabled
        text2.setEnabled(true);
        text3.setEnabled(true);
        //text4.setEnabled(true);
        box.setEnabled(true);
        area.setEnabled(true);
        salva.setEnabled(true);
        GregorianCalendar calendar = new GregorianCalendar();
        int date=calendar.get(calendar.DATE);
        int mese=calendar.get(calendar.MONTH);
        int anno=calendar.get(calendar.YEAR);
        text4.setText(new Integer(date).toString()+'-'+new Integer(mese+1).toString()+'-'+new Integer(anno).toString());
            for (Server srv :iptv.server) {
              box.addItem(srv.getNomeServer());  
            }
        
        text1.grabFocus();
        }
        else{
            JOptionPane.showMessageDialog(null, "Nessun server");
        }
    }
    
}
