import java.util.Scanner;
class Dollar{
    public static void main (String args[]){
		System.out.println("Enter the rupees:");
		Scanner s=new Scanner(System. in);
		int rupees=s.nextInt();
		float dollar=rupees/60;
		System.out.println("Converted dollar is: "+dollar+"$");
    }
}
