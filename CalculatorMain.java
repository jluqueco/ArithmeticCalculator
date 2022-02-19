package calculator;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator calc = null;
		int option = 0;
		
		System.out.println("\n******Welcome to your CALCULATOR******\n");
		
		System.out.print("Please enter the initial value: ");
		calc = new Calculator(sc.nextDouble());
		
		while (option != 5){
			System.out.println("\nPlease choose the operation that you would like to perform: ");
			System.out.println("\t1. ADDITION\n\t2. SUBSTRACTION\n\t3. MULTIPLICATION\n\t4. DIVISION\n\t5. EXIT");
			option = sc.nextInt();
			
			if(option < 1 || option > 5) {
				System.out.println("Not a valid entry, please try again.");	
			}else if (option == 5) {
				System.out.println("\nFinal Result: " + calc.getResult());
				System.out.println("\nThank you for choosing CALCULATOR!...");
			}else {
				System.out.println("\nplease enter the value you wish operate");
				calc.operation(sc.nextDouble(), option);
				System.out.println(calc.toString());
			}
		
		}
	}

}
