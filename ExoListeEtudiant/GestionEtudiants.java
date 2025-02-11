package ExoListeEtudiant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionEtudiants {
    private List<Etudiant> etudiants;

    // Constructeur
    public GestionEtudiants() {
        etudiants = new ArrayList<>();
    }

    // Méthode pour ajouter un étudiant
    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    // Méthode pour afficher tous les étudiants
    public void afficherEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    // Méthode pour supprimer un étudiant par son nom
    public void supprimerEtudiantParNom(String nom) {
        Iterator<Etudiant> iterator = etudiants.iterator();
        while (iterator.hasNext()) {
            Etudiant etudiant = iterator.next();
            if (etudiant.getNom().equalsIgnoreCase(nom)) {
                iterator.remove();
                System.out.println("Étudiant " + nom + " supprimé.");
                return;
            }
        }
        System.out.println("Étudiant " + nom + " non trouvé.");
    }
}