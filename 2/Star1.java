import java.util.Scanner;

class Star1{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=5;
		for(int i=0;i<n/2+1;i++){
			System.out.println();
			for(int j=0;j<n/2-i;j++)
				System.out.print("");
			for(int k=0;k<=i;k++)
				System.out.print("*");
		 }
		for(int i=0;i<n/2;i++){
			System.out.println();
			for(int j=0;j<i;j++)
				System.out.print("");
			for(int k=0;k<n/2-i;k++)
				System.out.print("*");
		}
	
	}
}
