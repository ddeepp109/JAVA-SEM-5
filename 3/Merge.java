import java.util.*;
class Merge{
public static void main(String args[]){
	int a[]=new int[5];
	int b[]=new int[5];
	int join[]=new int[10];
	int i,j,k,flag,temp;
	Scanner s=new Scanner(System.in);
	for(i=0;i<5;i++){
		System.out.println("Enter a "+i);
		a[i]=s.nextInt();
	}
	for(i=0;i<5;i++){
		System.out.println("Enter b "+i);
		b[i]=s.nextInt();
	}
	System.out.println("\n1.Duplication Allowed\n2.Duplication Not Allowed");
	k=s.nextInt();
	for(i=0;i<5;i++){
		join[i]=a[i];
	}
	j=5;
	for(i=0;i<5 && j<10;i++){
		join[j]=b[i];
		j++;
	}
	System.out.println("Array Before");
	for(i=0;i<10;i++){
		System.out.print("  "+join[i]);
	}
	System.out.println();
	if(k==2){
		for(i=0;i<9;i++){
			for(j=i+1;j<10;j++){
				if(join[i]==join[j]){
					join[j]='\0';
				}
			}
		}
	}
	if(k==1)
	{
		
	}
	for(i=0;i<9;i++){
			for(j=i+1;j<10;j++){
				if(join[i]>join[j]){
					temp=join[j];
					join[j]=join[i];
					join[i]=temp;
				}
			}
		}
	System.out.println("Array After With Sorting");
	if(k==2)
	System.out.println("Duplicates are equaled to 0");
	for(i=0;i<10;i++){
		System.out.print("  "+join[i]);
	}
}
}
