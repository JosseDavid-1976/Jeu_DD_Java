package jeu;

public abstract class Personnage {
    private String nom = "Inconnu";
    private String img = "url";
    private int vie = 0;
    private int attaque = 0;


    public String getNom() {
        return this.nom;
    }

    public String getImg() {
        return this.img;
    }

    public int getVie() {
        return this.vie;
    }

    public int getAttaque() {
        return this.attaque;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public String toString() {
        return "Nom : " + this.nom + "\n" +
                "Image : " + this.img + "\n" +
                "Vie : " + this.vie + "\n" +
                "Attaque : " + this.attaque + "\n";

    }


}