
import java.util.List;

import POJO.Objekt;
import POJO.Predicate;
import POJO.Satz;
import POJO.Satzzeichen;
import POJO.Subject;
import POJO.iChild;
import POJO.Satz.*;

public class App {
    public static void main(String[] args) throws Exception {
        Satz satz = new Satz(
            new Subject("Ich", "bin"),
            new Predicate("geil"),
            new Objekt("auf", "Java"),
            new Satzzeichen(".")
        );

        satz.getText();

    }
}
