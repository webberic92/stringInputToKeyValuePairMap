package inputStringKevValuePairMap;
import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class TestJunit {
	
	
	//tested and worked.
	//stringToKeyValue("=");
	//stringToKeyValue("=&");
	//stringToKeyValue("=&=");
	//stringToKeyValue("===&");
	//stringToKeyValue("&&&===");
	//stringToKeyValue("a=1");
	//stringToKeyValue("a=1&");
	//stringToKeyValue("a=1&=");
	//stringToKeyValue("a=1&b=");
	//stringToKeyValue("a=1&b=2");
	//stringToKeyValue("a=1=2");
	//stringToKeyValue("a=1&=2");
	//stringToKeyValue("a=1&b=2&");
	//stringToKeyValue("a=1&b=2=");
	//stringToKeyValue(" a=1");
	//stringToKeyValue("  a=1");
	//stringToKeyValue(" = & = ");
	//stringToKeyValue("a=1 "); 
	//stringToKeyValue("a=1 &b=2");
	
	
	
		
   String test1 = "";
   String test2 = " ";
   String test3 = " ahhh";
   String test4 = "test";
   String test5 = "emptyspaceAtEndofString ";
   String test6 = "a=b"; //true
   String test7 = "a=";
   String test8 = "&&&&&==";
   String test9 = "a=1&b=2"; //true
   String test10 = "=1&b=2";
   String test11 = "a=&b=2";
   String test12 = "a=1&=2";
   String test13 = "a=1&b=";
   String test14 = "a=1&b=2&";
   String test15 = "a=1&b=2=";
   String test16 = " a=1";
   String test17 = "  a=1";
   String test18 = " = & = ";
   String test19 = "a=1 ";
   String test20 = "a=1 &b=2";
   String test21 = "a=1&";
   String test22 = "a=1&=";
   String test23 = "=&=";
   String test24 = "a=1& b=2";
   String test25 = null; 
   String test26 = "a=1&a=2";//duplicate keys
   String test27 = "a=1&b=2&a=3";//duplicate keys
   String test28 = "a=1&b=1&a=1";//duplicate keys 

   
   
   
   @Test
   public void cantBeEmpty() {	
	   MessageUtil messageUtil = new MessageUtil(test1);
      assertEquals(false,messageUtil.printMessage());
   }
   
   
   @Test
   public void cantBeEmptyFirstSpace() {	
	   MessageUtil messageUtil = new MessageUtil(test2); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   @Test
   public void cantBeEmptyFirstSpaceAdded() {	
	   MessageUtil messageUtil = new MessageUtil(test3); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
   @Test
   public void testGood() {	
	   MessageUtil messageUtil = new MessageUtil(test4); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
   @Test
   public void cantBeEmptySpaceAtEndofString() {	
	   MessageUtil messageUtil = new MessageUtil(test5); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
   @Test
   public void MustBeAtleast3CharactersTrue() {	
	   MessageUtil messageUtil = new MessageUtil(test6); 	
	   assertEquals(true,messageUtil.printMessage());
   }
   
   @Test
   public void MustBeAtleast3Charactersfalse() {	
	   MessageUtil messageUtil = new MessageUtil(test7); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
   @Test
   public void mustHaveCorrectAmpersandAndEqualsFalse() {	
	   MessageUtil messageUtil = new MessageUtil(test8); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
   @Test
   public void mustHaveCorrectAmpersandAndEqualsTrue() {	
	   MessageUtil messageUtil = new MessageUtil(test9); 	
	   assertEquals(true,messageUtil.printMessage());
   }
   
   @Test
   public void beginingKeyCantBeMissing() {	
	   MessageUtil messageUtil = new MessageUtil(test10); 	
	   assertEquals(false,messageUtil.printMessage());
   }

   @Test
   public void beginingValueCantBeMissing() {	
	   MessageUtil messageUtil = new MessageUtil(test11); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
   @Test
   public void nextKeyCantBeMissing() {	
	   MessageUtil messageUtil = new MessageUtil(test12); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
   @Test
   public void nextValueCantBeMissing() {	
	   MessageUtil messageUtil = new MessageUtil(test13); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
   @Test
   public void twoAndEndsWithampersand() {	
	   MessageUtil messageUtil = new MessageUtil(test14); 	
	   assertEquals(false,messageUtil.printMessage());
   }
   
 @Test
 public void twoAndEndsWithEquals() {	
	   MessageUtil messageUtil = new MessageUtil(test15); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void cantBeEmptySpaceButGoodKeyValue() {	
	   MessageUtil messageUtil = new MessageUtil(test16); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void doubleSpacedBeggining() {	
	   MessageUtil messageUtil = new MessageUtil(test17); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void SpacesButCorrectSyntax() {	
	   MessageUtil messageUtil = new MessageUtil(test18); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void GoodKVbutSpaceAtEnd() {	
	   MessageUtil messageUtil = new MessageUtil(test19); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void GKVButSpaceInMiddle() {	
	   MessageUtil messageUtil = new MessageUtil(test20); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void aEqualsOneAnd() {	
	   MessageUtil messageUtil = new MessageUtil(test21); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void aEqualsOneAndEquals() {	
	   MessageUtil messageUtil = new MessageUtil(test22); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void EqualdAmpersandEquals() {	
	   MessageUtil messageUtil = new MessageUtil(test23); 	
	   assertEquals(false,messageUtil.printMessage());
 }
 @Test
 public void spaceAfterAmpersand() {	
	   MessageUtil messageUtil = new MessageUtil(test24); 	
	   assertEquals(false,messageUtil.printMessage());
 }

 @Test
 public void nullEqualsNull() {	
	   MessageUtil messageUtil = new MessageUtil(test24); 	
	   assertEquals(false,messageUtil.printMessage());
 }
 
 @Test
 public void nullMethodTest() {	
	   MessageUtil messageUtil = new MessageUtil(test25); 	
	   assertEquals(false,messageUtil.printMessage());
 }
 @Test
 public void noRepeatingKeys() {	
	   MessageUtil messageUtil = new MessageUtil(test26); 	
	   assertEquals(false,messageUtil.printMessage());
 }
 
 @Test
 public void noRepeatingKeys2() {	
	   MessageUtil messageUtil = new MessageUtil(test27); 	
	   assertEquals(false,messageUtil.printMessage());
 }
 @Test
 public void sameValuesnotKeys() {	
	   MessageUtil messageUtil = new MessageUtil(test28); 	
	   assertEquals(false,messageUtil.printMessage());
 }
 
 
 					 }
 
 
 					
   

  
  
   