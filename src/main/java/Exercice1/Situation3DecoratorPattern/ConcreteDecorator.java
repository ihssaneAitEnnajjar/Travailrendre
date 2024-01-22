package Exercice1.Situation3DecoratorPattern;

public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(ComponentInterface component) {
        super(component);
    }

    @Override
    public void traitement() {
        super.traitement();
    }
}
