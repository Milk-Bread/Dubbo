package com.dubbo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description: 使用main方法创建Spring容器，同时保持服务常在
 * Copyright (c) TLC.
 * All Rights Reserved.
 * @version 1.0 2016年8月3日 下午5:23:53 by chepeiqing (chepeiqing@icloud.com)
 */
public class App {

  public static void main(String[] args) {
    new ClassPathXmlApplicationContext("config/dubbo-provider.xml");
    while (true) {
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}
