package jeu;

/**
 * The type Sorts.
 */
public class Sorts{
    private String nom ="Pas de Sort prends tes poings :)";
    private int puissance =0;

    /**
     * Instantiates a new Sorts.
     */
    public Sorts(){}

    /**
     * Instantiates a new Sorts.
     *
     * @param nom       the nom
     * @param puissance the puissance
     */
    public Sorts(String nom,int puissance){
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
        return "Sort :" + nom + "\nPuissance :"+ puissance ;
    }

}