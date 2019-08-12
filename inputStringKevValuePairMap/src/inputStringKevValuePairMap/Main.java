package inputStringKevValuePairMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try {

			startMethod();
		} catch (Exception e) {
			System.out.println("Something went wrong. Please restart.");

		}
	}

	private static void startMethod() {
		System.out.println("Please enter your key value pair in a string..");
		Scanner myObj = new Scanner(System.in);
		String inputString = myObj.nextLine();

		// for testing.
		// String inputString =
		// "firstName=pijush&lastName=santra&confirmationNumber=1207125059";
		System.out.println("Your string was...");
		System.out.println(inputString);
		System.out.println("  ");
		System.out.println("lets see if this is a valid input....");
		System.out.println("  ");

		
		//Cant be null
		 if(inputString == null){
				System.out.println("Cant be NULL" );
				startMethod();
				}
		
		// Cant be empty.
		if (inputString != null && inputString.length() == 0) {
			System.out.println("Cant be Empty!");
			startMethod();

		}
		// Cant be empty first.
		if (inputString != null && inputString.charAt(0) == 0) {
			System.out.println("Cant be Empty first character");
			System.out.println("Please Try again..");
		}
		// Cant be empty space first.
		if (inputString != null && inputString.charAt(0) == ' ') {
			System.out.println("Cant be Empty first character no empty SPACE.");
			System.out.println("Please Try again..");
			startMethod();
		}
		// Cant end with empty space first.
		if (inputString != null && inputString.charAt(inputString.length() - 1) == ' ') {
			System.out.println("Cant End with empty space, no empty SPACE.");
			System.out.println("Please Try again..");
			startMethod();
		}

		// validation that theirs atleast 2 characters (Takes 3 characters to make a key
		// pair (EX.. a=1 <-- 3 characters used))
		if (inputString.length() <= 2) {
			System.out.println("This is INVALID input. Not enough information to make a key pair.");
			System.out.println("Please try again.");
			startMethod();
		}

		// verifies you can not have last character in string be missing value.
		if ((inputString.charAt(inputString.length() - 1)) == '=') {
			System.out.println("You are missing last value! Cant not be empty");
			System.out.println("Please Try again..");
			startMethod();
		}

		// COUNTERS
		int countEquals = 0;
		int countAmpersand = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == '=')
				countEquals++;
		}
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == '&')
				countAmpersand++;
		}
		System.out.println("Ampersands: " + countAmpersand + " Equals : " + countEquals);

		// Validates whether Counters make sense.
		if (countAmpersand == countEquals - 1) {
			stringToKeyValue(inputString);
		} else {
			System.out.println("This is INVALID input. Your Syntax is OFF! check your " + "= " + "and " + "&. ");
			System.out.println("Please try again......,");
			startMethod();
		}
	}

	private static void stringToKeyValue(String inputString) {

		// Breaks strings up when running into "& or an = "
		String[] listString1 = inputString.split("&|=| ");

		// Verifies all but last keys and values are not empty.
		for (int i = 0; i < listString1.length; i++) {
			if (listString1[i].isEmpty()) {
				System.out.println("You are missing a key or value or are using an illegal empty space.");
				System.out.println("Please Try again..");
				startMethod();

				if (listString1[i].equals(" ")) {
					System.out.println("You are missing a key or value.Can not use an empty space.");
					System.out.println("Please Try again..");
					startMethod();
				}
			}
		}

		System.out.println("This is valid input.");
		System.out.println("breaking them up they become.");
		System.out.println("  ");

		// For ease of use : shows array of strings.
		// Can be deleted
		for (String a : listString1) {
			System.out.println(a);
		}

		// creates map and puts x for key and x+1 for value then x++
		Map<String, String> map = new HashMap<>();
		for (int x = 0; x < listString1.length; x++) {
			
			if(x>1 && listString1[x].equals(listString1[x-2])) {
				System.out.println("map cannot have duplicate keys");
				startMethod();
			}else {
				if (map.containsKey(listString1[x])) {
					System.out.println("map cannot have duplicate keyssss");
					startMethod();

				}
				map.put(listString1[x], listString1[x + 1]);
			}
			x++;
		}
		

		// turns Maps entry set to an array and then string and displays.
		Object[] objectArray = map.entrySet().toArray();
		System.out.println("As Key Value Pair.");
		System.out.println(Arrays.toString(objectArray));
		startMethod();

	}
}

//indexOf();
