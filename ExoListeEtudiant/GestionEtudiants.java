package ExoListeEtudiant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionEtudiants {
    private List<Etudiant> etudiants;

    public GestionEtudiants() {
        etudiants = new ArrayList<>();
    }

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiants.add(etudiant);
    }

    public void afficherEtudiants() {
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

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