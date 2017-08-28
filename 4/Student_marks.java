import java.util.*;
class student{
	int regno,total;
	String name;
	int marks[]=new int[3];
	void in(){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Reg.No: ");
		regno=s.nextInt();
		System.out.print("Enter Name: ");
		name=s.next();
		System.out.print("Enter Marks: ");
		for(int i=0;i<3;i++)
		marks[i]=s.nextInt();
	}
	void display(){
		System.out.println("Reg. no: "+regno);
		System.out.println("Name: "+name);
		System.out.print("Marks: ");
		for(int i=0;i<3;i++){
			System.out.print(" "+marks[i]);
			total=total+marks[i];
		}
		System.out.println();
		System.out.println("Total: "+total);
		System.out.println();
	}
}
class Student_marks{
	public static void main(String args[]){
		student[] s=new student[5];
		int i;
		System.out.println("Get info of Students");
		for(i=0;i<5;i++){
			s[i]=new student();
			System.out.println();
			s[i].in();
		}
		System.out.println("Display info of Students");
		for(i=0;i<5;i++){
			System.out.println();
			s[i].display();
		}
	}
}
