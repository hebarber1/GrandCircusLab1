import java.util.Scanner;

public class Lab1Test {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double roomLength, roomWidth, roomArea, roomPerimeter = 0.0;
		String c = " "; //using for continue (y/n)
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		System.out.println("Enter length:");
		roomLength = scnr.nextDouble();
		
		System.out.println("Enter width:");
		roomWidth = scnr.nextDouble();
		
		roomArea = (roomWidth * roomLength);  //calculates Area of rectangle (w * l)
		roomPerimeter = (2 * (roomWidth + roomLength)); // calculates Perimeter 2(w + l)
		
		System.out.println("Area: " + roomArea);
		System.out.println("Perimeter: " + roomPerimeter);
		
		System.out.println ("Continue? (y/n):");
		
		
		
			
		
		}

}
