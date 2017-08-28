import java.util.Scanner;
class Rectangle{
	public static void main(String args[]){
		System.out.println ("Enter Length :");
		Scanner s=new Scanner(System.in);
		int len=s.nextInt ();
		System.out.println ("Enter Breadth:");
		int bth=s.nextInt ();
		int area=len*bth;
		System.out.println ("Area of rectangle is:"+area+"unit");
	}
}
