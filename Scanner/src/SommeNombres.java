import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SommeNombres {
    public static float SommeNombres(String chaine) {
        Scanner sc_liste = new Scanner(chaine);
        float somme = 0;

        sc_liste.useDelimiter("");

        while (sc_liste.hasNext()) {
            if (sc_liste.hasNextInt()) {
                somme += sc_liste.nextInt();
            } else {
                sc_liste.next();
            }
        }
        sc_liste.close();
        return somme;
    }

    public static void main(String[] args) {
        String chaine = "3 un deux 4 3,5 -20";
        float nombres = SommeNombres(chaine);
        System.out.println(nombres);
    }
}
