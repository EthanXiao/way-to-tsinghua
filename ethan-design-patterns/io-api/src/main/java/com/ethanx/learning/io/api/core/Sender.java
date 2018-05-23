/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-04-26
 */
package com.ethanx.learning.io.api.core;

public interface Sender<T, SenderThrowableType extends Throwable> {

    /**
     * @param receiver
     * @param <ReceiverThrowableType> Exception when receive data
     * @throws ReceiverThrowableType
     * @throws SenderThrowableType
     */
    <ReceiverThrowableType extends Throwable>
    void sendTo(Receiver<T, ReceiverThrowableType> receiver)
            throws ReceiverThrowableType, SenderThrowableType;
}