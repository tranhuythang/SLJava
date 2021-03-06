package lesson1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class L1P6nonAPCalculator {
	public static void main(String[] args) {
		System.out.println("*********************************************************************************************");
		System.out.println("Calculating expressions of the form A o B o C o D o ...");
		System.out.println("o can be x, /, +, - and spaces can be added among o, A, B, C, D, ...");
		System.out.println("The result is calculated from LEFT to right WITHOUT CONSIDERING THE PRECEDENCE: x, /, +, -");
		System.out.println("Division by 0 is valid, its result is INFINITY");
		System.out.println("*********************************************************************************************");
		System.out.println("NOTE the symbol of multiplication is \"x\", not \"*\"");
		System.out.println("*********************************************************************************************");
		while(true) {
			System.out.print("Enter an arithmetic expression or 'Q' to quit: ");
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine().replace(" ", "");
			if(input.toLowerCase().equals("q"))
				break;			
			if(!input.matches("\\d+([+-x/]\\d+)+"))
				System.out.println("Invalid input.");
			else {
				ArrayList<Double> operands = new ArrayList<>();
				ArrayList<String> operators = new ArrayList<>();
				
				Pattern operatorRE = Pattern.compile("[x/+-]");
				Matcher matcher = operatorRE.matcher(input);
				
				int start = 0;
				int end = 0;
				while(matcher.find()) {
					end = matcher.start();
					operators.add(input.substring(end, end + 1));
					operands.add(Double.valueOf(input.substring(start, end)));					
					start = end + 1;
				}
				operands.add(Double.valueOf(input.substring(end+1)));
				Double result = operands.get(0);
				for(int i = 0; i <= operands.size() - 2; i ++) {
					switch(operators.get(i)) {
					case "+":
						result = result + operands.get(i+1);
						break;
					case "-":
						result = result - operands.get(i+1);
						break;
					case "x":
						result = result * operands.get(i+1);
						break;
					case "/":
						result = result / operands.get(i+1);
						break;						
					}					
				}
				System.out.println(input + " = " + result);
			}
		}
		System.out.println("Bye bye");		
	}
}
