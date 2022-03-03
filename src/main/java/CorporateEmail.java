import java.util.List;

public class CorporateEmail implements INotification {
    public void send(String message, List<String> accounts) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("The message "+"'"+message+"' sent to the addressees:");
        accounts.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("el mensaje se envió por EMAIL " + message);
    }

    public boolean validateType(String type) {

        return type.equals(TYPES.EMAIL.name());
    }
}
