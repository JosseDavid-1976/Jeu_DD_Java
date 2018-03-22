package jeu;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    private static Guerrier guerrier;
    private static Magicien magicien;
    private static Armes armes;
    private static Sorts sorts;
   private static Scanner scannerInput = new Scanner(System.in);
//    private static ArrayList<Personnage> personnages = new ArrayList();

    ////////////////////////////////////////main/////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        ArrayList<Personnage> personnages = new ArrayList();
        boolean resteEnJeu = true;
//        boolean combat = true;
//        while (resteEnJeu) {
        System.out.println("Test de fonctionnement");
        System.out.println("<----------------------->");
        while (resteEnJeu) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez vous faire:1- Créer un personnage 2- Afficher/Modifier/Attaquer 3- Quitter ");
            String choixUtilisateur = sc.nextLine();
            if (choixUtilisateur.equals("1")) {
                personnages.add(creePerso());//stockage de mes personnages dans un tableau
            } else if (choixUtilisateur.equals("2")) {
                System.out.println("Que voulez-vous faire maintenant : 1- Afficher les personnages 2- Modifier Guerrier 3- Modifier Magicien 4- Attaquer 5- Sortir");
                String ChoixPerso = sc.nextLine();
                boolean goMenu = true;
                while (goMenu) {
                    if (ChoixPerso.equals("1")) {//affichage des personnags
                        for (int i = 0; i < personnages.size(); i++) {
                            System.out.println("<-----------------> " + "\n" + i + " = " + personnages.get(i).toString());
                        }  goMenu = false;
                    } else if (ChoixPerso.equals("2")) {//modifier guerrier
                        System.out.println("Rentrez l'index du Guerrier à modifier :");
                        String ModGuer = sc.nextLine();
                        int GuerMod = Integer.parseInt(ModGuer);
                        ModifierPersoG((Guerrier) (personnages.get(GuerMod)),(armes));
                        goMenu = false;
                    } else if (ChoixPerso.equals("3")) { // modifier Magicien
                        System.out.println("Rentrez l'index du Magicien à modifier :");
                        int ModGuer = sc.nextInt();
                        sc.nextLine();
                        ModifierPersoM((Magicien) (personnages.get(ModGuer)),(sorts));
                        goMenu = false;
                    } else if (ChoixPerso.equals("4")) {
                        Attaquer();
                        goMenu = false;
                    } else if (ChoixPerso.equals("5")) {
                        goMenu = false;
                    } else {
                        System.out.println("<----------------------->");
                        System.out.println("5 choix seulement : 1 -2 - 3 - 4 - 5");
                    }
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
        ArrayList<Personnage> personnages = new ArrayList();
        System.out.println("Que voulez vous faire:1- Guerrier 2- Magicien");
        String gOuM = sc.nextLine();
        if (gOuM.equals("1")) {/////////////// creation du guerrier
            System.out.println("<----------------------->");
            System.out.println("Nom de votre Guerrier  :");
            String nom = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Image de votre Guerrier  :");
            String img = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Niveau de vie de votre Guerrier  :");
            String VieGuerrier = sc.nextLine();
            int vie = Integer.parseInt(VieGuerrier);
            System.out.println("<----------------------->");
            System.out.println("Force de l'attaque de votre Guerrier  :");
            String AttGuerrier = sc.nextLine();
            int attaque = Integer.parseInt(AttGuerrier);
            System.out.println("<----------------------->");
            System.out.println("Nom de l'arme de votre Guerrier  :");
            String nomArme = sc.nextLine();
            System.out.println("Puissance de l'arme de votre Guerrier  :");
            int puissance = scannerInput.nextInt();
            armes = new Armes(nomArme,puissance);
            System.out.println("<----------------------->");
            System.out.println("Guerrier équipé d'un bouclier : true ou false ");
            String BouclierGuerrier = sc.nextLine();
            boolean bouclier = Boolean.valueOf(BouclierGuerrier);
            Guerrier guer = new Guerrier(nom, img, vie, attaque, armes, bouclier);
            personnages.add(guer);
            return guer;
        } else if (gOuM.equals("2")) {//////////////////creation magicien
            System.out.println("Nom de votre Magicien  :");
            String nom = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Image de votre Magicien  :");
            String img = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Niveau de vie de votre Magicien  :");
            String life = sc.nextLine();
            int vie = Integer.parseInt(life);
            System.out.println("<----------------------->");
            System.out.println("Force de l'attaque de votre Magicien  :");
            String AttMagicien = sc.nextLine();
            int attaque = Integer.parseInt(AttMagicien);
            System.out.println("<----------------------->");
            System.out.println("Nom du sort de votre Magicien  :");
            String nomSort = sc.nextLine();
            System.out.println("Puissance de sort de votre Magicien  :");
            int puissance = scannerInput.nextInt();
            sorts = new Sorts(nomSort,puissance);
            System.out.println("<----------------------->");
            System.out.println("Magicien équipé d'un philtre : true ou false ");
            String PhiltreMagicien = sc.nextLine();
            boolean philtre = Boolean.valueOf(PhiltreMagicien);
            Magicien mag = new Magicien(nom, img, vie, attaque, sorts, philtre);
            personnages.add(mag);
            return mag;
        } else {
            System.out.println("Deux type de personnages possible : Choisir 1 ou 2");
            return new Guerrier();
        }


    }

    private static void ModifierPersoG(Guerrier p,Armes n) {//////////////////////modifier guerrier
        Scanner sc = new Scanner(System.in);
        ArrayList<Personnage> personnages = new ArrayList();
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
//                    System.out.println("Arme de votre Guerrier  :");
//                    ArmeGuerrier = sc.nextLine();
//                    p.setArme(ArmeGuerrier);
                    System.out.println("Nom de l'arme de votre Guerrier  :");
                    String nomArme = sc.nextLine();
                    n.setNom(nomArme);
                    System.out.println("Puissance de l'arme de votre Guerrier  :");
                    int puissance = scannerInput.nextInt();
                    n.setPuissance(puissance);
                    armes = new Armes(nomArme,puissance);
                    System.out.println("<----------------------->");
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

    private static void ModifierPersoM(Magicien p,Sorts n) {//////////////////////////////modifier magicien
        Scanner sc = new Scanner(System.in);
        ArrayList<Personnage> personnages = new ArrayList();
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
//                    System.out.println("Sortilége de votre Magicien  :");
//                    SortMagicien = sc.nextLine();
//                    p.setSort(SortMagicien);
                    System.out.println("Nom du sort de votre Magicien  :");
                    String nomSort = sc.nextLine();
                    n.setNom(nomSort);
                    System.out.println("Puissance du sort de votre Magicien :");
                    int puissance = scannerInput.nextInt();
                    n.setPuissance(puissance);
                    sorts = new Sorts(nomSort,puissance);
                    System.out.println("<----------------------->");
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

    private static void Attaquer() {
        ArrayList<Personnage> personnages = new ArrayList();
        boolean combat = true;
//        System.out.println(combat);
        while (combat) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez vous faire : 1- Attaquer 2- Sortir");
            String choixCombat = sc.nextLine();
            if (choixCombat.equals("1")) {
                System.out.println("Saisir un niveau d'attaque :");
                String nivAt = sc.nextLine();

            } else if (choixCombat.equals("2")) {
                combat = false;

            } else {
                System.out.println("<----------------------->");
                System.out.println("Deux choix possibles : 1 ou 2");

            }
        }
    }
}
