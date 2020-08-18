/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance to target.\n");
		double d = sc.nextDouble();
		System.out.println("Enter height of battery relative to water.\n");
		double h = sc.nextDouble();
		System.out.println("Enter launch velocity of the shell.\n");
		double v = sc.nextDouble();
		
		double a = -4.9 * Math.pow(d/v, 2);
		double b = d;
		double c = a + h;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		double tanTheta = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
		double Angle = Math.atan(tanTheta)*180/Math.PI;
		System.out.println("The angle is " + Angle + "degrees");
		
	}
}
