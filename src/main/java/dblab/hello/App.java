package dblab.hello;

/** * Hello world! * */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		if (args.length > 0) {
			int i = 0;
			for (String argument : args) {
				System.out.format("argument [%d]: %s %n", i++, argument);
			}
		}
	}
}

/*
Hello World!
argument [0]: foo
argument [1]: bar
*/
