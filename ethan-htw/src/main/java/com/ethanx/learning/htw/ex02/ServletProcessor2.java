package com.ethanx.learning.htw.ex02;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandler;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Created by xiaoxin on 2018/2/25.
 */
public class ServletProcessor2 {

  public void process(Request request, Response response) {
    String uri = request.getUri();
    String servletName = uri.substring(uri.lastIndexOf("/"));
    URLClassLoader classLoader = null;

    try {
      // create a URLClassLoader
      URL[] urls = new URL[1];
      URLStreamHandler streamHandler = null;
      File classPath = new File(Constants.WEB_ROOT);
      // the forming of repository is taken from the
      // createClassLoader method in
      // org.apache.catalina.startup.ClassLoaderFactory
      String repository = new URL("file", null, classPath.getCanonicalPath() + File.separator).toString();
      System.out.println(repository);
      // the code for forming the URL is taken from the addRepository method in
      // org.apache.catalina.loader.StandardClassLoader class.
      urls[0] = new URL(null, repository, streamHandler);
      classLoader = new URLClassLoader(urls);
    } catch (IOException e) {
      System.out.println(e.toString());
      System.exit(1);
    }

    Class myClass = null;
    try {
      myClass = classLoader.loadClass(servletName);
    } catch (ClassNotFoundException e) {
      System.out.println(e.toString());
      System.exit(1);
    }

    Servlet servlet;
    try {
      servlet = (Servlet) myClass.newInstance();
      RequestFacade requestFacade = new RequestFacade(request);
      ResponseFacade responseFacade = new ResponseFacade(response);
      servlet.service((ServletRequest) requestFacade, (ServletResponse) responseFacade);
    } catch (InstantiationException e) {
      e.printStackTrace();
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (ServletException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
