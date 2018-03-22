package jeu;

public class Guerrier extends Personnage {
    private String armeDeBase = "Pas encore d'arme";
    private boolean bouclier = true;
    Armes arme = new Armes();

    public String getArme() {
        return this.arme.getNom();
    }

    public boolean getBouclier() {
        return this.bouclier;
    }

    public void setArme(Armes NouvelArme) {
        this.arme = NouvelArme;
    }

    public void setBouclier(boolean bouclier) {
        this.bouclier = bouclier;
    }

    public String toString() {
        return "GUERRIER : " + "\n" + super.toString() +  this.arme.toString() + "Bouclier : " + "\n" + this.bouclier;
    }
    public Guerrier(String nom, String img, int vie, int attaque, Armes arme, boolean bouclier ){
        this.setNom(nom);
        this.setImg(img);
        this.setVie(vie);
        this.setAttaque(attaque);
        this.setArme(arme);
        this.setBouclier(bouclier);
    }
    public Guerrier(){}

}
