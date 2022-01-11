import java.util.LinkedList;
import java.util.List;

public class Publisher{
    private List<Observer> observerList = new LinkedList<>();
    public void register(Observer observer){
        observerList.add(observer);
    }
    public void remove(Observer observer){
        System.out.println(observer.getObserverName() + " unsubscribed!");
        observerList.remove(observer);
    }
    public void notifyObservers(){
        for(Observer observer : observerList){
            observer.update();
        }
    }
}