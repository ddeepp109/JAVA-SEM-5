class employee_main{
	public static void main(String args[]){
		salary s[]=new salary[3];
		int j=0;
		for(int i=0;i<3;i++){
			s[i]=new salary(Integer.parseInt(args[j]),args[j+1],args[j+2],Integer.parseInt(args[j+3]));
			j+=4;
		}
		for(j=0;j<3;j++){
			s[j].details();
		}
	}
}
class employee{
	int employee_id;
	String employee_name;
}
class salary extends employee{
	String e_designation;
	int e_salary;
	salary(){
		employee_id=0;
		e_salary=0;
	}
	salary(int employee_id,String employee_name,String e_designation,int e_salary){
		this.employee_id=employee_id;
		this.employee_name=employee_name;
		this.e_designation=e_designation;
		this.e_salary=e_salary;
	}
	void details(){
		if(e_salary>20000){
			System.out.println("Id: "+employee_id);
			System.out.println("Name: "+employee_name);
			System.out.println("Designation: "+e_designation);
			System.out.println("Salary: "+e_salary);
		}
	}
}
