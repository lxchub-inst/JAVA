import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SommeNombres {
    public static List<String> SommeNombres(String chaine) {
        List<String> listeNombres = new ArrayList<>();
        Scanner sc_liste = new Scanner(chaine);

        sc_liste.useDelimiter("");

        while (sc_liste.hasNext()) {
            int nombre = Integer.parseInt(sc_liste.next());
            nombre++;
        }
        return listeNombres;
    }
}
