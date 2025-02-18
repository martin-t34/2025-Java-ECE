package com.monprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        // Informations de connexion
        String url = "jdbc:mysql://localhost:3306/basejava"; // Remplacer "maBase" par le nom de votre base
        String utilisateur = "root";
        String motDePasse = "";
        Connection connexion = null;

        try {
            // Établir la connexion
            connexion = DriverManager.getConnection(url, utilisateur, motDePasse);
            System.out.println("Connexion réussie !");
            
        } catch (SQLException e) {
            System.out.println("Erreur de connexion : " + e.getMessage());
        } finally { // Toujours fermer la connexion pour éviter les fuites de ressources 
            if (connexion != null) { 
                try { 
                    connexion.close(); 
                    System.out.println("Connexion fermée avec succès."); 
                } catch (SQLException e) { 
                    System.err.println("Erreur lors de la fermeture de la connexion : " + e.getMessage()); 
                } 
            } 
        }
    }
}
