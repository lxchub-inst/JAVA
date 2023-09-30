public class Account {

    // Properties
    private String accountNumber;
    private float balance;

    // Constructor
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Une méthode qui permet d'afficher le solde d'un compte
    public float getBalance() {
        return balance;
    }

    // Augmentation du solde après un crédit
    public void credit(float amount) {
        this.balance += amount;
    }

    // Diminution du solde après un débit
    public float debit(float amount) {
        if (amount <= balance) {
            System.out.println("Le montant du débit est supérieur au solde du compte");
        } else {
            this.balance -= amount;
            return amount;
        }
        return 0;
    }

    // Une méthode qui permet d'afficher un compte
    public static void testerAffichage() {
        Account FirstAccount = new Account("A1");
        // Affichage d'un compte avec l'appelation de la variable -> attribut
        System.out.println("Voici mon compte " + FirstAccount.accountNumber + " avec un solde de " + FirstAccount.balance + " EUR");

        // Affichage d'un compte avec la variable seulement
        System.out.println("Voici mon compte " + FirstAccount);

        // Affichage d'un compte avec la mtéhode toString
        System.out.println("Voici mon compte " + FirstAccount.toString());
    }

    // Une méthode qui permet de tester le solde d'un compte
    public static void testergetBalance() {
        Account a = new Account("134");
        System.out.println("Après construction, le solde devrait être 0. Obtenu : " + a.getBalance());
    }

    // Une méthode qui permet de tester le crédit d'un compte
    public static void testerCredit() {
        Account account1 = new Account("A1");
        account1.credit(50);
        System.out.println("Après crédit de 50, le solde devrait être de : \t" + account1.getBalance());
        account1.credit(20.5F);
        System.out.println("Après crédit de 20.5, le solde devrait être de : \t" + account1.getBalance());
    }

    // Une méthode qui permet de tester le débit d'un compte
    public static void testerDebit() {
        Account account1 = new Account("A1");
        account1.credit(20);
        System.out.println("Après crédit de 20, le solde devrait être de : \t" + account1.getBalance());
        account1.debit(50);
        System.out.println("Après débit de 50, le solde devrait être de : \t" + account1.getBalance());
        account1.credit(100);
        System.out.println("Après crédit de 100, le solde devrait être de : \t" + account1.getBalance());
        account1.debit(20.5F);
        System.out.println("Après débit de 20.5, le solde devrait être de : \t" + account1.getBalance());
    }

    // Une méthode qui permet de tester l'affichage d'un compte
    public String toString() {
        return "Account{" + "accountNumber='" + accountNumber + '\'' + ", balance=" + balance + '}';
    }

    // Method main
    public static void main(String[] args) {
//        testerAffichage();
//        testergetBalance();
        testerCredit();
        testerDebit();
    }
}
