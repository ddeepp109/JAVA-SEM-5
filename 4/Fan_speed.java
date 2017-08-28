class Fan_speed{
	public static void main(String args[]){
		Fan f1=new Fan();
		Fan f2=new Fan(2,true,6,"brown");
		f1.display();
		f2.display();
	}
}
class Fan{
	final int SLOW=1,MEDIUM=2,FAST=3;
	int speed;
	boolean f_on;
	double radius;
	String color;
	Fan(){
		speed=SLOW;
		f_on=false;
		radius=4;
		color="blue";
	}
	Fan(int speed,boolean f_on,int radius,String color){
		this.speed=speed;
		this.f_on=f_on;
		this.radius=radius;
		this.color=color;
	}
	void display(){
		if(f_on==true){
			System.out.println();
			System.out.println("Speed: "+speed);
			System.out.println("Color: "+color);
			System.out.println("Radius: "+radius);
		}
		else{
			System.out.println();
			System.out.println("FAN is OFF");
			System.out.println("Color: "+color);
			System.out.println("Radius: "+radius);
		}
	}
}
