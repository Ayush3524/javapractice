//Program to demonstrate getPriority() and setPriority()
class ThreadDemo extends Thread{
	public void run(){
		System.out.println("Inside run method");
	}
	public static void main(String[] args) {
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		ThreadDemo t3=new ThreadDemo();
		System.out.println("t1 Thread Priority: "+t1.getPriority());
		System.out.println("t2 Thread Priority: "+t2.getPriority());
		System.out.println("t3 Thread Priority: "+t3.getPriority());
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		//t3.setPriority(21); will throw IllegalArgumentException
		System.out.println("t1 Thread Priority: "+t1.getPriority());
		System.out.println("t2 Thread Priority: "+t2.getPriority());
		System.out.println("t3 Thread Priority: "+t3.getPriority());
	}
}