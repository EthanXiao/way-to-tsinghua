/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-04-26
 */
package com.ethanx.learning.io.api.core.filer;

public interface Function<From, To> {

    /**
     * @return return the transformed data. {@code null} to indicate ignore the input data.
     */
    To map(From from);
}
