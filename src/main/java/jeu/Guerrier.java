package jeu;

/**
 * The type Guerrier.
 */
public class Guerrier extends Personnage {
    private String armeDeBase = "Pas encore d'arme";
    private boolean bouclier = true;
    /**
     * The Arme.
     */
     Armes arme = new Armes();

    /**
     * Gets arme.
     *
     * @return the arme
     */
    public Armes getArme() {
        return this.arme;
    }

    /**
     * Gets bouclier.
     *
     * @return the bouclier
     */
    public boolean getBouclier() {
        return this.bouclier;
    }

    /**
     * Sets arme.
     *
     * @param NouvelArme the nouvel arme
     */
    public void setArme(Armes NouvelArme) {
        this.arme = NouvelArme;
    }

    /**
     * Sets bouclier.
     *
     * @param bouclier the bouclier
     */
    public void setBouclier(boolean bouclier) {
        this.bouclier = bouclier;
    }

    /**
     * To string string.
     *
     * @return the string
     */
    public String toString() {
        return "GUERRIER : " + "\n" + super.toString() +  this.arme.toString() + "Bouclier : " + "\n" + this.bouclier;
    }

    /**
     * Instantiates a new Guerrier.
     *
     * @param nom      the nom
     * @param img      the img
     * @param vie      the vie
     * @param attaque  the attaque
     * @param arme     the arme
     * @param bouclier the bouclier
     */
    public Guerrier(String nom, String img, int vie, int attaque, Armes arme, boolean bouclier ){
        this.setNom(nom);
        this.setImg(img);
        this.setVie(vie);
        this.setAttaque(attaque);
        this.setArme(arme);
        this.setBouclier(bouclier);
    }

    /**
     * Instantiates a new Guerrier.
     */
    public Guerrier(){}

}
