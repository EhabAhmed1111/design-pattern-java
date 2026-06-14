package subscriber;

import event.Event;

public class EmailMsgSubscriberListener implements SubscriberListener{

    private final String email;

    public EmailMsgSubscriberListener(String email) {
        this.email = email;
    }

    @Override
    public void update(Event event) {
        System.out.println("Sending email to " + email + " for " + event);
    }
}
