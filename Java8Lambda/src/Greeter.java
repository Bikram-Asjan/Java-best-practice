
public class Greeter {
	
	public void perform(){
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.perform();
		 Greeting greetingFunction = () -> System.out.print("Hello World");
    }

}
interface Greeting {
	public void greeting();
}
