public class Salle {
    int largeurSalle;
    int longueurSalle;
    int largeurScene;
    int longueurScene;
    Ville ville;

    public Salle(int largeurSalle, int longueurSalle, int largeurScene, int longueurScene, Ville ville) {
        this.largeurSalle = largeurSalle;
        this.longueurSalle = longueurSalle;
        this.largeurScene = largeurScene;
        this.longueurScene = longueurScene;
        this.ville = ville;
    }

    // Création des getters et setters
    public int getLargeurSalle() {
        return largeurSalle;
    }
    public int getLongueurSalle() {
        return longueurSalle;
    }
    public int getLargeurScene() {
        return largeurScene;
    }
    public int getLongueurScene() {
        return longueurScene;
    }
    public Ville ville() {
        return ville;
    }

    // Méthode pour calculer le nombre de places disponibles
    public int nbPlacesDisponibles() {
        return (largeurSalle * longueurSalle) - (largeurScene * longueurScene);
    }

    // Méthode pour afficher les informations d'une salle
    public String toString() {
        return "Salle{" +
                "largeurSalle=" + largeurSalle +
                ", longueurSalle=" + longueurSalle +
                ", largeurScene=" + largeurScene +
                ", longueurScene=" + longueurScene +
                ", nomVille=" + ville +
                '}';
    }
}

