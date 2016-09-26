package com.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dubbo.client.SonsumerTest;

/**
 * Hello world!
 */
public class App {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"config/dubbo-sonsumer.xml", "config/applicationContext-common.xml"});
    SonsumerTest test = (SonsumerTest) context.getBean("SonsumerTest");
    for (int i = 0; i < 100; i++) {
      test.start();

      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
  }
}
