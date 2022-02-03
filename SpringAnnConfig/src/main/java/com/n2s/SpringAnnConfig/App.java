package com.n2s.SpringAnnConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext app = new AnnotationConfigApplicationContext(AppConfig.class);
        Beverages b1 = app.getBean(Coffee.class);
        b1.drink();
        
        Beverages b2 = app.getBean(Tea.class);
        b2.drink();
    }
}
