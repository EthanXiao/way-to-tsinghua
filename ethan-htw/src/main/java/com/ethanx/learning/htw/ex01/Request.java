/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-02-22
 */
package com.ethanx.learning.htw.ex01;

import java.io.InputStream;

public class Request {
    private InputStream input;

    private String uri;

    public Request(InputStream input) {
        this.input = input;
    }

    public void parse() {}

    public String parseUri(String requestString) {

    }
}