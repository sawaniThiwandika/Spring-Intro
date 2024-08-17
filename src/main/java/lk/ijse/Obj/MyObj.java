package lk.ijse.Obj;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("myObj")// me class eken hdn object manage krnnn oni spring kyl kynw methana
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyObj {
 public MyObj(){
     System.out.println("obj");
 }
}
