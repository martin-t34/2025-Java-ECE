import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez la marque de la voiture:");
        String marque = scanner.nextLine();

        System.out.println("Entrez le modèle de la voiture:");
        String modele = scanner.nextLine();

        String couleur = choisirCouleur();

        Exovoiture voiture = new Exovoiture(marque, modele, couleur);
        voiture.afficherDetails();
        voiture.demarrer();
        voiture.accelerer();
        voiture.freiner();
    }

    public static String choisirCouleur() {
        Scanner scanner = new Scanner(System.in);
        String[] couleurs = {"Rouge", "Bleu", "Vert"};
        System.out.println("Choisissez une couleur:");
        for (int i = 0; i < couleurs.length; i++) {
            System.out.println((i + 1) + ". " + couleurs[i]);
        }
        int choix = scanner.nextInt();
        while (choix < 1 || choix > couleurs.length) {
            System.out.println("Choix invalide. Veuillez choisir une couleur entre 1 et " + couleurs.length + ":");
            choix = scanner.nextInt();
        }
        return couleurs[choix - 1];
    }
}