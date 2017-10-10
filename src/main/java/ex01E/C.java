package ex01E;
import org.apache.log4j.*;

class C extends B {

	protected static Logger log = Logger.getLogger(C.class);

	int x, a;

	void m() {
		/** 
		 *	Nous sommes dans la classe C, donc le message doit informer que l'on se trouve dans une instance de la classe C
		 */
		System.out.println("Je suis dans la méthode m d'une instance de C");
	}

	void test() {

		/** 
		 *
		 *	les lignes :
		 *		a = super.super.x;
		 *	et 
		 *		a = super.super.m();
 		 *
		 *	présentent une erreur car en Java, il est impossible d'accéder aux attributs et aux méthodes de la classe 'grand-mère' de cette manière.
		 *
		 *	Pour appeler la méthode m() de la classe A depuis la classe C, il faudrait que la méthode m() de la classe B fasse appel à la méthode m() 
		 *	de la classe A via super.m() et que C appelle la méthode m() de B.
		 *
		 *		
		 */ 

		a = super.x;
		log.debug("Value of a after 1st assignment : " + a);

		a = ((B)this).x;
		log.debug("Value of a after 2nd assignment : " + a);

		a = ((A)this).x;
		log.debug("Value of a after 3rd assignment : " + a);

		super.m();


		((B)this).m(); // (1)

		/**
		 *
		 *	- Ici c'est la méthode m() de la classe C qui est appelé.
		 *	
		 *	- On pourrait s'attendre à un appel de la méthode m() de la classe B puisqu'il y a un cast de l'instance de la classe C en B.
		 *
		 *	- Cela est dû au Polymorphisme , puisque la classe C redéfini la méthode m() qu'elle hérite de claase B
 		 *
		 */ 
	}
	public static void main(String [] args) {
		C c = new C();
		c.test();
	}
}