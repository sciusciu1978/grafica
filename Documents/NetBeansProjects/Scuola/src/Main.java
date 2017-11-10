
public class Main {

   
    public static void main(String[] args) {
        
    Scuola scuola1 =new Scuola("Gemmellaro");
    scuola1.aggiungiClasse("Prima c");
    scuola1.aggiungiClasse("Seconda c");
    scuola1.aggiungiClasse("Terza c");
           
    scuola1.aggiungiAlunno("mattia","DelNeri",1978,"catania", true);
    scuola1.aggiungiAlunno("marco","DelNeri",1980,"napoli", true);
    scuola1.aggiungiAlunno("giovanni","verchiu",1983,"udine", false);
    scuola1.aggiungiAlunno("marco","aichi",1990,"verona", true);
    scuola1.aggiungiAlunno("max","DelNeri",2000,"bari", false);
    scuola1.aggiungiAlunno("paolo","DelNeri",1993,"napoli", true);
    scuola1.aggiungiAlunno("max","Fisio",1991,"bari", false);
    scuola1.aggiungiAlunno("paolo","Auta",2000,"napoli", true);
    scuola1.aggiungiUtenteClasse();//metodo che prende tutti gli utenti li gira nel foreach e li divide nelle loro classi:fino 1980 /fino 1990/fino 2000 come eta su tre classi
    ;
    scuola1.stampaUtentiClasse();
    }
    
}
