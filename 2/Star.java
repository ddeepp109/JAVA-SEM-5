class Star{
	public static void main(String args[]){
		int i,j,k;
		for(i=0;i<3;i++){
			for(j=0;j<i;j++)
				System.out.print(" ");
	
			for(k=i;k<3;k++)
				System.out.print("* ");
			
			System.out.println();
		}
	}
}
