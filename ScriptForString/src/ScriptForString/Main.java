package ScriptForString;

import java.util.Scanner;

public class Main {public static void main(String[] arg) {
		
	String word1 = enterFirstWord();
	String word2 = enterSecondWord();
	
	String words = String.join(" ", word1, word2);
	System.out.println("You've entered these words: " + words);
	
	
}
	
private static String enterFirstWord() {
	
	System.out.println("Enter a first word!");
	Scanner word = new Scanner(System.in);
	String a = word.next();
	
	return a;
}

private static String enterSecondWord() {
	
	System.out.println("Enter a second word!");
	Scanner word = new Scanner(System.in);
	String a = word.next();
	
	return a;
}


}
