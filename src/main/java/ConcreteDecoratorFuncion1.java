public class ConcreteDecoratorFuncion1 extends Decorator {
    public ConcreteDecoratorFuncion1(Component component) {
        super(component);
    }
    
    public void doFunction1() {
        System.out.println("Decorating doFunction1 of component...");
        super.doFunction1();
    }
}
