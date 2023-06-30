
public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData();
		getData2();

	}
	
	//Methods are written outside of execution block (main) above
	//static methods will be part of the class, not object. It will move the method to class level access.
	public String getData() {
		System.out.println("Hello Mundo");
		System.out.println("Git Demo Message Master SeleniumCourseworkspace");
		System.out.println("Git Demo Message Master SeleniumCourseworkspace");

		return "Christian";
	}
	
	public static String getData2() {
		System.out.println("Hello Mundo");
		return "Christian";
	}
}
