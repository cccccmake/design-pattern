package factory.method;

public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.foo();
        pizza.bar();
        return pizza;
    }
    protected abstract Pizza createPizza(String type);
}
