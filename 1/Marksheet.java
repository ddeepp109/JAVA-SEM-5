import java.util.Scanner;

class Marksheet{
    public static void main(String args[]){
        System.out.println("Enter student name:" );
        Scanner s= new Scanner(System. in);
        String name=s.next();
        
        System.out.println("Enter pen:");
        long pen=s.nextLong();
        
        System.out.println("Enter six subjcet marks:");
       
        int s1=s.nextInt();
        int s2=s.nextInt();
        int s3=s.nextInt();
        int s4=s.nextInt();
        int s5=s.nextInt();
        int s6=s.nextInt();
        
        float per=((s1+s2+s3+s4+s5+s6)/6);
        System.out.println("The percentage is:"+per+"%");
        
    }
}
