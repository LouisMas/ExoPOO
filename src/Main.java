import Exo2.fr.Somme;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double nb1;
        double nb2;

        Scanner scanner = new Scanner(System.in);
        Somme somme = new Somme(1,1);

        System.out.println("Entrez le premier chiffre");
        nb1 = scanner.nextDouble();

        System.out.println("Entrez le second chiffre");
        nb2 = scanner.nextDouble();
        System.out.println();

        Somme.setN1(nb1);
        Somme.setN2(nb2);
        Somme.sum();

    }
}
