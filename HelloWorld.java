public class HelloWorld {
	public static void main(String[] args) {		
		System.out.println("Hello, World!");
		System.out.println("Your first argument is: skipped");  
		String name = "John";
		int age = 42;
		float gpa = 3.7f;
		char initial = 'J';
		boolean zooming = true;
		System.out.println("Hello, " + name + "! Your age is: " + age + ", your GPA is: " + gpa + ", and your first initial is: " + initial);
		if (zooming) {
			System.out.println("You are zooming today!");
		} else {
			System.out.println("You are not zooming today :(");
		}

	}
}