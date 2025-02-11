public class MainPersonne {
    public static void main(String[] args) {
        // Utilisation du constructeur par défaut
        Personne personne1 = new Personne();
        personne1.sePresenter();

        // Utilisation du constructeur avec paramètres
        Personne personne2 = new Personne("Alice", 30);
        personne2.sePresenter();
    }
}