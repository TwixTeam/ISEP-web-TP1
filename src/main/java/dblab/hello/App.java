package dblab.hello;
import org.apache.log4j.*;

/** * Hello world! * */
public class App {

	protected static Logger log = Logger.getLogger(App.class);

	public static void main(String[] args) {
		System.out.println("Hello World!");

		log.debug("Number of parameter : " + args.length);

		if (args.length > 0) {
			int i = 0;
			for (String argument : args) {
				System.out.format("argument [%d]: %s %n", i++, argument);
			}
		}
	}
}

/** 
 * sortie console:
 *
 * Hello World!
 * argument [0]: foo
 * argument [1]: bar
 */
