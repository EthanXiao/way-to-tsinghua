/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-04-27
 */
package com.ethanx.learning.io.api.core;

public interface Receiver<T, RecevierException extends Throwable> {

    void receive(T iterm) throws RecevierException;

    void finished() throws RecevierException;
}
