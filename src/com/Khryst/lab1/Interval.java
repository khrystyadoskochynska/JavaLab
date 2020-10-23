/**
 * Package for Lab1
 */
package com.Khryst.lab1;

/**
 * Interval class with methods of operations with intervals
 * @author Khrystya Doskochynska
 * @param a lower value of interval
 * @param b higher value of interval 
 * @param lenFib length of Fibonacci sequence 
 */
public class Interval {

	public int a, b, lenFib;
	
	/**
	 * Constructor with parameters
	 */
	public Interval(int a, int b, int lenFib) {
		super();
		this.a = a;
		this.b = b;
		this.lenFib = lenFib;
	}

	/**
	 * Default constructor
	 */
	public Interval() {
		super();
	}
	
	/**
	 * Method for outputting odd numbers by increase
	 */
   public void oddIncrease() {
		System.out.println("Odd numbers by increase");
    	for(int i=a; i<=b; i++ )
		{
			if(i%2 != 0) {
				System.out.println(i);
			}
		}
	}
	
   /**
	 * Method for outputting even numbers by decrease
	 * Type void means without returning value
	 */
    public void evenDecrease() {
		System.out.println("Even numbers by decrease");
    	for(int i=b; i>=a; i-- )
		{
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
    	//System.out.println("End of function even decrease ");
	}
    
    /**
     * Method for creating sum of odd elements
     */
    public int sumOdd() {
    	
    	int sum = 0;
    	for(int i=a; i<=b; i++ )
		{
			if(i%2 != 0) {
				sum = sum+i;
			
			}
		}
    	return sum;
    }
    
    /**
     * Method for creating sum of even elements
     */
    public int sumEven() {
    	
    	int sum = 0;
    	for(int i=b; i>=a; i-- )
		{
			if(i%2 == 0) {
				sum = sum+i;
			
			}
		}
    	return sum;
    }
    
    /**
     * Method for counting percentage of Odd Fibonacci sequence
     * This function return value with double type
     */
    public double percentageOddFib() {
    	int prev = b-1;
    	int curr = b;
    	int next;
    	int qtyOdd = 1;
    	for(int i=1; i<=lenFib-2; i++) {
    		next = prev+curr;
    		if(next%2 != 0) {
    			
				//System.out.println(next);
				qtyOdd += 1;
			}
    		prev = curr;
    		curr = next; 
    	}
    	
		return (double)qtyOdd/lenFib*100 ;
	}
    
    /**
     * Method for counting percentage of Even Fibonacci sequence
     * This function return value with double type
     */
    
    public double percentageEvenFib() {
    	int prev = b-1;
    	int curr = b;
    	int next;
    	int qtyEven = 1;
    	for(int i=1; i<=lenFib-2; i++) {
    		next = prev+curr;
    		if(next%2 == 0) {
				qtyEven += 1;
			}
    		prev = curr;
    		curr = next; 
    	}
    	
		return (double)qtyEven/lenFib*100 ;
	}
    
    /**
     * Method for outputting Fibonacci sequence
     */
    public void Fib() {
    	
    	System.out.println("Just Fibonacci sequence: " );
    	int prev = b-1;
    	int curr = b;
    	int next = 1;
    	
    	System.out.println(prev);
    	System.out.println(curr);
    	for(int i=3; i<=lenFib; i++) {
    		next = prev+curr;    		  		
    		System.out.println(next);
    		prev = curr;
    		curr = next; 
    	}
    	
	}
}
