package ExoLireValeurTabl;

public class LireValeur {
    
}

public class TableauUtils {
    public static int lireValeur(int[] tableau, int index) {
        if (index < 0 || index >= tableau.length) {
            throw new IndexOutOfBoundsException();
        }
        return tableau[index];
    }
}
