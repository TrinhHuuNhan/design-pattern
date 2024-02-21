package behavior.observer;

public class Demo {
    public static void main(String[] args) {
        Publisher publisher = new PublisherImpl();
        Subcriber subcriber = new SubcriberImpl();
        Subcriber subcriber1 = new SubcriberImpl();
        Subcriber subcriber2 = new SubcriberImpl();

        publisher.subcribe(subcriber);
        publisher.subcribe(subcriber2);
        publisher.subcribe(subcriber1);

        publisher.notify("Message 1");

        publisher.unSubcribe(subcriber1);
        publisher.notify("message 2");


    }
}
