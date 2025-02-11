package ExoListeEtudiant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEtudiants gestion = new GestionEtudiants();
        Scanner scanner = new Scanner(System.in);

        gestion.ajouterEtudiant(new Etudiant("Alice", 20));
        gestion.ajouterEtudiant(new Etudiant("Bob", 21));
        gestion.ajouterEtudiant(new Etudiant("Charlie", 22));
        gestion.ajouterEtudiant(new Etudiant("David", 23));
        gestion.ajouterEtudiant(new Etudiant("Eve", 24));
        gestion.ajouterEtudiant(new Etudiant("Frank", 25));
        gestion.ajouterEtudiant(new Etudiant("Grace", 26));
        gestion.ajouterEtudiant(new Etudiant("Hank", 27));
        gestion.ajouterEtudiant(new Etudiant("Ivy", 28));
        gestion.ajouterEtudiant(new Etudiant("Jack", 29));

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter un étudiant");
            System.out.println("2. Afficher la liste des étudiants");
            System.out.println("3. Supprimer un étudiant par son nom");
            System.out.println("4. Quitter");
            System.out.print("Choisissez une option: ");
            int choix = scanner.nextInt();
            scanner.nextLine(); 

            switch (choix) {
                case 1:
                    System.out.print("Entrez le nom de l'étudiant: ");
                    String nom = scanner.nextLine();
                    System.out.print("Entrez l'âge de l'étudiant: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();  
                    gestion.ajouterEtudiant(new Etudiant(nom, age));
                    System.out.println("Étudiant ajouté.");
                    break;
                case 2:
                    System.out.println("Liste des étudiants:");
                    gestion.afficherEtudiants();
                    break;
                case 3:
                    System.out.print("Entrez le nom de l'étudiant à supprimer: ");
                    String nomASupprimer = scanner.nextLine();
                    gestion.supprimerEtudiantParNom(nomASupprimer);
                    break;
                case 4:
                    System.out.println("Au revoir!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }
}