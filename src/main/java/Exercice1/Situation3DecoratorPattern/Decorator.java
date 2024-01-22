package Exercice1.Situation3DecoratorPattern;

public abstract class Decorator implements ComponentInterface {
    protected ComponentInterface component;

    public Decorator(ComponentInterface component) {
        this.component = component;
    }

    public void traitement() {
        component.traitement();
    }
}
