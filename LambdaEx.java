package xyz;

public class LambdaEx {
	public static void main(String[] as) {
		message hellomsg = () -> System.out.println("This is Lambda Example");
		hellomsg.say();
	}
	interface message{
		void say();
	}

}
