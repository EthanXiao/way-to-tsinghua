package com.ethanx.learning.htw.ex03.startup;

import com.ethanx.learning.htw.ex03.connector.http.HttpConnector;

/**
 * Created by xiaoxin on 2018/3/4.
 */
public class Bootstrap {

  public static void main(String[] args) {
    HttpConnector connector = new HttpConnector();
    connector.start();
  }
}
