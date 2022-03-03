import java.util.List;

public interface INotification {

    void send(String message, List<String> accounts);
    boolean validateType (String type);
}
