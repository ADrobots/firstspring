package simplespring.Ingr;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("usa")
public class Jacobs implements Coffe {
    public void getExtract() {

    }
    public String getCoffemachine(){
        return "jacobs";
    }


}
