package jeu;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * The type Game.
 */
public class Game {
    private static Guerrier guerrier;
    private static Magicien magicien;
    private static Armes armes;
    private static Sorts sorts;
   private static Scanner scannerInput = new Scanner(System.in);
   private static ArrayList<Armes> armesList = new  ArrayList<Armes>();
    private static ArrayList<Personnage> personnages = new ArrayList<Personnage>();
private static ArrayList<Sorts> sortsList = new ArrayList<Sorts>();
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
////////////////////////////////////////main/////////////////////////////////////////////////////////////
    public static void main(String[] args) {
//        ArrayList<Personnage> personnages = new ArrayList<Personnage>();
//        ArrayList<Armes> armesList = new  ArrayList<Armes>();

        boolean resteEnJeu = true;
//        boolean combat = true;
//        while (resteEnJeu) {
        System.out.println("Test de fonctionnement");
        System.out.println("<----------------------->");
        while (resteEnJeu) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez vous faire:\n\t1- Créer un personnage\n\t2- Afficher/Modifier/Attaquer\n\t3- Quitter ");
            String choixUtilisateur = sc.nextLine();
            if (choixUtilisateur.equals("1")) {
//                Personnage perso = creePerso();
                personnages.add(creePerso());//stockage de mes personnages dans un tableau
//                armesList.add(perso.getArme());
            } else if (choixUtilisateur.equals("2")) {
                System.out.println("Que voulez-vous faire maintenant :\n\t1- Afficher les personnages\n\t2- Modifier Guerrier\n\t3- Modifier Magicien\n\t4- Attaquer\n\t5- Afficher les armes\n\t6- Afficher les sorts\n\t7- Sortir");
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
                    } else if (ChoixPerso.equals("4")) {////////Attaque
                        Attaquer();
                        goMenu = false;
                    }else if (ChoixPerso.equals("5")) {//////Liste des armes
//                        System.out.println(armesList);
                        for (int i = 0; i < armesList.size(); i++) {
                        System.out.println("<-----------------> " + "\n" + i + " = " + armesList.get(i).toString());
                    }  goMenu = false;

                    }else if (ChoixPerso.equals("6")) {//////Liste des sorts
//                        System.out.println(sortsList);
                        for (int i = 0; i < sortsList.size(); i++) {
                            System.out.println("<-----------------> " + "\n" + i + " = " + sortsList.get(i).toString());
                        }  goMenu = false;
                    }else if (ChoixPerso.equals("7")) {////sortie
                        goMenu = false;
                    } else {////erreur de saisie
                        System.out.println("<----------------------->");
                        System.out.println("7 choix seulement : 1 -2 - 3 - 4 - 5 - 6 - 7");
                    }
                }
            } else if (choixUtilisateur.equals("3")) {
                resteEnJeu = false;
            } else {
                System.out.println("<----------------------->");
                System.out.println("3 choix seulement :\n\t1 = Guerrier\n\t2 = Magicien\n\t3 = Quiter le jeu");
                System.out.println("<----------------------->");
            }
        }
    }

    /**
     * Cree perso personnage.
     *
     * @return the personnage
     */
///////////////////////////////////////METHODE///////////////////////////////////////////////////////
    static Personnage creePerso() {
        Scanner sc = new Scanner(System.in);

        //ArrayList<Armes> armesList = new  ArrayList<Armes>();
        System.out.println("Que voulez vous faire:\n\t1- Guerrier\n\t2- Magicien\n\t3- Sortir");
        String gOuM = sc.nextLine();
        boolean sortieCrea = true;
        while (sortieCrea) {
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
                Armes armes = new Armes(nomArme, puissance);
                armesList.add(armes);

                System.out.println("<----------------------->");
                System.out.println("Guerrier équipé d'un bouclier :\n\t1- true\n\t2- false ");
                String BouclierGuerrier = sc.nextLine();
                boolean bouclier = Boolean.valueOf(BouclierGuerrier);
                Guerrier guer = new Guerrier(nom, img, vie, attaque, armes, bouclier);
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
                sorts = new Sorts(nomSort, puissance);
                sortsList.add(sorts);
                System.out.println("<----------------------->");
                System.out.println("Magicien équipé d'un philtre :\n\t1- true\n\t2-false ");
                String PhiltreMagicien = sc.nextLine();
                boolean philtre = Boolean.valueOf(PhiltreMagicien);
                Magicien  mag = new Magicien(nom, img, vie, attaque, sorts, philtre);
                personnages.add(mag);
                    return mag;
            } else if (gOuM.equals("3")) {
                sortieCrea = false;
            } else {
                System.out.println("Deux type de personnages possible : Choisir 1 ou 2");
//                return new Guerrier();
            }
        }      return new Guerrier();

    }

    private static void ModifierPersoG(Guerrier p,Armes n) {//////////////////////modifier guerrier
        Scanner sc = new Scanner(System.in);
        ArrayList<Personnage> personnages = new ArrayList<Personnage>();
        ArrayList<Armes> armesList = new  ArrayList<Armes>();
        boolean modifierPerso = true;
        while (modifierPerso) {
            System.out.println("Que voulez-vous modifier :\n\t1- Nom\n\t2- Image\n\t3- Vie\n\t4- Force Attaque\n\t5- Arme\n\t6- Bouclier\n\t7- Sortir ");
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
        ArrayList<Armes> armesList = new  ArrayList();
        boolean modifierMago = true;
        while (modifierMago) {
            System.out.println("Que voulez-vous modifier :\n\t1- Nom\n\t2- Image\n\t3- Vie\n\t4- Force Attaque\n\t5- Sort\n\t6- Philtre\n\t7- Sortir ");
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
        ArrayList<Armes> armesList = new  ArrayList();
        boolean combat = true;
//        System.out.println(combat);
        while (combat) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez vous faire :\n\t1- Attaquer\n\t2- Sortir");
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
