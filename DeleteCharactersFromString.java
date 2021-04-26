package week3;

import acm.program.ConsoleProgram;
import java.util.Scanner;
public class DeleteCharactersFromString extends ConsoleProgram {
	
	public static void main(String[] args) {
	  	String str = "This is a test";
	    String str1 = "This is Summer";
	    String str2 = "---0---";
	    
	   System.out.println(removeAllOccurrences(str.replace("t", str2), ""));	    
}

public static String removeAllOccurrences(String str, String str2) {
	for (int i = 0; i < str.length(); i++) {
	}
	return str;
}
}