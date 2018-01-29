
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dominatore
 */
public class AscoltaMenuServer implements ActionListener{
    GestioneIptv iptv;

    public AscoltaMenuServer(GestioneIptv iptv) {
        this.iptv = iptv;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        new FinestraServer(iptv).setVisible(true);
    }
    
}
