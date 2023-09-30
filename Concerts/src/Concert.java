import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Concert {
    String nomArtiste;
    LocalDate dateConcert;
    boolean estComplet;
    int nbTicketsVendus;

    // Héritage de la classe Salle
    Salle salle;

    // Constructor
    public Concert(String nomArtiste, Salle nomSalle, String string) {
        this.nomArtiste = nomArtiste;
        this.salle = nomSalle;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.dateConcert = LocalDate.parse(string, formatter);
    }

    public Salle salle() {
        return salle;
    }

    // Création des getters et setters
    public String getNomArtiste() {
        return nomArtiste;
    }

    public LocalDate getDateConcert() {
        return dateConcert;
    }

    public boolean isEstComplet() {
        return estComplet;
    }

    public Salle getSalle(){
        return salle;
    }

    public int getNbTicketsVendus() {
        return nbTicketsVendus;
    }
    // Méthode pour afficher les informations d'un concert
    public String toString() {
        return "Artiste " + getNomArtiste() + " | " + " Date: " + getDateConcert() + " | " + " Billets vendues " + getNbTicketsVendus();
    }
}