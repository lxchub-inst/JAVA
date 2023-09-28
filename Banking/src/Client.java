import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String nom;
    private String prenom;
    private String id_compte;
    private LocalDate date_naissance;

    // Constructor
    public Client(String nom, String prenom, String id_compte, String string) {
        this.nom = nom;
        this.prenom = prenom;
        this.id_compte = id_compte;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // convert String to LocalDate
        this.date_naissance = LocalDate.parse(string, formatter);
    }

    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", id_compte='" + id_compte + '\'' +
                ", date_naissance=" + date_naissance +
                '}';
    }
}