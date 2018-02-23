/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-02-23
 */
package com.ethanx.learning.htw.ex02;

import java.io.IOException;

public class StaticResourceProcessor {

    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}