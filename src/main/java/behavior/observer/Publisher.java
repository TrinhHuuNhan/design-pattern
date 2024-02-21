package behavior.observer;

public interface Publisher {

    void subcribe(Subcriber subcriber);

    void unSubcribe(Subcriber subcriber);

    void notify(String message);



}
