class convert_temp{
	public static void main(String args[]){
		convert c=new convert();
		float temp=c.ctof(50);
		System.out.println("The Celcius to Fahrenheit: "+c.ctof(50));
		System.out.println("The Fahrenheit to Celcius: "+c.ftoc(50));
	}
}
class convert{
	float ctof(float c){
		return ((c*(9/5))+32);
	}
	float ftoc(float f){
		return ((f-32)*(5/9));
	}
}
