import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Class Package

public class JavaCoreBrushUp2 {

	public static void main(String[] args) {
		
		//Static array
		int [] arr2 = {1,2,3,4,5, 10, 15, 20};
		
		//2, 4, 10, 20
		
		for(int i=0; i<arr2.length; i++)
		{
			if (arr2[i] %2 == 0)
			{
				System.out.println(arr2[i]);
				break;
			}
			else
			{
				System.out.println(arr2[i] + " is not multiple of 2");
			}
		}
		
		//Create Object of the class in order to access methods --> Object.Method
		//This Array will store string values
		ArrayList <String> a = new ArrayList <String>();
		a.add("Christian");
		a.add("Sanchez");
		a.add("Seguin");
		a.add("Texas");
		a.add("Tzzzexas");
		a.remove(3);
		System.out.println(a.get(2));
		
		for(int i=0; i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		//Same behavior as above
		for(String val:a)
		{
			System.out.println(val);
		}
		
		//How to Determine if a certain value is in array list
		System.out.println(a.contains("Christian"));
		
		//Convert Array to ArrayList
		String [] name = {"Name", "LastName", "Age"};
		List <String> convert = Arrays.asList(name);
		
		
	}

}
