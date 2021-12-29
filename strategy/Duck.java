public abstract class Duck{
    Flyable flyBehavior;
    Quackable quackBehavior;
    public Duck(){
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("Swimming");
    }

    public void setFlyBehavior(Flyable flyTest){
        flyBehavior = flyTest;
    }
    public void setQuackBehavior(Quackable quackTest){
        quackBehavior = quackTest;
    }
}
