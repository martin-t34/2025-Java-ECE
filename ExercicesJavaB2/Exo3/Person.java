package ExercicesJavaB2.Exo3;

public class Person {
    private String nom;
    private int age;
    
    // Constructeur par défaut
    public Person() {
        this.nom = "Inconnu";
        this.age = 0;
    }
    
    // Constructeur avec paramètres
    public Person(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }
    
    // Méthode sePresenter
    public void sePresenter() {
        System.out.println("Je m'appelle " + nom + " et j'ai " + age + " ans.");
    }
}