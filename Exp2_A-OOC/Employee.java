public class Employee{
	String name;
	String Last_name;
	double monthly_salary;

	Employee( String FN, String LN, double Month_Sal){
		name = FN;
		Last_name = LN;
		monthly_salary = Month_Sal;
	}
		
	void setter(String FN, String LN, double Month_Sal){

		name= "Sahil";
		Last_name = "Patil";
		monthly_salary = 0.0;
	}
	
	void getter(){

		System.out.println("First Name : " +name);
		System.out.println("Last Name : " +Last_name);
		System.out.println("\n Monthly salary : " +monthly_salary);
	}


public static void main( String[] args){
	
	Employee e=new Employee("Nilam" , "Hatkar",100);
	e.getter();


	e.setter("Sahil", "Patil", 0.0);
	e.getter();
}

}
	