package com.ethanx.learning.htw.ex02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xiaoxin on 2018/2/24.
 */
public class HttpServer2 {

  // shutdown command
  private static final String SHUTDOWN_COMMAND = "/SHUTDOWN";

  // the shutdown command received
  private boolean shutdown = false;

  public static void main(String[] args) {
    HttpServer2 server = new HttpServer2();
    server.await();
  }


  private void await() {
    ServerSocket serverSocket = null;
    try {
      serverSocket = new ServerSocket();
      serverSocket.bind(new InetSocketAddress("127.0.0.1", 808));
    } catch (IOException e) {
      e.printStackTrace();
      System.exit(1);
    }
    // Loop waiting for a request
    while (!shutdown) {
      Socket socket;
      InputStream input;
      OutputStream output;
      try {
        socket = serverSocket.accept();
        input = socket.getInputStream();
        output = socket.getOutputStream();
        // create Request object and parse
        Request request = new Request(input);
        request.parse();

        // create Response object
        Response response = new Response(output);
        response.setRequest(request);

        // check if this is a request for a servlet or a static resource
        // a request for a servlet begins with "/servlet/"
        if (request.getUri().startsWith("/servlet/")) {
          ServletProcessor2 processor = new ServletProcessor2();
          processor.process(request, response);
        } else {
          StaticResourceProcessor processor = new StaticResourceProcessor();
          processor.process(request, response);
        }
        // Close the socket
        socket.close();

        // check if the previous URI is a shutdown command
        shutdown = request.getUri().equals(SHUTDOWN_COMMAND);
      } catch (IOException e) {
        e.printStackTrace();
        System.exit(1);
      }
    }
  }
}
