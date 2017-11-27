package EsercizioFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Dominatore
 */
public class Main {

  
    public static void main(String[] args) {
        Abbonato a1=new Abbonato(10, "053757684", "user1", "");
        Abbonato a2=new Abbonato(12, "057684", "user2", "note");
        
        FileReader file;
        FileWriter filew;
        try {
            filew = new FileWriter("C:/Users/Dominatore/Desktop/files/testo.txt", false);
            // 2 modi di aprirlo false e true. false apertura come nuovo, true apertura in 'append' cioè in aggiunta a quello vecchio
            filew.write(a1.toString()+'\n');
            //filew.write(a2.toString()+'\n');
            filew.close();   //il file va sempre chiuso alla fine delle operazioni
        } catch (IOException e) {
            System.out.println("Errore");
        }
        try {
            file = new FileReader("C:/Users/Dominatore/Desktop/files/testo.txt");
            Scanner input =new Scanner(file);
            String riga;
            while(input.hasNextLine())
            {   riga=input.nextLine();
                String[] vet = riga.split(" ");
                Abbonato prova=new Abbonato(10, vet[5], vet[1], ""); 
                System.out.println(prova);
            }
            file.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Non trovato");
        }
        catch (IOException ex) {
            System.out.println("Errore file");
        }
       
    }
    
}
