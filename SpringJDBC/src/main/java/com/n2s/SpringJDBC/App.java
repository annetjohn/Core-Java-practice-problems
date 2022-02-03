package com.n2s.SpringJDBC;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        LoginDAO dao = (LoginDAO) context.getBean("ld");
        
//        LoginBean lb = new LoginBean();
//        lb.setId(6);
////        lb.setUsername("Adhvik");
////        lb.setPassword("1234");
//        
////        int result = dao.insertUser(lb);
////        int result = dao.updateUser(lb);
//        int result = dao.deleteUser(lb);
//        System.out.println(result);
        
        ////// To return all data from the table//////////////
        List<LoginBean> list = dao.getUsers();
         
         System.out.println(list.size());
         
         for(int i=0;i<list.size();i++)
         {
             System.out.print(list.get(i).getId()+" ");
             System.out.print(list.get(i).getUsername()+" ");
             System.out.println(list.get(i).getPassword());
         }
     /////////////////////////////////////////////////////
     
 ///////////////get single row using where////////////////
     /*LoginBean lb = dao.getById(1);
     
     System.out.println(lb.getUsername());
     System.out.println(lb.getPassword());*/
 ///////////////////////////////////////////////////////
    }
    
    
}
