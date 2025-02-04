import java.util.Arrays;
import java.util.Scanner;

public class Exo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une série de nombres entiers séparés par des espaces :");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
        int[] numbers = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            numbers[i] = Integer.parseInt(inputArray[i]);
        }

        // Calcul de la moyenne
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double mean = sum / numbers.length;
        System.out.println("Moyenne: " + mean);

        // Tri du tableau
        Arrays.sort(numbers);
        System.out.println("Tableau trié: " + Arrays.toString(numbers));

        // Calcul de la médiane
        double median;
        if (numbers.length % 2 == 0) {
            median = (numbers[numbers.length / 2 - 1] + numbers[numbers.length / 2]) / 2.0;
        } else {
            median = numbers[numbers.length / 2];
        }
        System.out.println("Médiane: " + median);

        // Calcul de l'écart-type
        double sumOfSquares = 0;
        for (int num : numbers) {
            sumOfSquares += Math.pow(num - mean, 2);
        }
        double standardDeviation = Math.sqrt(sumOfSquares / numbers.length);
        System.out.println("Écart-type: " + standardDeviation);

        // Valeurs minimale et maximale
        int min = numbers[0];
        int max = numbers[numbers.length - 1];
        System.out.println("Valeur minimale: " + min);
        System.out.println("Valeur maximale: " + max);
        scanner.close();
    }
}