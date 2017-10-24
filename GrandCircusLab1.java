
import java.util.Scanner;

public class GrandCircusLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double roomLength, roomWidth, roomArea, roomPerimeter = 0.0;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		System.out.println("Enter length:");
		roomLength = scnr.nextDouble();
		
		System.out.println("Enter width:");
		roomWidth = scnr.nextDouble();
		
		roomArea = (roomWidth * roomLength);
		roomPerimeter = (2 * (roomWidth + roomLength));
		
		System.out.println("Area: " + roomArea);
		System.out.println("Perimeter: " + roomPerimeter);
		
		
		}
		
	}


