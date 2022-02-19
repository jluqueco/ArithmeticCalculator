package calculator;

public class Calculator {
	private final static int ADDITION = 1;
	private final static int SUBSTRACCION = 2;
	private final static int MULTIPLICATION = 3;
	private final static int DIVISION = 4;
	private double result;
	
	/**
	 * @return the result
	 */
	public double getResult() {
		return result;
	}

	public Calculator(double result) {
		this.result = result;
	}
	
	public void operation(double op1, int type) throws ArithmeticException {
		switch(type) {
			case ADDITION: 
				result += op1;
				break;
			case SUBSTRACCION:
				result -= op1;
				break;
			case MULTIPLICATION:
				result *= op1;
				break;
			case DIVISION:
				if(op1 != 0) {
					result /= op1;
				}else {
					throw  new ArithmeticException();
				}
				break;
		}
	}

	@Override
	public String toString() {
		return "\nCurrent result: " + result;
	}
}
