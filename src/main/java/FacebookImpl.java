import java.util.List;

public class FacebookImpl implements  INotification{
    public void send(String message , List<String> accounts) {
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("el mensaje:  "+"'"+message+"' será enviado a las siguientes direcciones :");
        accounts.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("el mensaje se envió por FACEBOOK " + message);

    }

    public boolean validateType(String type) {
        return type.equals(TYPES.FACEBOOK.name());
    }
}
