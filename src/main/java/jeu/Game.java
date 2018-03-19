package jeu;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {

        System.out.println("test de fonctionnement");
        System.out.println("<----------------------->");
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez vous être un Guerrier ou un Magicien :");
        String TypePersonnage = sc.nextLine();
        if (TypePersonnage.equals("Guerrier")){
            System.out.println("<----------------------->");
            Guerrier guerrier = new Guerrier();
            System.out.println(guerrier.getNom());
            System.out.println("<----------------------->");
            System.out.println(guerrier .Arme());
            System.out.println(guerrier .Bouclier());
            System.out.println("<----------------------->");
        } else if (TypePersonnage.equals("Magicien")){
            System.out.println("<----------------------->");
            Magicien magicien = new Magicien();
            System.out.println(magicien.getNom());
            System.out.println("<----------------------->");
            System.out.println(magicien .Sortilege());
            System.out.println(magicien .Philtre());
            System.out.println("<----------------------->");
        }else{
            System.out.println("<----------------------->");
            System.out.println("Deux choix seulement : Guerrier ou Magicien et non :"  + TypePersonnage );
            System.out.println("<----------------------->");
        }

//        System.out.println("Vous avez saisi : " + TypePersonnage);








    }
}
