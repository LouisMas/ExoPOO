package Exo4.fr;

public class AdditionComplexe {
    private int nb1Reel, nb2Reel;
    private int nb1Imaginaire, nb2Imaginaire;


    public AdditionComplexe(int nb1Reel, int nb2Reel, int nb1Imaginaire, int nb2Imaginaire) {
        this.setNb1Reel(nb1Reel);
        this.setNb2Reel(nb2Reel);
        this.setNb1Imaginaire(nb1Imaginaire);
        this.setNb2Imaginaire(nb2Imaginaire);
    }

    public int getNb1Reel() {
        return nb1Reel;
    }

    public void setNb1Reel(int nb1Reel) {
        this.nb1Reel = nb1Reel;
    }

    public int getNb2Reel() {
        return nb2Reel;
    }

    public void setNb2Reel(int nb2Reel) {
        this.nb2Reel = nb2Reel;
    }

    public int getNb1Imaginaire() {
        return nb1Imaginaire;
    }

    public void setNb1Imaginaire(int nb1Imaginaire) {
        this.nb1Imaginaire = nb1Imaginaire;
    }

    public int getNb2Imaginaire() {
        return nb2Imaginaire;
    }

    public void setNb2Imaginaire(int nb2Imaginaire) {
        this.nb2Imaginaire = nb2Imaginaire;
    }

    public void calcul() {

        int sumReel = getNb1Reel() + getNb2Reel();
        int sumImaginaire = getNb1Imaginaire() + getNb2Imaginaire();
        System.out.println(sumReel + " + " + sumImaginaire);

    }


}
