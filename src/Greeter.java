class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting greeting = () -> System.out.println("does this even work????");
		
		greeter.greet(greeting);
		greeter.greet(() -> System.out.println("hello, from lambda expression!"));
	}
}
