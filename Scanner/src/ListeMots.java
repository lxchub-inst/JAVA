import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListeMots {
    public static List<String> listeMots (String phrase) {
        List<String> liste = new ArrayList<>();
        Scanner sc_liste = new Scanner(phrase);

        // On délimite les mots par un espace
        sc_liste.useDelimiter(" ");

        // Tant qu'il y a un mot suivant
        while (sc_liste.hasNext()) {

            // On récupère le mot suivant
            String motDelimiter = sc_liste.next();

            // On ajoute le mot à la liste
            liste.add(motDelimiter);
        }

        // On ferme le scanner
        sc_liste.close();
        return liste;
    }

    public static void main(String[] args) {
        String phrase = "Hello World";

        // On récupère la liste des mots
        List<String> mots = listeMots(phrase);

        // On affiche les mots
        for (String mot : mots) {
            System.out.println(mot);
        }
    }
}
