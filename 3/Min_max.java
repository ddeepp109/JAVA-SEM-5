import java.util.*;
class Min_max{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Size of Array: ");
		int size=s.nextInt();
		int i,temp,j;
		int num[]=new int[size];
		System.out.println("Enter Numbers");
		for(i=0;i<(size);i++){
			num[i]=s.nextInt();
		}
		for(i=0;i<(size-1);i++){
			for(j=i+1;j<(size);j++){
				if(num[i]>num[j]){
					temp=num[j];
					num[j]=num[i];
					num[i]=temp;
				}
			}
		}
		System.out.println("Minimum Number "+num[0]);
		System.out.print("Minimum Number "+num[size-1]);
	}
}
