import com.sun.javafx.collections.ElementObservableListDecorator;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Aplication {
    public static void main(String[] args) {
        Notificator notificator = new Notificator(TYPES.FACEBOOK, Arrays.asList("PEPITO", "juana"));
        notificator.enviar("hola mundo");
    }

}
