/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-04-26
 */
package com.ethanx.learning.io.api.core;

public interface Input<T, SenderThrowableType extends Throwable> {

    <RecevierThrowableType extends Throwable>
    void transferTo(Output<T, RecevierThrowableType> output) throws SenderThrowableType, RecevierThrowableType;
}