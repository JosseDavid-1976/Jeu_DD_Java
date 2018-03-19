package jeu;

public abstract class Personnage {
    private String nom = "MonNom";
    private String img = "url";
    private int vie = 100;
    private int attaque = 10;


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
}