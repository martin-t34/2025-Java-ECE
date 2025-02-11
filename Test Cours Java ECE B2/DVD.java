

public class DVD extends Produit {

    public DVD(double prixHT) {
        super(prixHT);
    }

    @Override
    public double calculerPrix() {
        return super.calculerPrix(); // Utilise la méthode de la classe parent
    }
}