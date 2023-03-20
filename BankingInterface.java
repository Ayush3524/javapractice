//Impliementing Interface in Multiple Classes
interface RBI{
	void findInterest();
}
class SBI implements RBI{
	public void findInterest(){
		System.out.println("SBI Interset logic Implementation");
	}
}
class PNB implements RBI{
	public void findInterest(){
		System.out.println("PNB Interset logic Implementation");
	}
}
class MHB implements RBI{
	public void findInterest(){
		System.out.println("MHB Interset logic Implementation");
	}
}
class BankingInterface{
	public static void main(String[] args) {
		RBI r1,r2,r3;
		r1=new SBI();
		r2=new PNB();
		r3=new MHB();
		r1.findInterest();
		r2.findInterest();
		r3.findInterest();
	}
}