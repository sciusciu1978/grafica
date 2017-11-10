
public class Alunno {
    private String nome;
   private String cognome;
   private int anno;
   private String luogo;
   
   

    public Alunno(String nome, String cognome, int anno, String luogo) {
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
        this.luogo = luogo;
        
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getAnno() {
        return anno;
    }

    public String getLuogo() {
        return luogo;
    }

    

   @Override
   public String toString(){
   
        return "Alunno "+nome+" "+cognome+" ** Anno di nascita "+anno+" ** Luogo di nascita "+luogo;
        
   }
  
 
}
