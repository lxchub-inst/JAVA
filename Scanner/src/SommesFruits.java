import java.util.Scanner;

public class SommesFruits {
    public static void SommesFruits(String chaine) {
        Scanner sc = new Scanner(chaine);
        String fruitCourant = null;
        int somme = 0;

        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                int nombre = sc.nextInt();
                somme += nombre;
            } else {
                // Si l'élément n'est pas un nombre, c'est un nom de fruit
                if (fruitCourant != null) {
                    // Afficher la somme du fruit précédent
                    System.out.println(fruitCourant + ": " + somme);
                }
                // Définir le nouveau fruit courant
                fruitCourant = sc.next();
                somme = 0; // Réinitialiser la somme pour le nouveau fruit
            }
        }

        // Afficher la somme du dernier fruit
        if (fruitCourant != null) {
            System.out.println(fruitCourant + ": " + somme);
        }

        sc.close();
    }

    public static void main(String[] args) {
        String chaine = "Bananes 10 3 Poires 5 Pommes 1 2 1";
        SommesFruits(chaine);
    }
}
