import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n;
		FactApp oFact = new FactApp();
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
	    n = oScan.nextInt();
	
	    System.out.print("The factorial of n is: " + oFact.FactApp(n));

	}

}
