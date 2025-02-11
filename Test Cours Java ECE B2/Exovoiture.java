public class Exovoiture {
    private String marque;
    private String modele;
    private String couleur;

    public Exovoiture(String marque, String modele, String couleur) {
        this.marque = marque;
        this.modele = modele;
        this.couleur = couleur;
    }

    public void afficherDetails() {
        System.out.println("Marque: " + marque);
        System.out.println("Modèle: " + modele);
        System.out.println("Couleur: " + couleur);
    }

    public void demarrer() {
        System.out.println("La voiture démarre.");
    }

    public void accelerer() {
        System.out.println("La voiture accélère.");
    }

    public void freiner() {
        System.out.println("La voiture freine.");
    }
}