package simplespring.Ingr;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("spain")
public class CoffeArabic implements Coffe {
    public void getExtract() {

    }
}
