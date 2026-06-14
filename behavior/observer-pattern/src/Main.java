import event.Event;
import publisher.NotificationService;
import store.Store;
import subscriber.EmailMsgSubscriberListener;
import subscriber.SubscriberListener;

import static event.Event.NEW_ITEM;
import static event.Event.SALE;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Store store = new Store();

        SubscriberListener ihab = new EmailMsgSubscriberListener("Ihab");

        store.getNotificationService().subscribe(NEW_ITEM, ihab);
        store.getNotificationService().subscribe(NEW_ITEM, new EmailMsgSubscriberListener("Ali"));
        store.getNotificationService().subscribe(SALE, new EmailMsgSubscriberListener("moaz"));
        store.getNotificationService().subscribe(SALE, new EmailMsgSubscriberListener("mazen"));

        System.out.println("////////// SALES EVENT /////////");
        store.sale();

        System.out.println("////////// NEW ITEM EVENT /////////");
        store.addNewItem();

        store.getNotificationService().unsubscribe(NEW_ITEM, ihab);
        System.out.println("////////// NEW ITEM EVENT /////////");
        store.addNewItem();
    }
}
