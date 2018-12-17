package com.byNameByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstrumentalistTest {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autowireByNameByType.xml");
        Performer performer= (Performer) context.getBean("kenny");
        performer.perform();
    }
}
