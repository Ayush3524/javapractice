//yield() method
class MyThread extends Thread{
	public void run(){
		for (int i=1;i<=10 ;++i ) {
			System.out.println("child thread");
			Thread.yield();
		}
	} 
}
class YieldMethod{
	public static void main(String[] args) {
		MyThread t=new MyThread();
		t.start();
		for (int i=1;i<=10 ;++i ) {
			System.out.println("Main thread");
		}
	}
}