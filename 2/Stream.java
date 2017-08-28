import java.util.Scanner;
class Stream{
	public static void main(String args[]){
		int i,j,k;
		String a="stream";
		for(i=0;i<6;i++){
			for(j=i;j<6;j++)
				System.out.print(" ");
		
			for(k=0;k<=i;k++)
				System.out.print(a.charAt(k)+" ");
	
			System.out.println();
		    }
    	}
    }
