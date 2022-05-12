import Exo2.fr.Somme;
import Exo3.fr.Etudiant;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nb1;
        int nb2;
        String name;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Entrez votre nom ");
        name = scanner.next();

        System.out.println("Entrez la premiere note");
        nb1 = scanner.nextInt();

        System.out.println("Entrez la seconde note");
        nb2 = scanner.nextInt();
        System.out.println();

        Etudiant etudiant = new Etudiant(name,nb1,nb2);

        etudiant.afficher();

    }
}
