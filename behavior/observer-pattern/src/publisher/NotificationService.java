package publisher;

import event.Event;
import subscriber.SubscriberListener;

import java.util.*;

// this is the class that will send the notification
public class NotificationService {

    private Map<Event, List<SubscriberListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();

        Arrays.stream(Event.values()).forEach(listener ->
                customers.put(listener, new ArrayList<>()));
    }

    public void subscribe(Event event, SubscriberListener subscriberListener) {
        customers.get(event).add(subscriberListener);
    }

    public void unsubscribe(Event event, SubscriberListener subscriberListener) {
        customers.get(event).remove(subscriberListener);
    }

    public void notification(Event event) {
        customers.get(event).forEach(subscriberListener ->
                subscriberListener.update(event));
    }
}
