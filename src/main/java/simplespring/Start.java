package simplespring;

import javabased.CoffeConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import simplespring.Ingr.*;

public class Start {
    private static Coffemachine coffemachine;
    public static void main(String[] args) {
        /*Coffe coffe=new CoffeArabic();
        Water water=new WaterImpl();
        Power power=new PowerImpl();
        Milk milk=new MilkImpl();

        new Coffemachine(coffe,water,milk,power).makeEsspresso();*/

        /*ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");*/
       AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(CoffeConfig.class);

       Coffemachine coffemachine=ctx.getBean(Coffemachine.class);

       ctx.getBean(Coffemachine.class);
        ctx.getBean(Coffemachine.class);
        ctx.getBean(Coffemachine.class);

       coffemachine.makeEsspresso();
        /*ctx.refresh();*/
        /*Coffemachine coffemachine=ctx.getBean(Coffemachine.class);
        coffemachine.makeEsspresso();*/

        /*ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");
        Caffe caffe=ctx.getBean(Caffe.class);
        caffe.orderCoffe();*/

    }
}
