/* 
* Created by Andrew Dunham 
* January 13, 2019
* Original work Copyright (c) 2019 Andrew Dunham
*/

import java.util.Scanner;//Scanner is the library for user input. 
import java.lang.Math;//Imports math functions. 

public class AreaCalculator {
	
	static Scanner scanner = new Scanner(System.in);//Static will not be interacting with objects.
	public static void main(String[] args){//void will not return any values.

		//Declaration of objects that will be used. 
		int objectToCalculate;
		double base; 
		double height;
		double radius;
		double edge;
		double area;
		String startAgain;

		System.out.println("~~~~~~~~~~~~~~~~~~~~~AREA CALCULATOR~~~~~~~~~~~~~~~~~~~~~");//Prints with a new line at the end hence the ln(line)
		System.out.println("1. Area of a Rectangle/square\n2. Area of a Triangle\n3. Area of a Circle\n4. Area of a Cube\n5. Area of a Cone\n6. Area of Sphere");
		System.out.print("\nEnter the number of the object you wish to calculate: ");//print prints without a new line
		objectToCalculate = scanner.nextInt();
		
		if (objectToCalculate == 1){
			System.out.print("Enter the rectangle/square's base: ");
			base = scanner.nextDouble();
			System.out.print("Enter the rectangle/square's height:");
			height = scanner.nextDouble();
			area = base * height;
			System.out.println("The area of your rectangle/square is: " + area);
		}
		else if (objectToCalculate == 2){
			System.out.print("Enter the triangle's base: ");
			base = scanner.nextDouble();
			System.out.print("Enter the triangle's height: ");
			height = scanner.nextDouble();
			area = base * height / 2;
			System.out.println("The area of your triangle is: " + area);
		}
		else if (objectToCalculate == 3){
			System.out.print("Enter the circle's radius: ");
			radius = scanner.nextDouble();

			area = Math.PI * Math.pow(radius, 2);
			
			System.out.println("The area of your circle is: " + area);
		}
		else if (objectToCalculate == 4){
			System.out.print("Enter the cube's edge: ");
			edge = scanner.nextDouble();
			area = 6 * Math.pow(edge, 2);
			System.out.println("The area of your cube is: " + area);
		}
		//Calculations for the area of a Cone
		else if (objectToCalculate == 5){
			System.out.print("Enter the cone's radius: ");
			radius = scanner.nextDouble();
			System.out.print("Enter the cone's height: ");
			height = scanner.nextDouble();
			area = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2)+ Math.pow(radius, 2)));
			System.out.println("The area of your cone is: " + area);
		}
		//Calculations for the area of a Sphere
		else if (objectToCalculate == 6){
			System.out.print("Enter the sphere's radius: ");
			radius = scanner.nextDouble();
			area = 4 * Math.PI * Math.pow(radius, 2);
			System.out.println("The area of your sphere is: " + area);
		}
		else{
			System.out.println("Please enter a number that is on the list.");
			System.out.println("Would you like to try again?");

		}

	}
