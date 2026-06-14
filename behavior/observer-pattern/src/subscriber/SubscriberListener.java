package subscriber;

import event.Event;

public interface SubscriberListener {
    void update(Event event);
}
