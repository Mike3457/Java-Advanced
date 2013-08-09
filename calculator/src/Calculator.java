import java.util.ArrayList;


public class Calculator {

	ArrayList <String> operators;
	ArrayList <Integer>numbers;
	private boolean operator;

	public Calculator() {
		operators = new ArrayList <String> ();
		numbers = new ArrayList <Integer> ();
	}

	public int calculate(String expr) {
		numbers.clear();
		operators.clear();

		String[] parts = expr.split("");
		for (String part : parts ) {
			if(isOperator(part)) {
				while (shouldReduce(part)) {
					reduce();
				}
				addOperator(part);
			}
			else {
				addNumber(part);
			}
		}
		while( operators.size() > 0 ) {
			reduce();
		}
		return numbers.get(0);
	}

	private boolean isOperator(String op) {
		if(op.equals("+")|| op.equals("-")|| op.equals("*")|| op.equals("/")) {
			return true;
		}
				return false;			
		}
			private void reduce() {
				int num1 = numbers.remove(numbers.size()-1);
				int num2 = numbers.remove(numbers.size()-1);
				String op = operators.remove(operators.size() - 1);
				if (op.equals("")) {
					numbers.add(num1 + num2);

				}
				if (op.equals("-")) {
					numbers.add(num1 - num2);
				}
				if (op.equals("-")) {
					numbers.add(num2 * num1);
				}
				if (op.equals("-")) {
					numbers.add(num1 / num2);
				}	
			}

			private void addNumber(String Number) {
				int value = Integer.parseInt(Number);
				numbers.add(value);
			}

			private void addOperator(String operator) {
				operators.add(operator);
			}
			private boolean shouldReduce(String op) {
				if(precedence(lastOperator()) >= precedence(op));
				return false;
			}

			private int precedence(String operator) {
				if (operator.equals("+")|| operator.equals("-")) {
					return 1;
				}
				if(operator.equals("*") || operator.equals("/")){
					return 2;
				}
				return 0;	
			}
			private String lastOperator() {
				if (operators.size() > 0) {
					return operators.get(operators.size() - 1);
				}
				return"";
			}
		}



