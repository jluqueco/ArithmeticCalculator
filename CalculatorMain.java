package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {

	public static boolean validate(String op) {
		String options[] = {"1","2","3","4","5","/","*","-","+"};
		
		for(String i : options) {
			if(op.equals(i)) {
				return true;	
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Calculator calc = null;
			String option = "";
			
			System.out.println("\n******Welcome to your CALCULATOR******\n");
			
			System.out.print("Please enter the initial value: ");
			calc = new Calculator(sc.nextDouble());
			
			while (!option.equals("5")){
				System.out.println("\nPlease choose the operation that you would like to perform: ");
				System.out.println("\t1. ADDITION(+)\n\t2. SUBSTRACTION(-)\n\t3. MULTIPLICATION(*)\n\t4. DIVISION(/)\n\t5. EXIT");
				option = sc.next();
				
				if(!validate(option)) {
					System.out.println("Not a valid entry, please try again.");	
				}else if (option.equals("5")) {
					System.out.println("\nFinal Result: " + calc.getResult());
					System.out.println("\nThank you for choosing CALCULATOR!...");
				}else {
					System.out.println("\nplease enter the value you wish operate");
					calc.operation(sc.nextDouble(), option);
					System.out.println(calc.toString());
				}
			
			}
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(InputMismatchException e) {
			System.err.println("\n*****Ilegal entry, please make sure that your input is a valid one*****");
		}
	}

}
