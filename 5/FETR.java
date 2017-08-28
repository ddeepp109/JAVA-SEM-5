class FETR{
	public static void main(String args[]){
		String s="Faculty of Enginneering Technology and Research";
		System.out.println("Character at 10th index: "+s.charAt(9));
		int temp=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='o')
				temp=i;
		}
		System.out.println("Last Index of o: "+temp);
		System.out.println("Length of String: "+s.length());
		String s1=s.toUpperCase();
		System.out.println("Another String with Uppercase: "+s1);
		String s2=s.replace('o','x');
		System.out.println("Another String with o replaced by x: "+s2);
		char c[]=new char[s.length()];
		c=s.toCharArray();
		System.out.println("Trimmed Array: "+s.replaceAll("\\s+",""));
		System.out.println("Researchis present: "+s.endsWith("Research"));
	}
}
