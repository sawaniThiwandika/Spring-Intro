package lk.ijse.config;

import lk.ijse.Obj.MyObj;
import lk.ijse.Obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse")//package eke thiynwd blnw spring ta manage krnn puluwn object
//@ComponentScan(basePackageClasses = {MyObj.class})//methana array ekk widiyt class denn puluwn, me class wala thiynwd blnn sprintta manage krnn puluwn object
public class Config {//search components, source for bean definition

    @Bean
   OtherObj other(){// when OtherObj class's source code is unavailable , If we want to convert OtherObj class as a bean , then use @Bean annotation
        return new OtherObj();
    }
}
