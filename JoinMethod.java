//join() method
class Mythread extends Thread{
	public void run(){
		for (int i=1;i<=10 ;++i ) {
			System.out.println("child Thread");
			try{
				Thread.sleep(400);
			}catch(InterruptedException ie){}
		}
	}
}
class JoinMethod{
	public static void main(String[] args) throws InterruptedException{
		Mythread t=new Mythread();
		t.start();
		t.join();
		for (int i=1;i<=10 ;++i ) {
			System.out.println("Main Methiod");
		}
	}
}