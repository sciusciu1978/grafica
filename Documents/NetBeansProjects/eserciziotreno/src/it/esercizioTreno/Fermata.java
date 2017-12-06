
package it.esercizioTreno;


public class Fermata {
    private String nomeFermata;
    private double kmStazionePartenza;

    public Fermata(String nomeFermata, double kmStazionePartenza) {
        this.nomeFermata = nomeFermata;
        this.kmStazionePartenza = kmStazionePartenza;
    }

    public String getNomeFermata() {
        return nomeFermata;
    }

    public double getKmStazionePartenza() {
        return kmStazionePartenza;
    }
    
    public String toString(){
        return "Nome Fermata: "+nomeFermata;
        
    }
}



