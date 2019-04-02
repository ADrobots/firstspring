package javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import simplespring.Caffe;
import simplespring.Coffemachine;
import simplespring.Ingr.*;

@Configuration
@ComponentScan("simplespring")
public class CoffeConfig {

    /*@Bean
    public CoffeArabic coffeArabic(){
        return new CoffeArabic();
    }

    @Bean
    public Milk milk(){
        return new MilkImpl();
    }

    @Bean
    public Power power(){
        return new PowerImpl();
    }

    @Bean Water water(){
        return new WaterImpl();
    }

    @Bean
    public Coffemachine coffemachine(){
        return new Coffemachine(coffeArabic(),water(),milk(),power());
    }

    @Bean
    public Caffe caffe(){
        Caffe caffe=new Caffe();
                caffe.setCoffemachine(coffemachine());
        return caffe;
    }*/
}
