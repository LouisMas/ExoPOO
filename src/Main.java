import Exo2.fr.Somme;
import Exo3.fr.Etudiant;
import Exo4.fr.AdditionComplexe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int nb1Reel,nb2Reel;
        int nb1Imaginaire,nb2Imaginaire;

        Scanner scanner = new Scanner(System.in);


        System.out.println("Entrez la partie reel");
        nb1Reel = scanner.nextInt();

        System.out.println("Entrez la partie imaginaire");
        nb1Imaginaire = scanner.nextInt();
        System.out.println();

        System.out.println("Entrez la partie reel");
        nb2Reel = scanner.nextInt();

        System.out.println("Entrez la partie imaginaire");
        nb2Imaginaire = scanner.nextInt();
        System.out.println();


        AdditionComplexe additionComplexe = new AdditionComplexe(nb1Reel,nb2Reel,nb1Imaginaire,nb2Imaginaire);
        System.out.print("La somme est ");
        additionComplexe.calcul();

    }
}
