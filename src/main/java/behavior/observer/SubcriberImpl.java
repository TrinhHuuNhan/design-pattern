package behavior.observer;

public class SubcriberImpl implements Subcriber {
    @Override
    public void notify(String message) {
        System.out.println(this.hashCode() + " Get message : " + message);
    }
}
