import java.util.List;

public class Billeterie {
    public static void main(String[] args) {
        Ville Montreux = new Ville("Montreux", 3);
        Ville Bruxelles = new Ville("Bruxelles", 2.5F);
        Ville Carouge = new Ville("Carouge", 3.8F);

        Salle Stravinsky = new Salle(75, 20, 20, 10, Montreux);
        Salle Arena = new Salle(100, 30, 30, 15, Bruxelles);
        Salle ChatNoir = new Salle(15, 6, 6, 3, Carouge);

        Concert Mozart = new Concert("Mozart",  Stravinsky, "25/08/2020");
        Concert Chopin = new Concert("Chopin", Stravinsky, "26/08/2020");
        Concert Stromae = new Concert("Stromae", Arena, "10/10/2020");
        Concert Angele = new Concert("Angele", ChatNoir, "13/03/2020");

        // On crée une liste pour ajouter les différents concerts
        List<Concert> concerts = List.of(Mozart, Chopin, Stromae, Angele);

        /*
        * La méthode acheterBillets() permet d'ajouter un billet à un concert
        * La méthode estComplet() permet de vérifier si le concert est complet
        * La méthode toString() permet d'afficher les informations d'un concert
        * */
        for (Concert i : concerts) {
            for (int j = 0; j < 8000; j++) {
                acheterBillets(i);
            }
        }

        System.out.println(Mozart);
        System.out.println(Chopin);
        System.out.println(Stromae);
        System.out.println(Angele);
    }

    public static void acheterBillets(Concert concert) {
        int Superficie = (concert.salle().getLargeurSalle()  * concert.salle().getLongueurSalle()) - (concert.salle().getLargeurScene() * concert.salle().getLongueurScene());
        double personneTotale = concert.salle().ville().getNbMaxSpectateurs() * Superficie;

        if (concert.nbTicketsVendus < (int) personneTotale) {
            concert.nbTicketsVendus += 1;
        } else {
            concert.estComplet = true;
        }
    }
}
