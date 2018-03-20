package jeu;
import java.util.Scanner;
public class Game {
    private static Guerrier guerrier;
    private  static Magicien magicien;
    public static void main(String[] args) {
        boolean resteEnJeu = true;
        while (resteEnJeu) {
            System.out.println("Test de fonctionnement");
            System.out.println("<----------------------->");
            Scanner sc = new Scanner(System.in);

            System.out.println("Que voulez vous faire:1- Créer un personnage 2- Afficher un personnage 3- Quitter ");
            String choixUtilisateur = sc.nextLine();
            if (choixUtilisateur.equals("1")) {
                    creePerso();
            } else if (choixUtilisateur.equals("2")) {
            System.out.println("Que voulez-vous faire maintenant : 1- Afficher Guerrier 2- Afficher Magicien 3- Modifier Guerrier 4- Modifier Magicien ");
            String ChoixPerso = sc.nextLine();

            if (ChoixPerso.equals("1")) {
//affichage guerrier construie
                System.out.println("<----------------------->");

                System.out.println("Nom du Guerrier :" + guerrier.getNom());

                System.out.println("A quoi ressemble ton Guerrier :" + guerrier.getImg());

                System.out.println("Niveau de Vie du Guerrier :" + guerrier.getVie());

                System.out.println("Force de l'attaque de votre Guerrier  :" + guerrier.getAttaque());

                System.out.println("Arme de votre Guerrier  :" + guerrier.getArme());

                System.out.println("Guerrier équipé d'un bouclier :" + guerrier.getBouclier());
                System.out.println("<----------------------->");


            }else if (ChoixPerso.equals("2")){
                // affichage magicien
                System.out.println("<----------------------->");
                System.out.println("Nom du Magicien :" + magicien.getNom());
                System.out.println("<----------------------->");
                System.out.println(magicien.getImg());
                System.out.println("<----------------------->");
                System.out.println("Niveau de Vie : " + magicien.getVie());
                System.out.println("<----------------------->");
                System.out.println("Force de l'attaque : " + magicien.getAttaque());
                System.out.println("<----------------------->");
                System.out.println("Sort : " + magicien.getSort());
                System.out.println("Philtre : " + magicien.getPhiltre());
                System.out.println("<----------------------->");

                // modifier perso
            } else if (ChoixPerso.equals("3")) {
                boolean modifierPerso = true;
                while (modifierPerso) {
                    System.out.println("Que voulez-vous modifier : 1- Nom 2- Image 3- Vie 4- Force Attaque 5- Arme 6- Bouclier 7- Sortir ");
                    String modifier = sc.nextLine();
                    String NomGuerrier;
                    String ImgGuerrier;
                    int GuerrierLife;
                   int GuerrierAtt;
                   boolean GuerrierBouclier;
                   String ArmeGuerrier;
                    switch (modifier) {
                        case "1":
                            System.out.println("<----------------------->");
                            System.out.println("Nom de votre Guerrier  :");
                            NomGuerrier = sc.nextLine();
                            System.out.println("<----------------------->");
                            break;
                        case "2":
                            System.out.println("<----------------------->");
                            System.out.println("Image de votre Guerrier  :");
                            ImgGuerrier = sc.nextLine();
                            System.out.println("<----------------------->");
                            break;
                        case "3":
                            System.out.println("<----------------------->");
                            System.out.println("Niveau de vie de votre Guerrier  :");
                            String VieGuerrier = sc.nextLine();
                            GuerrierLife = Integer.parseInt(VieGuerrier);
                            System.out.println("<----------------------->");
                            break;
                        case "4":
                            System.out.println("<----------------------->");
                            System.out.println("Force de l'attaque de votre Guerrier  :");
                            String AttGuerrier = sc.nextLine();
                            GuerrierAtt = Integer.parseInt(AttGuerrier);
                            System.out.println("<----------------------->");
                            break;
                        case "5":
                            System.out.println("<----------------------->");
                            System.out.println("Arme de votre Guerrier  :");
                            ArmeGuerrier = sc.nextLine();
                            break;
                        case "6":
                            System.out.println("Guerrier équipé d'un bouclier : true ou false ");
                            String BouclierGuerrier = sc.nextLine();
                            GuerrierBouclier = Boolean.valueOf(BouclierGuerrier);
                            break;
                        case "7":
                            modifierPerso = false;
                            break;
                        default:
                            System.out.println("Choisir entre 1 et 7 ");
                            break;
                    }
                }
            } else if (ChoixPerso.equals("4")) {

            } else {
                System.out.println("Quatre choix ne te suffisent pas deviens Développeur et fait ce que tu veux");
            }

            } else if (choixUtilisateur.equals("3")){

            }
            else {
                System.out.println("<----------------------->");
                System.out.println("Deux choix seulement : 1 = Guerrier ou  2 = Magicien" );
                System.out.println("<----------------------->");
            }

        }
    }
    static void creePerso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez vous faire:1- Guerrier 2- Magicien");
        String gOuM = sc.nextLine();
        if (gOuM.equals("1")){
            System.out.println("<----------------------->");
            guerrier = new Guerrier();
// creation du guerrier
            System.out.println("Nom de votre Guerrier  :");
            String NomGuerrier = sc.nextLine();
            guerrier.setNom(NomGuerrier);
            System.out.println("<----------------------->");
            System.out.println("Image de votre Guerrier  :");
            String ImgGuerrier = sc.nextLine();
            guerrier.setImg(ImgGuerrier);
            System.out.println("<----------------------->");
            System.out.println("Niveau de vie de votre Guerrier  :");
            String VieGuerrier = sc.nextLine();
            int GuerrierLife = Integer.parseInt(VieGuerrier);
            guerrier.setVie(GuerrierLife);
            System.out.println("<----------------------->");
            System.out.println("Force de l'attaque de votre Guerrier  :");
            String AttGuerrier = sc.nextLine();
            int GuerrierAtt = Integer.parseInt(AttGuerrier);
            guerrier.setAttaque(GuerrierAtt);
            System.out.println("<----------------------->");
            System.out.println("Arme de votre Guerrier  :");
            String ArmeGuerrier = sc.nextLine();
            guerrier.setArme(ArmeGuerrier);
            System.out.println("Guerrier équipé d'un bouclier : true ou false ");
            String BouclierGuerrier = sc.nextLine();
            boolean GuerrierBouclier = Boolean.valueOf(BouclierGuerrier);
            guerrier.setBouclier(GuerrierBouclier);
        }else if (gOuM.equals("2")){
            Magicien magicien = new Magicien();
            System.out.println("Nom de votre Magicien  :");
            String NomMagicien = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Image de votre Magicien  :");
            String ImgMagicien = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Niveau de vie de votre Magicien  :");
            String VieMagicien = sc.nextLine();
            int MagicienLife = Integer.parseInt(VieMagicien);
            System.out.println("<----------------------->");
            System.out.println("Force de l'attaque de votre Magicien  :");
            String AttMagicien = sc.nextLine();
            int MagicienAtt = Integer.parseInt(AttMagicien);
            System.out.println("<----------------------->");
            System.out.println("Sort de votre Magicien  :");
            String SortMagicien = sc.nextLine();
            System.out.println("Magicien équipé d'un philtre : true ou false ");
            String PhiltreMagicien = sc.nextLine();
            boolean MagicienPhiltre = Boolean.valueOf(PhiltreMagicien);
            System.out.println("<----------------------->");
            System.out.println("<----------------------->");
            magicien.setNom(NomMagicien);
            System.out.println("Nom du Magicien :" + magicien.getNom());
            magicien.setImg(ImgMagicien);
            System.out.println("A quoi ressemble ton Magicien :" + magicien.getImg());
            magicien.setVie(MagicienLife);
            System.out.println("Niveau de Vie du Magicien :" + magicien.getVie());
            magicien.setAttaque(MagicienAtt);
            System.out.println("Force de l'attaque de votre Magicien  :" + magicien.getAttaque());
            magicien.setSort(SortMagicien);
            System.out.println("Sort de votre Magicien  :" + magicien.getSort());
            magicien.setPhiltre(MagicienPhiltre);
            System.out.println("Magicien équipé d'un philtre :" + magicien.getPhiltre());

            System.out.println("<----------------------->");

        }else {
            System.out.println("Deux type de personnages possible : Choisir 1 ou 2");
        }
    }
}
