import java.util.Scanner;

public class ask {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Quel est votre nom? ");
            String name = scanner.nextLine();

            System.out.print("Quel est votre âge? ");
            int age = scanner.nextInt();

            if (age < 0 || age > 130) {
                System.out.println("Erreur: L'âge doit être compris entre 0 et 130.");
            } else if (age < 18) {
                System.out.println(name + ", Vous êtes Mineur");
            } else {
                System.out.println(name + ", Vous êtes Majeur");
            }
        }
    }
}