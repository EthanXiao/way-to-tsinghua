/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-02-22
 */
package com.ethanx.learning.htw.ex01;

import java.io.File;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class HttpServer {

    /** WEB_ROOT is the directory where our HTML and other files reside.
     *  For this package, WEB_ROOT is the "webroot" directory under the working
     *  directory.
     *  The working directory is the location in the file system
     *  from where the java command was invoked.
     */
    public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "webroot";

    // shutdown command
    private static final String SHUTDONW_COMMAND = "/SHUTDOWN";

    // the shutdown command received
    private boolean shutdown = false;

    public static void main(String[] args) {
        HttpServer server = new HttpServer();

        server.await();
    }

    private void await() {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("127.0.0.1", 80));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }

        while (!shutdown) {
            try {
                Socket socket = serverSocket.accept();
                socket.getOutputStream();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}