package Exercice1.Situation4ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Joueur {
    private int score;
    private List<Observateur> observateurs = new ArrayList<>();

    public void attacher(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void notifierObservateurs() {
        for (Observateur observateur : observateurs) {
            observateur.mettreAJour(score);
        }
    }

    public void setScore(int score) {
        this.score = score;
        notifierObservateurs();
    }
}

