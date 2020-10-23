package com.Khryst.lab1;

import java.util.Scanner;
/**
 * Do operations with specified interval. Lab 1.4
 * @author Khrystya Doskochynska
 *
 */
public class Lab14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Input bottom value of interval");
		int a = in.nextInt();
		System.out.println("Input top value of interval");
		int b = in.nextInt();
		
		if(a>b) {
			
			int c = 0;
			c = a;
			a = b;
			b = c;
			
			System.out.println("Elements have been changed succsessfuly");
		}
		
		System.out.println("Input length of Fibonacci sequencee");
		int length = in.nextInt();
		
		Interval myIn = new Interval(a,b, length);
		System.out.println();
		myIn.oddIncrease();
		System.out.println();
		myIn.evenDecrease();
		
		
		
		//System.out.println("Main program after even decrease: " );
		
		System.out.println();
		System.out.println("Sum of odd numbers: "+myIn.sumOdd() );
		System.out.println();
		System.out.println("Percentage of odd numbers in Fibonacci sequence: "+myIn.percentageOddFib() );
	    
		System.out.println();
		System.out.println("Sum of even numbers: "+myIn.sumEven() );
		System.out.println();
		System.out.println("Percentage of even numbers in Fibonacci sequence: "+myIn.percentageEvenFib() );
		System.out.println();
	
		myIn.Fib();
	}
}