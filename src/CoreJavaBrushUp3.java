
public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		
		//String is an object that represents a sequence of characters //String Literal
		//s1 will point to s as it's the same value (1 object is created)
		
		//String s1 = "Christian";
		
		//New Object will be created as it's a new value
		String s4 = "Hello";

		//String new memory allocation. It creates 2 new objects as it includes new String object in memory
		String s2 = new String ("Welcome");
		String s3 = new String ("Welcome");
		
		String s = "Christian get great";
		String [] splitString = s.split("get");
		System.out.println(splitString[0]);
		System.out.println(splitString[1]);
		System.out.println(splitString[1].trim());
		
		//Print character by character
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		//Print characters in reverse order
		for(int i=s.length()-1; i<=0; i--) {
			System.out.println(s.charAt(i));
		}	
		
	}

}
