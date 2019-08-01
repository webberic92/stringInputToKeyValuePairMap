package inputStringKevValuePairMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		try {
		startMethod();
		}
		catch (Exception e) {
			System.out.println("something went wrong.");

		}
		}
		
				
	private static void startMethod() {
		System.out.println("Please enter your key value pair in a string..");
		Scanner myObj = new Scanner(System.in);
	    String inputString = myObj.nextLine();
		//String inputString = "firstName=pijush&lastName=santra&confirmationNumber=1207125059";
		System.out.println("Your string was...");
		System.out.println(inputString);
		System.out.println("  ");
		
		System.out.println("lets see if this is a valid input....");
		System.out.println("  ");
		
		int countEquals = 0;
		int countAmpersand = 0;
		
	    //Counts each equals   
        for(int i = 0; i < inputString.length(); i++) {    
            if(inputString.charAt(i) == '=')    
            	countEquals++;    
        }    
      //Counts each ampersand    
        for(int i = 0; i < inputString.length(); i++) {    
            if(inputString.charAt(i) == '&')    
            	countAmpersand++;    
        }    
		System.out.println("Ampersands: " + countAmpersand + " Equals : " + countEquals );
		
		//If  equals signs minus 1 == ampersands then is valid input else try again.
		if (countAmpersand == countEquals - 1) {
			System.out.println("This is valid input." );
			System.out.println("breaking them up they become.");
			System.out.println("  ");
			System.out.println("  ");
			stringToKeyValue(inputString);
		}else {
				System.out.println("This is INVALID input." );
				System.out.println("Please try again..." );
				startMethod();
				

			}
	}		
	

	private static void stringToKeyValue(String inputString) {
		
		//Breaks strings up when running into "& or an = "
		String[] listString1 = inputString.split("&|=");
		for (String a : listString1) 
            System.out.println(a);
		System.out.println("  ");

		
		//creates map and puts x for key and x+1 for value
		Map<String, String> map = new HashMap<>();		
		for(int x=0;x < listString1.length;x++) {
			
			map.put(listString1[x], listString1[x+1]);
		
				x++;
			
			}
		
		//turns Maps entry set to an array and then string and displays.
		Object[] objectArray = map.entrySet().toArray();
		System.out.println("As Key Value Pair.");
		System.out.println(Arrays.toString(objectArray));
		startMethod();

	}		
	}
//indexOf();
			

