class Decorator implements Component {
    private Component component;

    Decorator(Component component) {
        this.component = component;
    }

    public void doFunction1() {
        component.doFunction1();
    }

    public void doFunction2() {
        component.doFunction2();
    }

    public void doFunction3() {
        component.doFunction3();
    }
}
