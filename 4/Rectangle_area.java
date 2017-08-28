class Rectangle_area{
	public static void main(String args[]){
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(5.78,9.78,7,8);
		System.out.println("Default Rectangle: Area: "+r1.getArea()+"  Perimeter: "+r1.Perimeter());
		System.out.println("Specified Rectangle: Area: "+r2.getArea()+"  Perimeter: "+r2.Perimeter());
	}
}
class Rectangle{
	double x,y,width,height;
	Rectangle(){
		x=y=0;
		width=height=1;
	}
	Rectangle(double x,double y,double width,double height){
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	double getArea(){
		return(width*height);
	}
	double Perimeter(){
		return(width+width+height+height);
	}
}
