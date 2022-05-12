package Exo3.fr;

public class Etudiant {

    private String nom;
    private int note1, note2;
    double moyenne;

    public Etudiant(String nom, int note1, int note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNote1() {
        return note1;
    }

    public void setNote1(int note1) {
        this.note1 = note1;
    }

    public int getNote2() {
        return note2;
    }

    public void setNote2(int note2) {
        this.note2 = note2;
    }

    public void calculerMoyenne() {

        Double chiffre = Double.valueOf(2);
         moyenne = (note1 + note2)/chiffre;
    }

    public void afficher() {

        calculerMoyenne();
        System.out.printf("Nom : " + nom + " Note moyenne : " + moyenne);
    }
}
