package Exercice1.Situation1CompositePattern;

public class Main {
    public static void main(String[] args) {
        Cercle cercle = new Cercle();
        Rectangle rectangle = new Rectangle();

        GroupeFigures groupe = new GroupeFigures();
        groupe.ajouter(cercle);
        groupe.ajouter(rectangle);

        groupe.dessiner();
    }
}

