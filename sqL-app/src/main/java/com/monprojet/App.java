package com.monprojet;

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
            System.out.println("4. Mettre à jour un étudiant");
            System.out.println("5. Rechercher un étudiant par email");
            System.out.println("6. Quitter");
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
                    System.out.print("Entrez l'ID de l'étudiant à mettre à jour : ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consommer la nouvelle ligne
                    System.out.print("Entrez le nouvel email de l'étudiant : ");
                    String newEmail = scanner.nextLine();
                    System.out.print("Entrez le nouveau nom de l'étudiant : ");
                    String newNom = scanner.nextLine();
                    GestionUtilisateurs.mettreAJourUtilisateur(idUpdate, newEmail, newNom);
                    break;
                case 5:
                    System.out.print("Entrez l'email de l'étudiant à rechercher : ");
                    String emailRecherche = scanner.nextLine();
                    GestionUtilisateurs.rechercherUtilisateurParEmail(emailRecherche);
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        } while (choix != 6);

        scanner.close();
    }
}
