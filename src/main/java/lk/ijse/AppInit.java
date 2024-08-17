package lk.ijse;

import lk.ijse.config.Config;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(Config.class);//register agent
        ctx.refresh();//mek nokroth sprintta penne ne
        ctx.close();
        Object myObj = ctx.getBean("myObj");
        System.out.println(myObj);
        ConfigurableBeanFactory beanFactory= ctx.getBeanFactory();
        System.out.println("is Bean Singleton : "+beanFactory.isSingleton("myObj"));
        ctx.registerShutdownHook();//  gracefully shutdown the application
    }
}
