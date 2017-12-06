
package it.esercizioTreno;

import java.util.ArrayList;


public class sistemaInformativo {
    ArrayList<Treno>treni =new ArrayList<Treno>();
    
    public void aggiungiTreno(String nomeTr,int postisedere,double prezzobiglietto)throws Exception{
        for (Treno treno : treni) {
            if(!treno.getNomeTreno().equalsIgnoreCase(nomeTr)){
                Treno treno1=new Treno(nomeTr,postisedere,prezzobiglietto);
                
            }
            else{
                throw new Exception("Treno esistente");
            }
            
        }
    }
}
