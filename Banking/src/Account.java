public class Account {

    // Properties
    private String accountNumber;
    private float balance;

    // Constructor
    public Account(String accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method toString
    public static void testerAffichage() {
        Account FirstAccount = new Account("A1", 1000);
        // Affichage d'un compte avec l'appelation de la variable -> attribut
        System.out.println("Voici mon compte " + FirstAccount.accountNumber + " avec un solde de " + FirstAccount.balance + " EUR");

        // Affichage d'un compte avec la variable seulement
        System.out.println("Voici mon compte " + FirstAccount);

        // Affichage d'un compte avec la mtéhode toString
        System.out.println("Voici mon compte " + FirstAccount.toString());
    }

    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }

    // Method main
    public static void main(String[] args) {
        testerAffichage();
    }
}
