package ExoListeEtudiant;

public class Etudiant {
    private String nom;
    private int age;

    // Constructeur
    public Etudiant(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    // Getters
    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    // Méthode pour afficher les informations de l'étudiant
    @Override
    public String toString() {
        return "Nom: " + nom + ", Âge: " + age;
    }
}