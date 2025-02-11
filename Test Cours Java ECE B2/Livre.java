

public class Livre extends Produit {

    public Livre(double prixHT) {
        super(prixHT);
    }

    @Override
    public double calculerPrix() {
        return super.calculerPrix(); // Utilise la méthode de la classe parent
    }
}