class complex_add{
	public static void main(String args[]){
	complex c1=new complex(7,9);
	complex c2=new complex(5,4);
	complex c3=c1.add(c2);
	complex c4=c2.sub(c1);
	c3.display();
	c4.display();
	}
}
class complex{
	float real,imag;
	complex(){
		real=imag=0;
	}
	complex(float real,float imag){
		this.real=real;
		this.imag=imag;
	}
	complex add(complex c){
		complex temp=new complex();
		temp.real=this.real+c.real;
		temp.imag=this.imag+c.imag;
		return temp;
	}
	complex sub(complex c){
		complex temp=new complex();
		temp.real=this.real-c.real;
		temp.imag=this.imag-c.imag;
		return temp;
	}
	void display(){
		System.out.println("The Number is: ("+real+","+imag+")");
	}
}
