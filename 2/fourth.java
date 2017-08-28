import java.util.*;
class calc{
	int add(int i,int j){
		return (i+j);
	}
	int sub(int i,int j){
		return (i-j);
	}
	int mul(int i,int j){
		return (i*j);
	}
	int div(int i,int j){
		return (i/j);
	}
}
class fourth{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("Calculator: ");
		System.out.print("Enter the First Number:  ");
		int i=s.nextInt();
		System.out.print("Enter the Second Number: ");
		int j=s.nextInt();
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		System.out.print("Enter Your Choice: ");
		int choice=s.nextInt();
		float result=0;
		calc c=new calc();
		switch(choice){
			case 1:result=c.add(i,j);
				   break;
				   
			case 2:result=c.sub(i,j);
				   break;
				   
			case 3:result=c.mul(i,j);
				   break;
				
			case 4:result=c.div(i,j);
				   break;
		}
		System.out.print("Answer= "+result);
	}
}
