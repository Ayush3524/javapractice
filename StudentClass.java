class Student{
	public void show(String name,int rollno){
		System.out.print("The Name is "+name+" and Roll No is "+rollno);
	}
}
class StudentClass{
	public static void main(String[] args) {
		Student obj=new Student();
		obj.show("Ayush",136);
	}
}