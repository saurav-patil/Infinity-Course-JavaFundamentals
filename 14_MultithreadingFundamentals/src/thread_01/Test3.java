package thread_01;
class Task implements Runnable{
	@Override
	public void run() { //Task tobe preformed by worker thread //RUNNING STATE
		String name = Thread.currentThread().getName();
		for(int i=1; i<=5; i++) {
			System.out.println(name+" = "+i);
			try {
				Thread.sleep(1000); //BLOCK STATE
			} catch (InterruptedException e) {
				System.out.println("Thread got interuppted.");
			}
		}
	}	//DEAD STATE
}
public class Test3 {
	public static void main(String[] args) {
		System.out.println("Start of main -- ");
		
		Thread t1 = new Thread(new Task()); //Worker Thread //NEW STATE
		t1.start(); //RUNNABLE STATE
		
		System.out.println("---- end of main ----");
	}
}
