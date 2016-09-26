package com.tlc.dubbo.sonsumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:/config/dubbo-sonsumer.xml", "classpath:/config/applicationContext-common.xml"});
    SonsumerTest test = (SonsumerTest) context.getBean("SonsumerTest");
    test.start();
  }
}
