import java.util.Scanner;
public class Area{

	int length;
	int breadth;
	void setDim(int L, int B){
		length = L;
		breadth = B;
	}
	int getArea(){

		Scanner sc = new Scanner( System.in);
		System.out.print("Enter Length : ");
		length = sc.nextInt();

		System.out.print("Enter Breadth : ");
		breadth = sc.nextInt();

		return length*breadth;
	}

public static void main( String[] args)
	{

		
		Area A = new Area();
		System.out.println("Area of Rectangle is : " +A.getArea());
	
	}


}