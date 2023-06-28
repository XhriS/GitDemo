
public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNum = 5;
		String website = "text";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println("values are: " + myNum + ", " + website + ", " + letter + ", " + dec + ", " + myCard);
		
		//Arrays - Allocated memory of 5 values through new operator
		//Static Array
		int [] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		//Static Array
		int [] arr2 = {1,2,3,4,5, 10, 15, 20};
		String [] name = {"Name", "LastName", "Age"};
		//System.out.println(arr2[2]);
		
		//for loop
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		for(int i2 = 0; i2<arr2.length; i2++)
		{
			System.out.println(arr2[i2]);
		}
		
		for(int i3 = 0; i3<name.length; i3++)
		{
			System.out.println(name[i3]);
		}
		
		for(String s : name)
		{
			System.out.println(s);
		}
		
	}

}
