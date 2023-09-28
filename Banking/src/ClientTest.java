public class ClientTest {

    public static void testerAffichage() {
        // Affichage d'un client avec l'appelation de la variable -> attribut
        Client FirstClient = new Client("Doe", "John", "A1", "01/01/2000");
        System.out.println("Voici mon client " + FirstClient);
    }
    public static void main(String[] args) {
        testerAffichage();
    }
}
