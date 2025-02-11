package ExercicesJavaB2.Exo3;

public class Main {
    public static void main(String[] args) {
        // Instanciation de la classe Person
        Person person1 = new Person();
        Person person2 = new Person("Alice", 25);
        
        // Appel de la méthode sePresenter
        person1.sePresenter();
        person2.sePresenter();
        
        // Instanciation de la classe CompteBancaire
        CompteBancaire compte = new CompteBancaire(person2, 1000);
        
        // Opérations sur le compte bancaire
        compte.deposer(500);
        compte.retirer(200);
        compte.retirer(1500); // Cette opération devrait échouer car le solde ne peut pas être négatif
    }
} 