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
}

