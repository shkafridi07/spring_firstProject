package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        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
        ApplicationContext context =new ClassPathXmlApplicationContext("confige.xml");
//            Student student1 =(Student) context.getBean("student1");git commit -m "Reset repository"App
        Student student2 =(Student) context.getBean("student2");
//        System.out.println(student1);
        List<Integer> ls = student2.getMarks().stream().sorted().collect(Collectors.toList());
        ls.forEach(System.out::println);

    }
}

