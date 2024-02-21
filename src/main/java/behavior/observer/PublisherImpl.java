package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class PublisherImpl implements Publisher{

    List<Subcriber> subcriberList;

    public PublisherImpl() {
        this.subcriberList = new ArrayList<>();
    }

    @Override
    public void subcribe(Subcriber subcriber) {
        this.subcriberList.add(subcriber);
    }

    @Override
    public void unSubcribe(Subcriber subcriber) {
        this.subcriberList.remove(subcriber);
    }

    @Override
    public void notify(String message) {
        this.subcriberList.forEach(e -> e.notify(message));
    }
}
