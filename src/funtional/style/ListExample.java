package funtional.style;


public class ListExample {

	public static void main(String[] args) {
		System.out.println("factorial of 5 -->" + factorialTailRecursion(5));
		
		System.out.println("factorial of 5 -->" + factorial(5));

	}
	
	
	static long factorialTailRecursion(long n) {
		return factorialHelper(1, n);
	}
	static long factorialHelper(long acc, long n) {
		return n==1?acc:factorialHelper(acc*n, n-1);
	}
	
	static long factorial(long n) {
		return n==1?n:n*factorial(n-1);
	}

}
