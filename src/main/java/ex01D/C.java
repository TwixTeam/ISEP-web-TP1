package ex01D;

public class C {
	static void method1(int i, StringBuffer s) {
		i++;
		s.append("d"); 
	}

	public static void main(String [] args) {
		int i = 0;
		StringBuffer s = new StringBuffer("abc");

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