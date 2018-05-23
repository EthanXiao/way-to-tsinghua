package com.ethanx.learning.htw.ex03.connector.http;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xiaoxin on 2018/3/4.
 */
public class HttpConnector implements Runnable {

    boolean stopped;

    private String scheme = "http";

    public void run() {
        ServerSocket serverSocket = null;
        int port = 8080;

        try {
            //backlog 用于存放还未来的及处理的Socket队列的容量
            serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        while (!stopped) {
            // Accept the next incoming connection from the server socket
            Socket socket = null;
            try {
                socket = serverSocket.accept();
            } catch (IOException e) {
                continue;
            }
            // Hand this socket off to an HttpProcessor
            HttpProcessor processor = new HttpProcessor(this);
            processor.process(socket);
        }
    }

    public void start() {
        Thread thread = new Thread(this);
        thread.start();
    }

}
