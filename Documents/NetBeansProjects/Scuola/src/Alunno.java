
public class Alunno {
    private String nome;
   private String cognome;
   private int anno;
   private String luogo;
   private boolean bocciato;
   

    public Alunno(String nome, String cognome, int anno, String luogo, boolean bocciato) {
        this.nome = nome;
        this.cognome = cognome;
        this.anno = anno;
        this.luogo = luogo;
        this.bocciato = bocciato;
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

    public boolean isBocciato() {
        return bocciato;
    }

   @Override
   public String toString(){
   
        return "Alunno "+nome+" "+cognome+" ** Anno di nascita "+anno+" ** Luogo di nascita "+luogo;
        
   }
  
 
}
