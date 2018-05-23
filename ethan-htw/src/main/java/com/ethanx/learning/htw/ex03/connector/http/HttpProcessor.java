/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-05-04
 */
package com.ethanx.learning.htw.ex03.connector.http;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

import org.apache.catalina.util.StringManager;

/* this class used to be called HttpServer */
public class HttpProcessor {

    public HttpProcessor(HttpConnector connector) {this.connector = connector;}
    /**
     * The HttpConnector with which this processor is associated.
     */
    private HttpConnector connector = null;
    private HttpRequest request;
    private HttpRequestLine requestLine = new HttpRequestLine();
    private HttpResponse response;

    protected String method = null;
    protected String queryString = null;

    /**
     * The string manager for this package.
     */
    protected StringManager sm = StringManager.getManager("com.ethanx.learning.htw.ex03.connector.http");

    public void process(Socket socket){
        SocketInputStream input = null;
        OutputStream output = null;

        try {
            input = new SocketInputStream(socket.getInputStream(), 2048);
            output = socket.getOutputStream();

            // create HttpRequest object and parse
            request = new HttpRequest(input);

            // create HttpResponse object
            response = new HttpResponse(output);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}