public class Static{

	static int Age;
	static int double_Age;

	static {
		System.out.println(" static block initialized.");
		double_Age = Age * 2;
	}
	
	static void display(){
		
		System.out.println("Age is : " + Age);
		System.out.println("Double of Age is : " + double_Age);
	}

public static void main( String[] args){
	
	
	Static S = new Static();
	S.Age = 21;
	S.display();

}
}
