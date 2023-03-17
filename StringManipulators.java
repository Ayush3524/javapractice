class StringManipulators{
	public static void main(String[] args) {
		String str="ayush";
		System.out.println(str);
		String str1=new String("ayush");
		System.out.println(str1);

		char[] ch={'a','y','u','s','h'};
		String str3=new String(ch);
		System.out.println(str3);

		char[] ch1={'a','y','u','s','h','n','a','r','u','l','e'};
		String str4=new String(ch1,2,8);
		System.out.println(str4);

		byte[] b={65,66,67,68,69,70};
		String str5=new String(b);
		System.out.println(str5);

		byte[] b1={65,66,67,68,69,70};
		String str6=new String(b1,2,4);
		System.out.println(str6);
	}
}