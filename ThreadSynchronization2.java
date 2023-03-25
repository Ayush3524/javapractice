//Thread Synchronization
class A{
	public static synchronized void print(String msg) {
		for (int i=1;i<=6 ;++i ) {
			System.out.println("Ball = "+i+" Playing "+msg);
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
		A.print("Ayush");
	}
}
class MyThread2 extends Thread{
	public void run(){
		A.print("Aman");
	}
}
class MyThread3 extends Thread{
	public void run(){
		A.print("Rohit");
	}
}
class ThreadSynchronization2{
	public static void main(String[] args) {
		new MyThread1().start();
		new MyThread2().start();
		new MyThread3().start();
	}
}