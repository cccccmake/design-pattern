public class MallarDuck extends Duck{
    public MallarDuck(){
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new GuaGuaQuack());
    }
    @Override
    public void display() {
        System.out.println("Mallar duck is here!");
    }
}
