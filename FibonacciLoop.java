package algorithm;

import java.util.Scanner;

public class FibonacciLoop {
	


	    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			//Asking user for limit of the fibonacci series
			System.out.println("Enter the limit for the fibonacci series");
			int input = sc.nextInt();
			
			//Declaring data types and values
	        int num1 = 0, num2 = 1;
	        System.out.print("Fibonacci Series of "+input+" numbers: \n");

	        int i=1;
	        //Loop to perform fibonacci operation
	        while(i<=input)
	        {
	        	//Using if to limit the series to the user input
	        	if(num1<=input)
	            System.out.print(num1+" ");
	        	
	        	//Adding the previous 2 numbers to give the fibonacci number
	            int sumOfPrevTwo = num1 + num2;
	            num1 = num2;
	            num2 = sumOfPrevTwo;
	            i++;
	        }
	    }//End of main method
	}//End of Class
