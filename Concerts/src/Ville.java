public class Ville {
    String nom;
    float nbMaxSpectateurs;

    // Constructor
    public Ville(String nom, float nbMaxSpectateurs) {
        this.nom = nom;
        this.nbMaxSpectateurs = nbMaxSpectateurs;
    }
    public float getNbMaxSpectateurs() {
        return nbMaxSpectateurs;
    }
}
