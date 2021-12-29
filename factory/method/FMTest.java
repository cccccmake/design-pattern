package factory.method;

public class FMTest {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        nyStore.orderPizza("NY");
    }
}
