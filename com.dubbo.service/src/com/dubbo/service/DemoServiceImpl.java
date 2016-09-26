package com.dubbo.service;

public class DemoServiceImpl implements DemoService {

  private int count;

  public String sysHello(String name) {
    System.out.println("Hello " + name + " invoke:" + ++count);
    return "Hello:" + name + ":" + count;
  }

}
