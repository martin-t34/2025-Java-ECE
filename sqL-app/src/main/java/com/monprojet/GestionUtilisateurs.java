package com.monprojet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GestionUtilisateurs {

    public static void afficherUtilisateurs() {
        String query = "SELECT * FROM utilisateurs";
        try (Connection connexion = Connexion.getConnection();
             PreparedStatement statement = connexion.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + ", Email: " + resultSet.getString("email") + ", Nom: " + resultSet.getString("nom"));
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'affichage des utilisateurs : " + e.getMessage());
        }
    }

    public static void ajouterUtilisateur(String email, String nom) {
        String query = "INSERT INTO utilisateurs (email, nom) VALUES (?, ?)";
        try (Connection connexion = Connexion.getConnection();
             PreparedStatement statement = connexion.prepareStatement(query)) {

            statement.setString(1, email);
            statement.setString(2, nom);
            statement.executeUpdate();
            System.out.println("Utilisateur ajouté avec succès.");
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'ajout de l'utilisateur : " + e.getMessage());
        }
    }

    public static void retirerUtilisateur(int id) {
        String query = "DELETE FROM utilisateurs WHERE id = ?";
        try (Connection connexion = Connexion.getConnection();
             PreparedStatement statement = connexion.prepareStatement(query)) {

            statement.setInt(1, id);
            statement.executeUpdate();
            System.out.println("Utilisateur retiré avec succès.");
        } catch (SQLException e) {
            System.err.println("Erreur lors du retrait de l'utilisateur : " + e.getMessage());
        }
    }

    public static void mettreAJourUtilisateur(int id, String email, String nom) {
        String query = "UPDATE utilisateurs SET email = ?, nom = ? WHERE id = ?";
        try (Connection connexion = Connexion.getConnection();
             PreparedStatement statement = connexion.prepareStatement(query)) {

            statement.setString(1, email);
            statement.setString(2, nom);
            statement.setInt(3, id);
            statement.executeUpdate();
            System.out.println("Utilisateur mis à jour avec succès.");
        } catch (SQLException e) {
            System.err.println("Erreur lors de la mise à jour de l'utilisateur : " + e.getMessage());
        }
    }

    public static void rechercherUtilisateurParEmail(String email) {
        String query = "SELECT * FROM utilisateurs WHERE email = ?";
        try (Connection connexion = Connexion.getConnection();
             PreparedStatement statement = connexion.prepareStatement(query)) {

            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    System.out.println("ID: " + resultSet.getInt("id") + ", Email: " + resultSet.getString("email") + ", Nom: " + resultSet.getString("nom"));
                } else {
                    System.out.println("Aucun utilisateur trouvé avec cet email.");
                }
            }
        } catch (SQLException e) {
            System.err.println("Erreur lors de la recherche de l'utilisateur : " + e.getMessage());
        }
    }
}
