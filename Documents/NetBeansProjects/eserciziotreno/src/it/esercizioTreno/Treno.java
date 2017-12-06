
package it.esercizioTreno;


import java.util.HashMap;
import java.util.Map;


public class Treno {
    private String nomeTreno;
    private int postiSedere;
    double kmPercorsi;
    double prezzoBigliettoKm;
    private HashMap<Fermata,String> fermate;//hashmap con la fermata e un oggetto stringa per orario

    public Treno(String nomeTreno, int postiSedere, double prezzoBigliettoKm) {//costruttore
        this.nomeTreno = nomeTreno;
        this.postiSedere = postiSedere;
        this.prezzoBigliettoKm = prezzoBigliettoKm;
        fermate=new HashMap<Fermata,String>();
    }

    public String getNomeTreno() {
        return nomeTreno;
    }

    public int getPostiSedere() {
        return postiSedere;
    }

    public double getKmPercorsi() {
        return kmPercorsi;
    }

    public double getPrezzoBigliettoKm() {
        return prezzoBigliettoKm;
    }
    public void stampaFermateTreno(){
        
        for (Map.Entry<Fermata, String> entry : fermate.entrySet()) {
            Fermata key = entry.getKey();
            String value = entry.getValue();
            
            
        }
    }
    
    
    
    
}
