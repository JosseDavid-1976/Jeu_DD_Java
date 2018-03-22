package jeu;

public class Magicien extends Personnage {
    private String sortDeBase = "Pas encore de sort";
    private boolean philtre = true;
    Sorts sort = new Sorts();

    public String getSort() {
        return this.sort.getNom();
    }

    public boolean getPhiltre() {
        return this.philtre;

    }

    public void setSort(Sorts NouveauSort) {
        this.sort = NouveauSort;
    }

    public void setPhiltre(boolean philtre) {
        this.philtre = philtre;
    }

    public String toString() {
        return "MAGICIEN : " + "\n" + super.toString()  + this.sort.toString() + "\n" + "Philtre : " + this.philtre;
    }

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
