import java.util.Scanner;
public class Main {

   
    public static void main(String[] args) {
        
    Scuola scuola1 =new Scuola("Gemmellaro");
    /*scuola1.aggiungiClasse("Prima c");
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
    scuola1.stampaUtentiClasse();*/
    String []nomiClassi = new String[3];
     Scanner input =new Scanner(System.in);
        String risposta;
        do {            
            System.out.println("Menu' scuola");
             System.out.println("");
             System.out.println("1- Crea classe");
              System.out.println("2- Inserisci alunno");
              System.out.println("3- Stampa alunni scuola");
              System.out.println("4- Sposta alunni nelle rispettive classi");
              System.out.println("5- Stampa alunni per classe");
              System.out.println("6- Esci" );
              risposta=input.nextLine();
              
              switch(risposta){
                  case "1" : System.out.println("Inserisci nome classe");
                  String nomeClasse=input.nextLine();
                  scuola1.aggiungiClasse(nomeClasse);
                  if(nomiClassi[0]==null){
                      nomiClassi[0]=nomeClasse;
                      break;
                  }
                  else if(nomiClassi[1]==null){
                      nomiClassi[1]=nomeClasse;
                      break;
                  }
                  else{
                      nomiClassi[2]=nomeClasse;
                  }
                      
                  break;
                  
                  case "2" : System.out.println("Inserisci nome");
                  String nome=input.nextLine();
                  System.out.println("Inserisci cognome");
                  String cognome=input.nextLine();
                  System.out.println("Digita anno di nascita");
                  int anno=input.nextInt();
                  System.out.println("Digita citta'");
                  String citta=input.next();
                  scuola1.aggiungiAlunno(nome,cognome,anno,citta);
                  break;
                  
                  case "3" : scuola1.elencoAlunniScuola();
                             System.out.println("");
                  break;
                  
                  case "4" : scuola1.aggiungiUtenteClasse(nomiClassi[0],nomiClassi[1],nomiClassi[2]);
                  break;
                  
                  case "5" : scuola1.stampaUtentiClasse();
                  break;
                  
              }
              
        } while (!risposta.equals("6"));
    
    
    
    
    }
    
}
