/**
 * Author:  xiaoxin <xiaoxin@tp-link.com.cn>
 * Created: 2018-05-22
 */
package com.ethanx.learning.async.method.invocation;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * Implementation of async executor that creates a new thread for every task.
 *
 */
public class ThreadAsyncExecutor implements AsyncExecutor {

    private final AtomicInteger idx = new AtomicInteger(0);

    @Override
    public <T> AsyncResult<T> startProcess(Callable<T> task) {
        return startProcess(task, null);
    }

    @Override
    public <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> callback) {
        return null;
    }

    @Override
    public <T> T endProcess(AsyncResult<T> asyncResult) throws ExecutionException, InterruptedException{
        return null;
    }

    private static class CompletableResult<T> implements AsyncResult<T> {


        @Override
        public boolean isCompleted() {
            return false;
        }

        @Override
        public T getValue() throws ExecutionException {
            return null;
        }
    }
}