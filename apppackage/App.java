package com.spring.apppackage;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(com.spring.apppackage.Appconfig.class);
        Employee e=con.getBean(Employee.class);
        Passport p=new Passport();
		p.setPassNum(1231);
		p.setDateofIssue(new Date(2001,12,1));
		p.setDateofExpiry(new Date(2010,12,2));
		e.setEmpId(1);
		e.setEmpName("raju");
		e.setPassObj(p);
		
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpName());
		System.out.println(e.getPassObj());
		
        
        
        
    }
}
