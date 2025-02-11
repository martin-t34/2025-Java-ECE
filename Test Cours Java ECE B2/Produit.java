

public class Produit {
    protected double prixHT;

    public Produit(double prixHT) {
        this.prixHT = prixHT;
    }

    public double calculerPrix() {
        return prixHT * 1.05; // TVA de 5%
    }
}