/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-04-26
 */
package com.ethanx.learning.io.api.core;

public interface Output<T, ReceiverThrowableType extends Throwable> {

    <SenderThrowableType extends Throwable>
    void receiveFrom(Sender<T, SenderThrowableType> sender)
            throws ReceiverThrowableType, SenderThrowableType;
}