package calculator;

import java.util.List;
import java.util.ArrayList;

public class Calculator {
	private final static String ADDITION = "1";
	private final static String SUBSTRACCION = "2";
	private final static String MULTIPLICATION = "3";
	private final static String DIVISION = "4";
	private final static String ADDITIONSIGN = "+";
	private final static String SUBSTRACCIONSIGN = "-";
	private final static String MULTIPLICATIONSIGN = "*";
	private final static String DIVISIONSIGN = "/";
	
	private double result;
	private List<String> list;
	
	/**
	 * @return the result
	 */
	public double getResult() {
		return result;
	}

	public Calculator(double result) {
		this.result = result;
		this.list = new ArrayList<>();
		list.add(String.valueOf(result));
	}
	
	public void operation(double op1, String type) throws ArithmeticException {
		switch(type) {
			case ADDITION: case ADDITIONSIGN: 
				result += op1;
				break;
			case SUBSTRACCION: case SUBSTRACCIONSIGN:
				result -= op1;
				break;
			case MULTIPLICATION: case MULTIPLICATIONSIGN:
				result *= op1;
				break;
			case DIVISION: case DIVISIONSIGN:
				if(op1 != 0) {
					result /= op1;
				}else {
					throw  new ArithmeticException();
				}
				break;
		}
		
		list.add(type);
		list.add(String.valueOf(op1));
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for(String i : list) {
			sb.append(i).append(" ");
		}
		
		return "\nCurrent result of: " + sb.toString() + "= " + result;
	}
}
