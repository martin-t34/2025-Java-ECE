package com.monprojet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("Menu:");
            System.out.println("1. Afficher la liste des étudiants");
            System.out.println("2. Ajouter un étudiant");
            System.out.println("3. Retirer un étudiant");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la nouvelle ligne

            switch (choix) {
                case 1:
                    GestionUtilisateurs.afficherUtilisateurs();
                    break;
                case 2:
                    System.out.print("Entrez l'email de l'étudiant : ");
                    String email = scanner.nextLine();
                    System.out.print("Entrez le nom de l'étudiant : ");
                    String nom = scanner.nextLine();
                    GestionUtilisateurs.ajouterUtilisateur(email, nom);
                    break;
                case 3:
                    System.out.print("Entrez l'ID de l'étudiant à retirer : ");
                    int id = scanner.nextInt();
                    GestionUtilisateurs.retirerUtilisateur(id);
                    break;
                case 4:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choix != 4);

        scanner.close();
    }
}
