package store;

import publisher.NotificationService;

import static event.Event.NEW_ITEM;
import static event.Event.SALE;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        // always same notification
        // the only thing that will change is how this service will notify the subscriber
        this.notificationService = new NotificationService();
    }

    public void addNewItem() {
        notificationService.notification(NEW_ITEM);
    }

    public void sale() {
        notificationService.notification(SALE);
    }

    public NotificationService getNotificationService() {
        return this.notificationService;
    }
}
