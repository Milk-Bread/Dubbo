package com.tlc.dubbo.provider;

public class DemoServiceImpl implements DemoService {

  private int count;

  public String sysHello(String name) {
    System.out.println("Hello " + name + " invoke:" + ++count);
    return "Hello:" + name + ":" + count;
  }

}
