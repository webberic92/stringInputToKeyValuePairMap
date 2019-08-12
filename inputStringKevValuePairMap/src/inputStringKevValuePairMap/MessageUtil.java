package inputStringKevValuePairMap;
/*
* This class prints the given message on console.
*/

import java.util.HashMap;
import java.util.Map;

public class MessageUtil {

   private String message;

   //Constructor
   //@param message to be printed
   public MessageUtil(String message){
      this.message = message;
   }
      
   // prints the message
   public boolean printMessage(){
	  
	 //Cant be empty
	   if(message == null){
			System.out.println("Cant be NULL" );
			return false;}
	   
	 	 		if(message != null && message.length() == 0){
	 			System.out.println("Cant be Empty!" );
	 			return false;}
	 		
	 		if(message != null && message.charAt(0) == ' '){
				System.out.println("Cant be Empty first character no empty SPACE." );
				return false;}
	 		
	 		if(message != null && message.charAt(message.length() -1) == ' '){
				System.out.println("Cant End with empty space, no empty SPACE." );
				return false;}
	 		
	 		if(message.length() <= 2 ) {
				System.out.println("This is INVALID input. Not enough information to make a key pair." );
				return false;}
	 		
	 		if ((message.charAt(message.length() - 1)) == '=') {
				System.out.println("You are missing last value! Cant not be empty");
				return false;}
	 		
	 		int countEquals = 0;
			int countAmpersand = 0;
			
			 for(int i = 0; i < message.length(); i++) {    
		            if(message.charAt(i) == '=') {    
		            	countEquals++;   }}
			 for(int i = 0; i < message.length(); i++) {    
		            if(message.charAt(i) == '&')   { 
		            	countAmpersand++; }  }
				System.out.println("Ampersands: " + countAmpersand + " Equals : " + countEquals );
				
				if (countAmpersand != countEquals - 1) {
					return false;
					}
				
				String[] listString1 = message.split("&|=| ");
				
				for (int i = 0; i < listString1.length; i++) {
				if (listString1[i].isEmpty()) {
					System.out.println("You are missing a key or value or are using an illegal empty space.");
				return false;}
				
				if (listString1[i].equals(" ")) {
					System.out.println("You are missing a key or value.Can not use an empty space.");
					return false;}	
				}
				
				
				// creates map and puts x for key and x+1 for value then x++
				Map<String, String> map = new HashMap<>();
				for (int x = 0; x < listString1.length; x++) {
					
					if(x>1 && listString1[x].equals(listString1[x-2])) {
						System.out.println("map cannot have duplicate keys");
						return false;					}else {
						if (map.containsKey(listString1[x])) {
							System.out.println("map cannot have duplicate keyssss");
							return false;					}else {

						}
						map.put(listString1[x], listString1[x + 1]);
					}
					x++;
				}
				return true;}}
					
//				Map<String, String> map = new HashMap<>();
//				if(map.containsKey(listString1[x])) {
//					System.out.println("map cannot have duplicate keyssss");
//					return false;
//				}
//				else{
//				System.out.println(message);
//				map.put(listString1[x], listString1[x + 1]);
//			     x++;
//				return true;
//			      
//				}}
//				return false;}
//}