import java.util.ArrayList;
import java.util.List;

public class Notificator {
    private final List<String> accounts;
    private final TYPES types;
    private List<INotification> notifications;


    public Notificator(TYPES types, List<String> accounts) {
        this.accounts = accounts;
        this.types = types;
        notifications = new ArrayList<>();
        notifications.add(new FacebookImpl());
        notifications.add(new SMSImpl());
        notifications.add(new CorporateEmail());
    }

    public void enviar(String message) {
        for (INotification notification : notifications) {
            if (notification.validateType(types.name())) {
                notification.send(message, accounts);
            }
        }
    }
}
