package ExoLireFichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LireFichier {
    public static void main(String[] args) {
        String fichier = "c:/Users/marti/Documents/Documents/Fichier/Etudes/ECE/B2/B2 S2/Programation OO Java/ExoLireFichier/liste.txt";
        
        try (BufferedReader br = new BufferedReader(new FileReader(fichier))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                System.out.println(ligne);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
