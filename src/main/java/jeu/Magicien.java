package jeu;

public class Magicien extends Personnage {
    private String sort = "Pas encore de sort";
    private boolean philtre = true;

    public String getSort() {
        return this.sort;
    }

    public boolean getPhiltre() {
        return this.philtre;

    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setPhiltre(boolean philtre) {
        this.philtre = philtre;
    }

    public String toString() {
        return "MAGICIEN : " + "\n" + super.toString() + "Sort : " + this.sort + "\n" + "Philtre : " + this.philtre;
    }

    public Magicien(String nom, String img, int vie, int attaque, String sort, boolean philtre )
    {
        this.setNom(nom);
        this.setImg(img);
        this.setVie(vie);
        this.setAttaque(attaque);
        this.setSort(sort);
        this.setPhiltre(philtre);

    }


}
