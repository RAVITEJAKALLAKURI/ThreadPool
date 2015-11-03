package org.learn.App;

import org.learn.Pool.ThreadPool;

public class Application {
    public static void main(String[] args) throws InterruptedException {
    	//create queue size - 4
    	//Number of threads - 8
        ThreadPool threadPool = new ThreadPool(4,8);
        //Created 15 Tasks and submit to pool
        for(int taskNumber = 1 ; taskNumber <= 15; taskNumber++) {
            TestTask task = new TestTask(taskNumber);
            threadPool.submitTask(task);
        }
    }
}