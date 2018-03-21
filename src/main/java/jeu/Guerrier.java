package jeu;

public class Guerrier extends Personnage {
    private String arme = "Pas encore d'arme";
    private boolean bouclier = true;

    public String getArme() {
        return this.arme;
    }

    public boolean getBouclier() {
        return this.bouclier;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public void setBouclier(boolean bouclier) {
        this.bouclier = bouclier;
    }
    public String toString() {
        return super.toString() + "Arme : " + this.arme + "\n" + "Bouclier : "+ this.bouclier;
    }
}
