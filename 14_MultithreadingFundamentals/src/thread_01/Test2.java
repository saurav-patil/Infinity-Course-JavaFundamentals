package thread_01;

public class Test2 extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println("Thread name in run: " + name);
	}

	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("Thread name in main: " + name);

		Test2 thread = new Test2();// new thread will get created
		// thread.run(); //Calling synchronously
		 thread.start(); // Not Calling synchronously

		// start method is responsible for calling the child thread
		System.out.println("End of the main");
	}
}

//Thread is a program in execution
//We can create multiple threads in a program
//Every thread will have its own path of execution
//In java we can create a thread by two ways i.e,
// - by extending a thread class or by implementing runnable interface
//THREAD is the class present in java.lang package
//method present in thread class is run method which we have to override


//currentThread()- static method of thread class which gives object of thread class 