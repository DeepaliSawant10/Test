package com.javapractice.day1;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*try
		{
			int num1=1;
			int num2=0;
			System.out.println(num1/num2);
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Divide by zero exception");
		}
		
		try {
			int arr[]= {1,2,3};
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Enter a valid input");
		}*/
		
		try {
			String n=null;
			System.out.println(n.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null value");
		}
		finally
		{
			System.out.println("Enter a valid input");
		}
	}

}
