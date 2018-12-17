package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerTest {
    public static void main(String[] args) {
        ApplicationContext ttt = new ClassPathXmlApplicationContext("autowireConstructor.xml");
        Performer performer = (Performer) ttt.getBean("duke");
//        Performer performer = (Performer) ttt.getBean("kenny");
//        Performer performer = (Performer) ttt.getBean("poeticDuke");
//        Performer performer=(Performer) ttt.getBean("duke");
        performer.perform();

    }
}
