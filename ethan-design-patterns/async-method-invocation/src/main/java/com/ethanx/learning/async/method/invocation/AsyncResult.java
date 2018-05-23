/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-05-22
 */
package com.ethanx.learning.async.method.invocation;

import java.util.concurrent.ExecutionException;

public interface AsyncResult<T> {

    boolean isCompleted();

    T getValue() throws ExecutionException;



}