package com.n2s.SpringXMLConfig2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
    	Brand b = (Brand) context.getBean("brd");
    	System.out.println(b);
    	
//        // this is tight bounded. 
//       // Beverages b = new Tea();
//    	
//    	//now loosely coupled. 
//    	Beverages b = (Beverages) context.getBean("coffee");
//    	
//    	//Beverages b1 = (Beverages) context.getBean("tea");
//    	
//        b.drink();
//        //b1.drink();
//     
//       
    	
    	
    	
    }
}
