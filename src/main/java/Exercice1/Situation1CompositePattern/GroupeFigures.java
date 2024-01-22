package Exercice1.Situation1CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class GroupeFigures implements Figure {
    private List<Figure> figures = new ArrayList<>();

    public void ajouter(Figure figure) {
        figures.add(figure);
    }

    public void retirer(Figure figure) {
        figures.remove(figure);
    }

    @Override
    public void dessiner() {
        for (Figure figure : figures) {
            figure.dessiner();
        }
    }
}
