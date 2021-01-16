package lesson6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
	public static void main(String[] args) {
		String st = "Hello, I am Alex, nice to meet John.";
		Pattern pattern = Pattern.compile("Alex|John");
		Matcher matcher = pattern.matcher(st);
		while(matcher.find()) {
			System.out.println(matcher.group() + ": " + matcher.start() + " " + matcher.end());
		}
	}
}
