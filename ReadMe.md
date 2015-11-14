
The project is divided into two packages

	1.) org.learn.App
	2.) org.learn.Pool

Package org.learn.Pool : This packages contains three classes

BlockingQueue : It simulates the blocking queue implementation, we have used LinkedList as underlying datastructure. It contains couple of synchronized methods 

	1.) enqueue : It enqueue the Task to the queue
	2.) dequeue : This method take out the task from the queue.

TaskExecutor  : This class implements the Runnable interface, The run method of this class dequeue the task from the queue (BlockingQueue) and execute the tak.


ThreadPool    : ThreadPool class performs couple of things

	1.) It creates number of TaskExecutor instances, which will be responsible for executing the tasks
	2.) This class exposes one method submitTask which will be called by task generating program to submitTask task to 		    threadPool.
