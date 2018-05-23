/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-05-22
 */
package com.ethanx.learning.async.method.invocation;

import java.util.Optional;

public interface AsyncCallback<T> {

    void onComplete(T value, Optional<Exception> ex);
}