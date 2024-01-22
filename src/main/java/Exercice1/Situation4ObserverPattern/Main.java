package Exercice1.Situation4ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Joueur joueur = new Joueur();
        joueur.attacher(new Couloir());
        joueur.attacher(new Camera());
        joueur.attacher(new Gardien());

        joueur.setScore(10);
    }
}
