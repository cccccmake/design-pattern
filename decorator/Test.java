public class Test {
    public static void main(String[] args) {
        Data myData = new ConcreteData();
        BaseDecorator concreteDecorator = new ConcretDecoratorA(myData);
        concreteDecorator.identifier();
        concreteDecorator.saySomething();
        BaseDecorator baseDecorator = new BaseDecorator(myData);
        baseDecorator.identifier();
        baseDecorator.saySomething();
    }
}
