package ex01D;
import org.apache.log4j.*;

public class C {

	protected static Logger log = Logger.getLogger(C.class);

	static void method1(int i, StringBuilder s) {
		i++;
		s.append("d"); 
	}

	public static void main(String [] args) {
		int i = 0;
		/**
		 * Replaced the synchronized class "StringBuffer" by an unsynchronized "StringBuilder".
		 * StringBuffer, is synchronized to make it thread-safe.
		 * Unfortunately, synchronization has a big negative impact on performance, even when using it from a single thread.
		 */
		StringBuilder s = new StringBuilder("abc");

		log.debug("Builded string : " + s);

		log.debug("Value of 'i' before method1 call : " + i);
		log.debug("Value of 's' before method1 call : " + s);
		/*
		 *	Il y avait un "e" en trop dans le nom de cette méthode (methode1(...))
		 */

		method1(i, s);

		log.debug("Value of 'i' after method1 call : " + i);
		log.debug("Value of 's' after method1 call : " + s);

		/*
		 *	il manquait une double quote avant le 'i' dans le syso
		 */
		System.out.println("i=" + i + ", s=" + s); // i=0, s=abcd
		/*
		 * le i ne s'incrémente pas car la variable est interne à la méthode.
		 * quand on entre dans la méthode, une variable temporaire est crée, et qui
		 * est détruite dès qu'on quitte la méthode.
		 */
	}
}