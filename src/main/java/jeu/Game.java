package jeu;

import java.util.Scanner;

public class Game {
    private static Guerrier guerrier;
    private static Magicien magicien;

    public static void main(String[] args) {
        boolean resteEnJeu = true;
        while (resteEnJeu) {
            System.out.println("Test de fonctionnement");
            System.out.println("<----------------------->");
            Scanner sc = new Scanner(System.in);

            System.out.println("Que voulez vous faire:1- Créer un personnage 2- Afficher un personnage ou le modifier 3- Quitter ");
            String choixUtilisateur = sc.nextLine();
            if (choixUtilisateur.equals("1")) {
                creePerso();
            } else if (choixUtilisateur.equals("2")) {
                System.out.println("Que voulez-vous faire maintenant : 1- Afficher Guerrier 2- Afficher Magicien 3- Modifier Guerrier 4- Modifier Magicien ");
                String ChoixPerso = sc.nextLine();

                if (ChoixPerso.equals("1")) {
//                    String NomGuerrier;
//                    String ImgGuerrier;
//                    int GuerrierLife;
//                    int GuerrierAtt;
//                    boolean GuerrierBouclier;
//                    String ArmeGuerrier;
//affichage guerrier construie
                    System.out.println("<----------------------->");
                    System.out.println("Nom du Guerrier :" + guerrier.getNom());
                    System.out.println("<----------------------->");
                    System.out.println("A quoi ressemble ton Guerrier :" + guerrier.getImg());
                    System.out.println("<----------------------->");
                    System.out.println("Niveau de Vie du Guerrier :" + guerrier.getVie());
                    System.out.println("<----------------------->");
                    System.out.println("Force de l'attaque de votre Guerrier  :" + guerrier.getAttaque());
                    System.out.println("<----------------------->");
                    System.out.println("Arme de votre Guerrier  :" + guerrier.getArme());
                    System.out.println("<----------------------->");
                    System.out.println("Guerrier équipé d'un bouclier :" + guerrier.getBouclier());
                    System.out.println("<----------------------->");


                } else if (ChoixPerso.equals("2")) {
//                    String NomMagicien;
//                    String ImgMagicien;
//                    int MagicienLife;
//                    int MagicienAtt;
//                    String SortMagicien;
//                    boolean MagicienPhiltre;

                    // affichage magicien
                    System.out.println("<----------------------->");
                    System.out.println("Nom du Magicien :" + magicien.getNom());
                    System.out.println("<----------------------->");
                    System.out.println("A quoi ressemble ton Magicien :" + magicien.getImg());
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
                                guerrier.setNom(NomGuerrier);
                                System.out.println("<----------------------->");
                                break;
                            case "2":
                                System.out.println("<----------------------->");
                                System.out.println("Image de votre Guerrier  :");
                                ImgGuerrier = sc.nextLine();
                                guerrier.setImg(ImgGuerrier);
                                System.out.println("<----------------------->");
                                break;
                            case "3":
                                System.out.println("<----------------------->");
                                System.out.println("Niveau de vie de votre Guerrier  :");
                                String VieGuerrier = sc.nextLine();
                                GuerrierLife = Integer.parseInt(VieGuerrier);
                                guerrier.setVie(GuerrierLife);
                                System.out.println("<----------------------->");
                                break;
                            case "4":
                                System.out.println("<----------------------->");
                                System.out.println("Force de l'attaque de votre Guerrier  :");
                                String AttGuerrier = sc.nextLine();
                                GuerrierAtt = Integer.parseInt(AttGuerrier);
                                guerrier.setAttaque(GuerrierAtt);
                                System.out.println("<----------------------->");
                                break;
                            case "5":
                                System.out.println("<----------------------->");
                                System.out.println("Arme de votre Guerrier  :");
                                ArmeGuerrier = sc.nextLine();
                                guerrier.setArme(ArmeGuerrier);
                                break;
                            case "6":
                                System.out.println("Guerrier équipé d'un bouclier : true ou false ");
                                String BouclierGuerrier = sc.nextLine();
                                GuerrierBouclier = Boolean.valueOf(BouclierGuerrier);
                                guerrier.setBouclier(GuerrierBouclier);
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
                    boolean modifierMago = true;
                    while (modifierMago) {
                        System.out.println("Que voulez-vous modifier : 1- Nom 2- Image 3- Vie 4- Force Attaque 5- Arme 6- Bouclier 7- Sortir ");
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
                                magicien.setNom(NomMagicien);
                                System.out.println("<----------------------->");
                                break;
                            case "2":
                                System.out.println("<----------------------->");
                                System.out.println("Image de votre Magicien  :");
                                ImgMagicien = sc.nextLine();
                                magicien.setImg(ImgMagicien);
                                System.out.println("<----------------------->");
                                break;
                            case "3":
                                System.out.println("<----------------------->");
                                System.out.println("Niveau de vie de votre Guerrier  :");
                                String VieMagicien = sc.nextLine();
                                MagicienLife = Integer.parseInt(VieMagicien);
                                magicien.setVie(MagicienLife);
                                System.out.println("<----------------------->");
                                break;
                            case "4":
                                System.out.println("<----------------------->");
                                System.out.println("Force de l'attaque de votre Guerrier  :");
                                String AttMagicien = sc.nextLine();
                                MagicienAtt = Integer.parseInt(AttMagicien);
                                magicien.setAttaque(MagicienAtt);
                                System.out.println("<----------------------->");
                                break;
                            case "5":
                                System.out.println("<----------------------->");
                                System.out.println("Arme de votre Guerrier  :");
                                SortMagicien = sc.nextLine();
                                magicien.setSort(SortMagicien);
                                break;
                            case "6":
                                System.out.println("Guerrier équipé d'un bouclier : true ou false ");
                                String PhiltreMagicien = sc.nextLine();
                                MagicienPhiltre = Boolean.valueOf(PhiltreMagicien);
                                magicien.setPhiltre(MagicienPhiltre);
                                break;
                            case "7":
                                modifierMago = false;
                                break;
                            default:
                                System.out.println("Choisir entre 1 et 7 ");
                                break;
                        }

//             else{
//                            System.out.println("Quatre choix ne te suffisent pas deviens Développeur et fait ce que tu veux");
//                        }
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


        static void creePerso () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Que voulez vous faire:1- Guerrier 2- Magicien");
            String gOuM = sc.nextLine();
            if (gOuM.equals("1")) {
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
            } else if (gOuM.equals("2")) {
                magicien = new Magicien();
                System.out.println("Nom de votre Magicien  :");
                String NomMagicien = sc.nextLine();
                magicien.setNom(NomMagicien);
                System.out.println("<----------------------->");
                System.out.println("Image de votre Magicien  :");
                String ImgMagicien = sc.nextLine();
                magicien.setImg(ImgMagicien);
                System.out.println("<----------------------->");
                System.out.println("Niveau de vie de votre Magicien  :");
                String VieMagicien = sc.nextLine();
                int MagicienLife = Integer.parseInt(VieMagicien);
                magicien.setVie(MagicienLife);
                System.out.println("<----------------------->");
                System.out.println("Force de l'attaque de votre Magicien  :");
                String AttMagicien = sc.nextLine();
                int MagicienAtt = Integer.parseInt(AttMagicien);
                magicien.setAttaque(MagicienAtt);
                System.out.println("<----------------------->");
                System.out.println("Sort de votre Magicien  :");
                String SortMagicien = sc.nextLine();
                magicien.setSort(SortMagicien);
                System.out.println("Magicien équipé d'un philtre : true ou false ");
                String PhiltreMagicien = sc.nextLine();
                boolean MagicienPhiltre = Boolean.valueOf(PhiltreMagicien);
                magicien.setPhiltre(MagicienPhiltre);
//

            } else {
                System.out.println("Deux type de personnages possible : Choisir 1 ou 2");
            }
        }
    }
