public class Personne {
    // Attributs
    private String nom;
    private int age;

    // Constructeur par défaut
    public Personne() {
        this.nom = "Inconnu";
        this.age = 0;
    }

    // Constructeur avec paramètres
    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Méthode pour se présenter
    public void sePresenter() {
        System.out.println("Nom: " + nom);
        System.out.println("Âge: " + age);
    }
}