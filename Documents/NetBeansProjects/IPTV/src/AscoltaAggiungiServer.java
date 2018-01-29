
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AscoltaAggiungiServer implements ActionListener{
    GestioneIptv iptv;
    JTextField nome;
    JTextField contatto;
    JList lista;
    FinestraServer frame;
    
    public AscoltaAggiungiServer(GestioneIptv iptv, JList l, JTextField n, JTextField c, FinestraServer f){
        this.iptv=iptv;
        nome=n;
        contatto=c;
        lista=l;
        frame=f;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String nomeS=nome.getText().trim(); //metodo che elimina gli spazi a inizio e fine stringa
        String contattoS=contatto.getText().trim();
        
        boolean controllo=false;
        for (Server srv : iptv.server) {
            if(srv.getNomeServer().equalsIgnoreCase(nomeS)){
                controllo=true;
            }
        }
        if(controllo==false){
            iptv.aggiungiServer(nomeS, contattoS);
            frame.aggiornaLista();
            nome.setText("");
            contatto.setText("");
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Server Esistente!");
        }
        
        
        
        
        
    }
    
}
