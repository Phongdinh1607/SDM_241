import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num = scan.nextDouble();
        double factorial=1;
        scan.close();
        for(int i=1; i<=num; i++) {
        	factorial = factorial*i;
        }
        
        System.out.print("The factorial of the number is: " + factorial); 
	}

}
