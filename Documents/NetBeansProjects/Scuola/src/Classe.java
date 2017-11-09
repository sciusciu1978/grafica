import java.util.ArrayList;
public class Classe {
    private String nomeClasse;
    ArrayList<Alunno>AlunniClasse;

    public Classe(String nomeClasse) {
        this.nomeClasse = nomeClasse;
       
        AlunniClasse= new ArrayList<Alunno>();//ogni volta che creiamo un oggetto classe il costruttore ci crea in automatico un array della classe
    }

    public String getNomeClasse() {
        return nomeClasse;
    }
    

    public ArrayList<Alunno> getAlunniClasse() {
        return AlunniClasse;
    }
    public void stampaUtentiClasse(){
        for (Alunno alunno : AlunniClasse) {
            System.out.println(alunno);
        }
    }

    
    
    
    
    
    
    
    
   
}
