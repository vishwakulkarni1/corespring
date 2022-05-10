package com.newDemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
    	Student stu = (Student)context.getBean("student");
        stu.setName("cccc");
    	System.out.println(stu);
    	
    	Student s = new Student(2,"aaaa");
    	System.out.println(s.id);
    	System.out.println(s.getName());
    	System.out.println(s);
    	
    	Student s1 = new Student();
    	s1.id=60;
    	s1.setName("bbbb");
    	System.out.println(s1);
    }
}
