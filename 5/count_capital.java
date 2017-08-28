import java.util.Scanner;
class count_capital{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str=new String();
		System.out.print("Enter The String: ");
		str=s.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=65 && str.charAt(i)<=90){
				System.out.println("Capital Letter Found: "+str.charAt(i));
				count++;
			}
		}
		System.out.print("Total Number Of Words Found: "+count);
	}
}
