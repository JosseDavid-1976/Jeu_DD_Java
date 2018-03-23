package jeu;

/**
 * The type Magicien.
 */
public class Magicien extends Personnage {
    private String sortDeBase = "Pas encore de sort";
    private boolean philtre = true;
    /**
     * The Sort.
     */
    Sorts sort = new Sorts();

    /**
     * Gets sort.
     *
     * @return the sort
     */
    public String getSort() {
        return this.sort.getNom();
    }

    /**
     * Gets philtre.
     *
     * @return the philtre
     */
    public boolean getPhiltre() {
        return this.philtre;

    }

    /**
     * Sets sort.
     *
     * @param NouveauSort the nouveau sort
     */
    public void setSort(Sorts NouveauSort) {
        this.sort = NouveauSort;
    }

    /**
     * Sets philtre.
     *
     * @param philtre the philtre
     */
    public void setPhiltre(boolean philtre) {
        this.philtre = philtre;
    }

    /**
     * To string string.
     *
     * @return the string
     */
    public String toString() {
        return "MAGICIEN : " + "\n" + super.toString()  + this.sort.toString() + "\n" + "Philtre : " + this.philtre;
    }

    /**
     * Instantiates a new Magicien.
     *
     * @param nom     the nom
     * @param img     the img
     * @param vie     the vie
     * @param attaque the attaque
     * @param sort    the sort
     * @param philtre the philtre
     */
    public Magicien(String nom, String img, int vie, int attaque, Sorts sort, boolean philtre )
    {
        this.setNom(nom);
        this.setImg(img);
        this.setVie(vie);
        this.setAttaque(attaque);
        this.setSort(sort);
        this.setPhiltre(philtre);

    }


}
