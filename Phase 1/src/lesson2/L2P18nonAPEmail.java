package lesson2;

import java.util.Scanner;

public class L2P18nonAPEmail {
	public static void emailSearch(String[] emails, String input) {
		String emailRegEx = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";
		boolean found = false;
		if(input.matches(emailRegEx)) {
			for(int i = 0; i < emails.length; i++) {
				if(emails[i].equals(input)) {
					found = true;
					break;
				}					
			}
			if(found)
				System.out.println("That email is FOUND in the list.");
			else
				System.out.println("That email is NOT found in the list.");
		}			
		else {
			System.out.println("The input email is INVALID.");
		}
		
	}
	public static void main(String[] args) {
		System.out.println("Verify if an input email is found in a given email array");
		System.out.println("Use method emailSearch(String[] emails, String input)");		
		String[] emails = {"donal_trump@gmail.com", "thangtran@yahoo.com", "katy2000@hotmail.com", "bad_devil@facebook.com", "learner_86@simplilearn.com"};
		String emailList = "";
		for(int i = 0; i<emails.length; i++)
			emailList += emails[i] + ",";
		System.out.println("Assume the given email array is: " + emailList);
		while(true) {
			System.out.print("\nEnter an email or Q to quit: ");
			String input = new Scanner(System.in).nextLine();
			if(input.equals("Q"))
				break;
			emailSearch(emails, input);		
		}		
	}
}
