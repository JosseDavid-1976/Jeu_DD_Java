package jeu;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {

        System.out.println("Test de fonctionnement");
        System.out.println("<----------------------->");
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez vous être un Guerrier(1) ou un Magicien (2) :");
        String TypePersonnage = sc.nextLine();
        if (TypePersonnage.equals("1")){
            // affichage guerrier
            System.out.println("<----------------------->");
            Guerrier guerrier = new Guerrier();
            System.out.println("Nom du Guerrier :" + guerrier.getNom());
            System.out.println("<----------------------->");
            System.out.println(guerrier .getImg());
            System.out.println("<----------------------->");
            System.out.println("Niveau de Vie : "+ guerrier .getVie());
            System.out.println("<----------------------->");
            System.out.println("Force de l'attaque : " + guerrier .getAttaque());
            System.out.println("<----------------------->");
            System.out.println("Arme : " + guerrier .getArme());
            System.out.println("Bouclier : " + guerrier .getBouclier());
            System.out.println("<----------------------->");
//             creation du guerrier
            System.out.println("Nom de votre Guerrier  :");
            String NomGuerrier = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Image de votre Guerrier  :");
            String ImgGuerrier = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Niveau de vie de votre Guerrier  :");
            String  VieGuerrier = sc.nextLine();
            int GuerrierLife = Integer.parseInt(VieGuerrier);
            System.out.println("<----------------------->");
            System.out.println("Force de l'attaque de votre Guerrier  :");
            String AttGuerrier = sc.nextLine();
            int GuerrierAtt = Integer.parseInt(AttGuerrier);
            System.out.println("<----------------------->");
            System.out.println("Arme de votre Guerrier  :");
            String ArmeGuerrier = sc.nextLine();
            System.out.println("Guerrier équipé d'un bouclier : true ou false ");
            String BouclierGuerrier = sc.nextLine();
            boolean GuerrierBouclier = Boolean.valueOf(BouclierGuerrier);
            System.out.println("<----------------------->");
            guerrier.setNom(NomGuerrier);
            System.out.println("Nom du Guerrier :" + guerrier.getNom());
            guerrier.setImg(ImgGuerrier);
            System.out.println("A quoi ressemble ton Guerrier :" + guerrier.getImg());
            guerrier.setVie(GuerrierLife);
            System.out.println("Niveau de Vie du Guerrier :" + guerrier.getVie());
            guerrier.setAttaque(GuerrierAtt);
            System.out.println("Force de l'attaque de votre Guerrier  :" + guerrier.getAttaque());
            guerrier.setArme(ArmeGuerrier);
            System.out.println("Arme de votre Guerrier  :" + guerrier.getArme());
            guerrier.setBouclier(GuerrierBouclier);
            System.out.println("Guerrier équipé d'un bouclier :" + guerrier.getBouclier());

            System.out.println("<----------------------->");


        } else if (TypePersonnage.equals("2")){
            // affichage magicien
            System.out.println("<----------------------->");
            Magicien magicien = new Magicien();
            System.out.println("Nom du Magicien :" + magicien.getNom());
            System.out.println("<----------------------->");
            System.out.println(magicien .getImg());
            System.out.println("<----------------------->");
            System.out.println("Niveau de Vie : "+ magicien .getVie());
            System.out.println("<----------------------->");
            System.out.println("Force de l'attaque : " + magicien .getAttaque());
            System.out.println("<----------------------->");
            System.out.println("Sort : " + magicien .getSort());
            System.out.println("Philtre : " + magicien .getPhiltre());
            System.out.println("<----------------------->");
            //creation magicien
            System.out.println("Nom de votre Magicien  :");
            String NomMagicien = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Image de votre Magicien  :");
            String ImgMagicien = sc.nextLine();
            System.out.println("<----------------------->");
            System.out.println("Niveau de vie de votre Magicien  :");
            String  VieMagicien = sc.nextLine();
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

        }else{
            System.out.println("<----------------------->");
            System.out.println("Deux choix seulement : 1 = Guerrier ou  2 = Magicien et non :"  + TypePersonnage );
            System.out.println("<----------------------->");
        }

//        System.out.println("Vous avez saisi : " + TypePersonnage);








    }
}
