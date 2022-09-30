package thread_01;

public class Test {

	public static void main(String[] args) {
		String name = Thread.currentThread().getName();
		System.out.println("Thrad name in main: "+name);
	}

}

//Thread is a program in execution
//We can create multiple threads in a program
//Every thread will have its own path of execution
//In java we can create a thread by two ways i.e,
// - by extending a thread class or by implementing runnable interface