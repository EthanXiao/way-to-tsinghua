package com.ethanx.learning.htw.ex03.connector.http;

import java.io.File;

/**
 * Created by xiaoxin on 2018/3/4.
 */
public class Constants {

  public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "ethan-htw" + File.separator +
      "src" + File.separator + "webroot";
  public static final String Package = "com.ethanx.learning.htw.ex03.connector.http";
  public static final int DEFAULT_CONNECTION_TIMEOUT = 60000;
  public static final int PROCESSOR_IDLE = 0;
  public static final int PROCESSOR_ACTIVE = 1;
}
