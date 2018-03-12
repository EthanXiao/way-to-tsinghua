package com.ethanx.learning.htw.ex03.connector.http;

/**
 * Created by xiaoxin on 2018/3/4.
 */
public class HttpConnector implements Runnable {

  public void run() {

  }

  public void start(){
    Thread thread = new Thread(this);
    thread.start();
  }

}
