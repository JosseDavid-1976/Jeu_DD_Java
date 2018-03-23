package jeu;

/**
 * The type Armes.
 */
public class Armes{
        private String nom ="Pas d'arme prends tes poings :)" ;
        private int puissance = 0;

    /**
     * Instantiates a new Armes.
     */
    public Armes(){}

    /**
     * Instantiates a new Armes.
     *
     * @param nom       the nom
     * @param puissance the puissance
     */
    public Armes(String nom, int puissance){
            this.nom = nom;
            this.puissance = puissance;
        }

    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Sets nom.
     *
     * @param nom the nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Gets puissance.
     *
     * @return the puissance
     */
    public int getPuissance() {
        return this.puissance;
    }

    /**
     * Sets puissance.
     *
     * @param puissance the puissance
     */
    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }


    /**
     * To string string.
     *
     * @return the string
     */
    public String toString() {
        return "Arme :" + nom + "\nPuissance :"+ puissance ;
    }
}