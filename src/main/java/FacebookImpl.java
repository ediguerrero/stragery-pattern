import java.util.List;

public class FacebookImpl implements  INotification{
    public void send(String message , List<String> accounts) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("The message "+"'"+message+"' sent to the addressees:");
        accounts.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("el mensaje se envió por FACEBOOK " + message);

    }

    public boolean validateType(String type) {
        return type.equals(TYPES.FACEBOOK.name());
    }
}
