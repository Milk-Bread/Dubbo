package com.tlc.dubbo.sonsumer;

import com.tlc.dubbo.provider.DemoService;

public class SonsumerTest {

  private DemoService demo;

  public void start() {
    System.err.println("SonsumerTest init");
    for (int i = 0; i < 20; i++) {
      String resu = demo.sysHello("车");
      System.out.println(resu);
    }
  }

  public void setDemo(DemoService demo) {
    this.demo = demo;
  }
}
