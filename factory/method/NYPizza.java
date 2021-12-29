package factory.method;

public class NYPizza extends Pizza{
    public NYPizza() {
        System.out.println("New York Pizza");
    }
    @Override
    public void foo(){
        System.out.println("NY foo()");
    }
    @Override
    public void bar(){
        System.out.println("NY bar()");
    }
}
