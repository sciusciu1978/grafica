
public class Main {

   
    public static void main(String[] args) {
        
    Scuola scuola1 =new Scuola("Gemmellaro");
    scuola1.aggiungiClasse("Prima c");
    scuola1.aggiungiClasse("Seconda c");
    scuola1.aggiungiClasse("Terza c");
           
    scuola1.aggiungiAlunno("mattia","DelNeri",1980,"catania", true);
    scuola1.aggiungiAlunno("marco","DelNeri",1980,"napoli", true);
    scuola1.aggiungiAlunno("giovanni","verchiu",1990,"udine", false);
    scuola1.aggiungiAlunno("marco","aichi",1990,"verona", true);
    scuola1.aggiungiAlunno("max","DelNeri",2000,"bari", false);
    scuola1.aggiungiAlunno("paolo","DelNeri",2000,"napoli", true);
    scuola1.aggiungiUtenteClasse();
    scuola1.stampaUtentiClasse();
    }
    
}
