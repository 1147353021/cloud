package com.alibaba.sentinel.test;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyTest {

    @Test
    public void thread() throws ExecutionException, InterruptedException {
        FutureTask<Integer> integerFutureTask = new FutureTask<>(new MyThread());

        new Thread(integerFutureTask).start();

        System.out.println(integerFutureTask.get());

    }

    static class MyThread implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {
            return 1+1;
        }
    }

}
