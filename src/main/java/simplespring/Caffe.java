package simplespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Caffe {
    @Autowired
    private Coffemachine coffemachine;

    public void getCoffemachine(Coffemachine coffemachine){
        this.coffemachine=coffemachine;
    }


    public void orderCoffe(){
        coffemachine.makeEsspresso();
    }

    public void setCoffemachine(Coffemachine coffemachine) {
        this.coffemachine = coffemachine;
    }
}
