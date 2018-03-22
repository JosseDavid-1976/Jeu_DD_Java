package jeu;
public class Sorts{
    private String nom ="Pas de Sort prends tes poings :)";
    private int puissance =0;
    public Sorts(){}

    public Sorts(String nom,int puissance){
        this.nom = nom;
        this.puissance = puissance;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuissance() {
        return this.puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }
    public String toString() {
        return "Sort :" + nom + "\nPuissance : "+ puissance ;
    }

}