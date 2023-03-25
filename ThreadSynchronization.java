//Thread Synchronization
class A{
	public static synchronized void print(String msg) {
		for (int i=0;i<3 ;++i ) {
			System.out.println("Thread = "+msg);
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
class MyThread1 extends Thread{
	public void run(){
		A.print("MyThread1");
	}
}
class MyThread2 extends Thread{
	public void run(){
		A.print("MyThread2");
	}
}
class MyThread3 extends Thread{
	public void run(){
		A.print("MyThread3");
	}
}
class ThreadSynchronization{
	public static void main(String[] args) {
		new MyThread1().start();
		new MyThread2().start();
		new MyThread3().start();
	}
}