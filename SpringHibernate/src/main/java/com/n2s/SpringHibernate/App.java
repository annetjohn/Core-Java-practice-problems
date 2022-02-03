package com.n2s.SpringHibernate;

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
        LoginDao dao = (LoginDao) context.getBean("d");
        
        LoginBean lb = new LoginBean();
        lb.setId(3);
//        lb.setUsername("Jasper");
//        lb.setPassword("Guessthepwd");
//       
//        dao.insertUser(lb);
//        System.out.println("Success!!");
        
       
        
        //// To get individual data /////////////////////
                /*LoginBean l = dao.getById(21);
                
                System.out.println(l.getUsername());
                System.out.println(l.getPassword());*/
                //////////////////////////////////////////////////
                
                ////// To return all data from the table//////////////
                List<LoginBean> list = dao.getAllUsers();
                
                System.out.println(list.size());
                
                for(int i=0;i<list.size();i++)
                {
                    System.out.print(list.get(i).getId()+" ");
                    System.out.print(list.get(i).getUsername()+" ");
                    System.out.println(list.get(i).getPassword());
                }
//                /////////////////////////////////////////////////////
//                
                System.out.println("Success for all the queries!!");
        
    }
}
