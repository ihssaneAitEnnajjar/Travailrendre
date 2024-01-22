package Exercice1.Situation3DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        ComponentInterface component = new ComponentConcrete();
        Decorator decorator = new ConcreteDecorator(component);

        decorator.traitement();
    }
}
