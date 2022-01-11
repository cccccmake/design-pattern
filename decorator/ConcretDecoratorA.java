public class ConcretDecoratorA extends BaseDecorator{
    public ConcretDecoratorA(Data wrapee){
        super(wrapee);
    }
    public void execute(){
        System.out.println("wrapee in concret decorator A!");
    }
    public void saySomething(){
        System.out.println("In concrete decorator A, data says: I have no idea what decorators are used to do!");
    }
}
