public class BaseDecorator implements Data{
    private Data wrapee;
    BaseDecorator(Data wrapee){
        this.wrapee = wrapee;
    }
    public void identifier(){
        wrapee.identifier();
        System.out.println("No override within execute method in BaseDecorator class!");
    }
    public void saySomething(){
        System.out.println("In Base Decorator, data says, you need to work hard:)");
    }
}