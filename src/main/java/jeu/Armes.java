package jeu;
public class Armes{
        private String nom ="Pas d'arme prend tes poings :)" ;
        private int puissance = 0;
        public Armes(){}

        public Armes(String nom, int puissance){
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
        return "Arme :\n" + nom + "\nPuissance : "+ puissance ;
    }
}