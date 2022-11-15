package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Publisher {
    private List<Subscriber> subscriberList = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    public void notifySubscribers() {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update(this);
        }
    }
}
