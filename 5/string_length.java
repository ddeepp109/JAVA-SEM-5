import java.util.*;
class string_length{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=s.next();
		System.out.println("String Length: "+str.length());
		int l=str.length();
		int l1=l/2;
		String s2=str.substring(0,l1);
		System.out.print("Half String: "+s2);
		
	}
}
