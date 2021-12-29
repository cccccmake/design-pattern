package factory.method;

public class NYPizzaStore extends PizzaStore{
    @Override
    public Pizza createPizza(String type){
        if(type.equals("NY")) {
            return new NYPizza();
        }
        return null;
    }
}
