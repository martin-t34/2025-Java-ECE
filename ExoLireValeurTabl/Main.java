package ExoLireValeurTabl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'index de l'élément que vous souhaitez lire : ");
        int index = scanner.nextInt();

        try {
            int valeur = TableauUtils.lireValeur(tableau, index);
            System.out.println("La valeur à l'index " + index + " est : " + valeur);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erreur : L'index " + index + " dépasse la taille du tableau.");
        }
    }
}
