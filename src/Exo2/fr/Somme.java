package Exo2.fr;

public class Somme {

    static double n1;
    static double n2;

    public Somme(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public static double getN1() {
        return n1;
    }

    public static void setN1(double n1) {
        Somme.n1 = n1;
    }

    public static double getN2() {
        return n2;
    }

    public static void setN2(double n2) {
        Somme.n2 = n2;
    }

    public static  void sum () {

        double sum = n1 + n2;
        System.out.println("Somme =  " + sum);
    }

}
