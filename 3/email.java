import java.util.*;
class email{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println();
    System.out.print("Enter Email Address: ");
    char[] a=sc.next().toCharArray();
	char email[]=new char[20];
	char server[]=new char[20];
	int i,j,flag=0;
	for(i=0;a[i]!='@';i++){
		email[i]=a[i];
		if(a[i]=='@')
			flag=1;
		else
			flag=0;
	}
	++i;
	for(j=0;i<a.length && j<20 && flag==0;i++){
		server[j]=a[i];
		j++;
	}
	System.out.println();
	if(flag==0){
	System.out.println("It is a Valid Address");
	System.out.print("Email id: ");
	for (i=0;i<20;i++){
	System.out.print(email[i]);	
	}
	System.out.println();
	System.out.print("Email Server address: ");
	for (i=0;i<20;i++){
	System.out.print(server[i]);	
	}
	}
}
}
