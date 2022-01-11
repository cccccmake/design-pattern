public class ConcreteObserver implements Observer{
    private String name;
    public ConcreteObserver(String name){
        this.name = name;
    }
    public String getObserverName(){
        return this.name;
    }
    public void update(){
        System.out.println("Observer " + this.getObserverName() + " get notified!");
    }
}
