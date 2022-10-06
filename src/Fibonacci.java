import java.util.Scanner;

/**
 * 
 *
 * @author marri
 *
 */


public class Fibonacci {

	/**
	 * 
	 * @param args. Here is the main method:
	 */
	public static void main(String[] args) {
		
		int fibWant; 
		
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				
				System.out.println("Enter which fibonacci number you want:");
				fibWant = sc.nextInt(); 
				
				if(fibWant >= 0) {
					break; 
				}
				System.out.println(fibWant + " is invalid input. Please enter values greater than or equal to 0");
			}
		}
		/**
		 * Getting Fib Number Through interation
		 */
		int iterationResult;
		System.out.println("\nCalculating by interation:");
		
		long startTime = System.nanoTime(); //Find start Time 
		iterationResult = interationF(fibWant);
		long endTime = System.nanoTime();
		
		System.out.println("The " + fibWant + " number in the Fibonacci sequence is " + iterationResult);
		long totalTime = endTime - startTime; //Calc Total Time
		System.out.println("Total time " +totalTime);
		
		/** 
		 * Getting Fib Num through recursion
		 */
		
		int recursionResult;
		System.out.println("\nCalculating by recursion:");
		
		startTime = System.nanoTime();
		recursionResult = recursionF(fibWant);
		endTime = System.nanoTime();
		
		
		System.out.println("The " + fibWant + " number in the Fibonacci sequence is " + recursionResult);
		totalTime = endTime - startTime; //Calc Total Time
		System.out.println("Total time " +totalTime);
		
	}
	
	/**
	 * 
	 * @param fibNum. Take in which fib number in sequence user wants.
	 * @return result. Specific nth place Fib number, using iteration
	 */
	public static int interationF(int fibNum) {
		//get start time
		
		int a = 0, b = 1;
		int temp = 0;
		
		if(fibNum <=1) {
			return fibNum;
		}else {
			for(int i = 2; i<=fibNum; i++){
				temp = a + b;
				a = b;
				b = temp;
			}
			
			return b;
		}
		
		//get end time, and calculate total time
		
	}
	
	/**
	 * 
	 * @param fibNum. Take in which fib number in sequence user wants.
	 * @return result. Specific nth place Fib number, using recursion.
	 */
	public static int recursionF(int fibNum) { 
		//get start time
		
		
		//recursion
		int result;
		
		if(fibNum <=1) {
			return fibNum;
		}else {
			int firstNum, secondNum;
			firstNum = recursionF(fibNum-1);
			secondNum = recursionF(fibNum-2);
			result = firstNum + secondNum;
			return result;
		}
		//get end time, and calculate total time
		
		
	}	
	
}
