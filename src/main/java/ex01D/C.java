package ex01D;

public class C {
	static void method1(int i, StringBuilder s) {
		i++;
		s.append("d"); 
	}

public static void main(String [] args) {
	int i = 0;
	/**
	 * Replace the synchronized class "StringBuffer" by an unsynchronized one such as "StringBuilder".
	 * StringBuffer, is synchronized to make it thread-safe.
	 * Unfortunately, synchronization has a big negative impact on performance, even when using these collections from a single thread.
	 */
	StringBuilder s = new StringBuilder("abc");

		/** 
		 *	Il y avait un "e" en trop dans le nom de cette méthode (methode1(...))
		 */

		method1(i, s);

		/** 
		 *	il manquait une double quote avant le 'i' dans le syso
		 */
		System.out.println("i=" + i + ", s=" + s); // i=0, s=abcd
	}
}