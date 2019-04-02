package simplespring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import simplespring.Ingr.Coffe;
import simplespring.Ingr.Milk;
import simplespring.Ingr.Power;
import simplespring.Ingr.Water;

@Service
@Scope(scopeName = "prototype")
public class Coffemachine{
    private Coffe coffe;
    private Water water;
    private Milk milk;
    private Power power;

    @Autowired

    public Coffemachine(Coffe coffe, Water water, Milk milk, Power power) {
        System.out.println("Sozdan object coffemachine");
        this.coffe = coffe;
        this.water = water;
        this.milk = milk;
        this.power = power;
    }

    public void makeEsspresso(){
        System.out.println("Приготовление Esspresso");
        water.getWater();
        coffe.getExtract();

        System.out.println("Завершено");
    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Posle init");
        return null;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Do init");
        return null;
    }
}
