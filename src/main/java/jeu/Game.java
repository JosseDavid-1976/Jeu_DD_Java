package jeu;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    private static Guerrier guerrier;
    private static Magicien magicien;
   private static ArrayList<Personnage> personnages = new ArrayList();
    ////////////////////////////////////////main/////////////////////////////////////////////////////////////
    public static void main(String[] args) {

        boolean resteEnJeu = true;
        while (resteEnJeu) {
            System.out.println("Test de fonctionnement");
            System.out.println("<----------------------->");
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez vous faire:1- Créer un personnage 2- Afficher les personnages ou les modifier 3- Quitter ");
            String choixUtilisateur = sc.nextLine();
            if (choixUtilisateur.equals("1")) {
                personnages.add(creePerso());//stockage de mes personnages dans un tableau
            } else if (choixUtilisateur.equals("2")) {
                System.out.println("Que voulez-vous faire maintenant : 1- Afficher les personnages 2- Modifier Guerrier 3- Modifier Magicien 4- attend j'ai pas fini de coder ");
                String ChoixPerso = sc.nextLine();
                if (ChoixPerso.equals("1")) {//affichage des personnags
                    for (int i = 0; i < personnages.size(); i++) {
                        System.out.println("<-----------------> " + "\n" + i + " = " + personnages.get(i).toString());
                    }
                } else if (ChoixPerso.equals("2")) {//modifier guerrier
                    System.out.println("Rentrez l'index du Guerrier à modifier :");
                    String ModGuer = sc.nextLine();
                    int GuerMod = Integer.parseInt(ModGuer);
                    ModifierPersoG((Guerrier) (personnages.get(GuerMod)));
                } else if (ChoixPerso.equals("3")) { // modifier Magicien
                    System.out.println("Rentrez l'index du Magicien à modifier :");
                    int ModGuer = sc.nextInt();
                    sc.nextLine();
                    ModifierPersoM((Magicien) (personnages.get(ModGuer)));
                } else if (ChoixPerso.equals("4")) {

                }
            } else if (choixUtilisateur.equals("3")) {
                resteEnJeu = false;
            } else {
                System.out.println("<----------------------->");
                System.out.println("3 choix seulement : 1 = Guerrier ou  2 = Magicien 3 = Quiter le jeu");
                System.out.println("<----------------------->");
            }
        }
    }

    ///////////////////////////////////////METHODE///////////////////////////////////////////////////////
    static Personnage creePerso() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez vous faire:1- Guerrier 2- Magicien");
        String gOuM = sc.nextLine();
        if (gOuM.equals("1")) {/////////////// creation du guerrier
            System.out.println("<----------------------->");
            guerrier = new Guerrier();
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
            return guerrier;
        } else if (gOuM.equals("2")) {//////////////////creation magicien

//            magicien = new Magicien();
            System.out.println("Nom de votre Magicien  :");
            String nom = sc.nextLine();
//            magicien.setNom(NomMagicien);
            System.out.println("<----------------------->");
            System.out.println("Image de votre Magicien  :");
            String img = sc.nextLine();
//            magicien.setImg(ImgMagicien);
            System.out.println("<----------------------->");
            System.out.println("Niveau de vie de votre Magicien  :");
            String life = sc.nextLine();
            int vie = Integer.parseInt(life);
//            magicien.setVie(MagicienLife);
            System.out.println("<----------------------->");
            System.out.println("Force de l'attaque de votre Magicien  :");
            String AttMagicien = sc.nextLine();
            int attaque = Integer.parseInt(AttMagicien);
//            magicien.setAttaque(MagicienAtt);
            System.out.println("<----------------------->");
            System.out.println("Sort de votre Magicien  :");
            String sort = sc.nextLine();
//            magicien.setSort(SortMagicien);
            System.out.println("Magicien équipé d'un philtre : true ou false ");
            String PhiltreMagicien = sc.nextLine();
            boolean philtre = Boolean.valueOf(PhiltreMagicien);

            Magicien mag = new Magicien(nom,img,vie,attaque,sort,philtre);
            personnages.add(mag);
//            magicien.setPhiltre(MagicienPhiltre);
           return mag;

                    } else {
            System.out.println("Deux type de personnages possible : Choisir 1 ou 2");
            return new Guerrier();
        }

    }

    private static void ModifierPersoG(Guerrier p) {//////////////////////modifier guerrier
        Scanner sc = new Scanner(System.in);
        boolean modifierPerso = true;
        while (modifierPerso) {
            System.out.println("Que voulez-vous modifier : 1- Nom 2- Image 3- Vie 4- Force Attaque 5- Arme 6- Bouclier 7- Sortir ");
            String modifierG = sc.nextLine();
            String NomGuerrier;
            String ImgGuerrier;
            int GuerrierLife;
            int GuerrierAtt;
            boolean GuerrierBouclier;
            String ArmeGuerrier;
            switch (modifierG) {
                case "1":
                    System.out.println("<----------------------->");
                    System.out.println("Nom de votre Guerrier  :");
                    NomGuerrier = sc.nextLine();
                    p.setNom(NomGuerrier);
                    System.out.println("<----------------------->");

                    break;
                case "2":
                    System.out.println("<----------------------->");
                    System.out.println("Image de votre Guerrier  :");
                    ImgGuerrier = sc.nextLine();
                    p.setImg(ImgGuerrier);
                    System.out.println("<----------------------->");
                    break;
                case "3":
                    System.out.println("<----------------------->");
                    System.out.println("Niveau de vie de votre Guerrier  :");
                    String VieGuerrier = sc.nextLine();
                    GuerrierLife = Integer.parseInt(VieGuerrier);
                    p.setVie(GuerrierLife);
                    System.out.println("<----------------------->");
                    break;
                case "4":
                    System.out.println("<----------------------->");
                    System.out.println("Force de l'attaque de votre Guerrier  :");
                    String AttGuerrier = sc.nextLine();
                    GuerrierAtt = Integer.parseInt(AttGuerrier);
                    p.setAttaque(GuerrierAtt);
                    System.out.println("<----------------------->");
                    break;
                case "5":
                    System.out.println("<----------------------->");
                    System.out.println("Arme de votre Guerrier  :");
                    ArmeGuerrier = sc.nextLine();
                    p.setArme(ArmeGuerrier);
                    break;
                case "6":
                    System.out.println("Guerrier équipé d'un bouclier : true ou false ");
                    String BouclierGuerrier = sc.nextLine();
                    GuerrierBouclier = Boolean.valueOf(BouclierGuerrier);
                    p.setBouclier(GuerrierBouclier);
                    break;
                case "7":
                    modifierPerso = false;
                    break;
                default:
                    System.out.println("Choisir entre 1 et 7 ");
                    break;
            }
        }
    }

    private static void ModifierPersoM(Magicien p) {//////////////////////////////modifier magicien
        Scanner sc = new Scanner(System.in);
        boolean modifierMago = true;
        while (modifierMago) {
            System.out.println("Que voulez-vous modifier : 1- Nom 2- Image 3- Vie 4- Force Attaque 5- Sort 6- Philtre 7- Sortir ");
            String modifierM = sc.nextLine();
            String NomMagicien;
            String ImgMagicien;
            int MagicienLife;
            int MagicienAtt;
            boolean MagicienPhiltre;
            String SortMagicien;
            switch (modifierM) {
                case "1":
                    System.out.println("<----------------------->");
                    System.out.println("Nom de votre Magicien  :");
                    NomMagicien = sc.nextLine();
                    p.setNom(NomMagicien);
                    System.out.println("<----------------------->");
                    break;
                case "2":
                    System.out.println("<----------------------->");
                    System.out.println("Image de votre Magicien  :");
                    ImgMagicien = sc.nextLine();
                    p.setImg(ImgMagicien);
                    System.out.println("<----------------------->");
                    break;
                case "3":
                    System.out.println("<----------------------->");
                    System.out.println("Niveau de vie de votre Magicien  :");
                    String VieMagicien = sc.nextLine();
                    MagicienLife = Integer.parseInt(VieMagicien);
                    p.setVie(MagicienLife);
                    System.out.println("<----------------------->");
                    break;
                case "4":
                    System.out.println("<----------------------->");
                    System.out.println("Force de l'attaque de votre Magicien  :");
                    String AttMagicien = sc.nextLine();
                    MagicienAtt = Integer.parseInt(AttMagicien);
                    p.setAttaque(MagicienAtt);
                    System.out.println("<----------------------->");
                    break;
                case "5":
                    System.out.println("<----------------------->");
                    System.out.println("Sortilége de votre Magicien  :");
                    SortMagicien = sc.nextLine();
                    p.setSort(SortMagicien);
                    break;
                case "6":
                    System.out.println("Magicien équipé d'un Philtre : true ou false ");
                    String PhiltreMagicien = sc.nextLine();
                    MagicienPhiltre = Boolean.valueOf(PhiltreMagicien);
                    p.setPhiltre(MagicienPhiltre);
                    break;
                case "7":
                    modifierMago = false;
                    break;
                default:
                    System.out.println("Choisir entre 1 et 7 ");
                    break;
            }
        }
    }
}

