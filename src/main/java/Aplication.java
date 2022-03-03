import com.sun.javafx.collections.ElementObservableListDecorator;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Aplication {
    private static Notificator notificator;


    public static void main(String[] args) {
        notificator = new Notificator(TYPES.FACEBOOK, Arrays.asList("PEPITO", "juana"));
        notificator.enviar("hola mundo");

    }


}
