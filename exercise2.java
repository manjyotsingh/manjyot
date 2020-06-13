package exercise2;
import java.util.Scanner;
public class exercise2 {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int num1;	
		int num2;	
		int sum;	
		int product;	
		int difference;	
		int quotient;	
		
		System.out.print("Enter first integer: ");	
		num1 = input.nextInt();	
		
		System.out.print("Enter second integer: ");	
		num2 = input.nextInt();	
		
		sum	= num1 + num2;	
		product	= num1 * num2;	
		difference = num1 - num2;	
		quotient = num1 / num2;	
		
		System.out.println("Sum =" +sum);	
		System.out.println("Product =" +product);	
		System.out.println("Difference =" +difference);	
		System.out.println("Quotient ="+quotient);	
		
	}	

}
