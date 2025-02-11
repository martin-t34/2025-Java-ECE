package ExercicesJavaB2.Exo3;

public class CompteBancaire {
    private double solde;
    private Person titulaire;
    
    // Constructeur
    public CompteBancaire(Person titulaire, double soldeInitial) {
        this.titulaire = titulaire;
        this.solde = soldeInitial;
    }
    
    // Méthode deposer
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println("Dépôt de " + montant + " effectué. Nouveau solde: " + solde);
        } else {
            System.out.println("Le montant du dépôt doit être positif.");
        }
    }
    
    // Méthode retirer
    public void retirer(double montant) {
        if (montant > 0 && solde >= montant) {
            solde -= montant;
            System.out.println("Retrait de " + montant + " effectué. Nouveau solde: " + solde);
        } else {
            System.out.println("Retrait impossible. Solde insuffisant ou montant négatif.");
        }
    }
}