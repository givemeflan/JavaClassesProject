public class Calculator {
    public static void main(String[] args) {
		
		System.out.println(add(5,7));
		System.out.println(subtract(3,2));
		System.out.println(multiply(4,8));
		System.out.println(divide(4,12));
		System.out.println(squared(10));
	}
	public static int add(int num1, int num2) {
		
		int sum = num1 + num2;
		
		return sum;
	}
	
	public static int subtract(int num1, int num2) {
		
		int diff = num1 - num2;
		
		return diff;
	
	}
	public static int multiply(int num1, int num2) {
	
	int multi = num1 * num2;
	
	return multi;
	
	}	
	public static int divide(int num1, int num2) {
	
	int div = num2 / num1;
	
	return div;
	
	}
	public static int squared(int num1) {
	
	int square = num1 * num1;
	
	return square;
	
	}}























}
