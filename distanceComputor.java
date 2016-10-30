//**********************************|
//Author: Kailean Hunter      		|
//File Name: Project2         		|
//Project: Distance Computor		|
//Date: 9/12/16		          		|
//**********************************|
import java.util.Scanner;
public class distanceComputor {
	public static void main (String[]args){
		
		double X3, Y3, answer1, realAnswer;
		double squareRoot;
		
		System.out.println("Please Enter the Coordinates for Two Points Below:");
		System.out.println("");
		System.out.println("Point One:");
		System.out.print("X:");														//Scans for X1
		Scanner in = new Scanner(System.in);
		double X1 = in.nextDouble();
				
		System.out.print("Y:");														//Scans for Y1
		Scanner in1 = new Scanner(System.in);
		double Y1 = in1.nextDouble();		
		
		System.out.println("Point Two:");
		System.out.print("X:");														//Scans for X2
		Scanner in2 = new Scanner(System.in);
		double X2 = in2.nextDouble();
				
		System.out.print("Y:");														//Scans for Y2
		Scanner in3 = new Scanner(System.in);
		double Y2 = in3.nextDouble();	
		
		X3 = (X2 - X1);												
		X3 *= X3; 																	//(x2-x1)^2
		//System.out.println(X3);			//~~math check for (x2-x1)^2
		
		Y3 = (Y2 - Y1);
		Y3 *= Y3; 																	//(y2-y1)^2
		//System.out.println(Y3);			//~~math check for (y2-y1)^2	
		
		answer1 = X3 + Y3;
		//System.out.println(answer1);		//~~math check
		
		realAnswer = Math.sqrt(answer1);											//Determines Square root
		System.out.println("");
		System.out.println("The Distance Between Points One and Two is: "+realAnswer);
}
}
