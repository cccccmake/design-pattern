public class Test {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Observer observerA = new ConcreteObserver("ObserverA");
        Observer observerB = new ConcreteObserver("ObserverB");
        publisher.register(observerA);
        publisher.register(observerB);
        publisher.notifyObservers();
        publisher.remove(observerB);
        publisher.notifyObservers();
    }   
}
