import java.util.Scanner;
class vowel{
	public static void main(String args[]){
	para p=new para();
	p.input();
	}
}
class para{
	Scanner s=new Scanner(System.in);
	int count,flag;
	para(){
		count=0;
		flag=0;
	}
	void input(){
		while(flag==0){
		System.out.println();
		System.out.print("Enter Sentence: ");
		String s1=new String();
		s1=s.nextLine();
		String s2="quit";
		if(s1.equalsIgnoreCase(s2)==true){
			flag=1;
			break;
		}
		else{
			for(int i=0;i<s1.length();i++){
				if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u') 
					count++;
			}
		}
		System.out.print("Vowels in this Senetence: "+count);
		count=0;
	}
}
}
