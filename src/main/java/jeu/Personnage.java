package jeu;

/**
 * The type Personnage.
 */
public abstract class Personnage {
    private String nom = "Inconnu";
    private String img = "url";
    private int vie = 0;
    private int attaque = 0;


    /**
     * Gets nom.
     *
     * @return the nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * Gets img.
     *
     * @return the img
     */
    public String getImg() {
        return this.img;
    }

    /**
     * Gets vie.
     *
     * @return the vie
     */
    public int getVie() {
        return this.vie;
    }

    /**
     * Gets attaque.
     *
     * @return the attaque
     */
    public int getAttaque() {
        return this.attaque;
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
     * Sets img.
     *
     * @param img the img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * Sets vie.
     *
     * @param vie the vie
     */
    public void setVie(int vie) {
        this.vie = vie;
    }

    /**
     * Sets attaque.
     *
     * @param attaque the attaque
     */
    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    /**
     * To string string.
     *
     * @return the string
     */
    public String toString() {
        return "Nom : " + this.nom + "\n" +
                "Image : " + this.img + "\n" +
                "Vie : " + this.vie + "\n" +
                "Attaque : " + this.attaque + "\n";

    }


}