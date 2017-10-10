package ex01F;

import org.apache.log4j.Logger;

public class Circle {
	protected static Logger log = Logger.getLogger(Circle.class);
	int x;
	int y;
	int radius;

	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public String toString() {
		return (String.format("Circle with center (%d,%d) and radius %d (Perimter is %,.2f)", this.x, this.y,
				this.radius, (2 * java.lang.Math.PI * this.radius)));
	}
}

/**
 * What shows up? Why is the method toString() called without being named?
 * C1 => Circle with center (0,0) and radius 5 (Perimter is 31.42)
 *
 * En faisant System.out.printIn(class), on fait appel à PrintStream.println.
 *   En effet, System est une classe, avec un field out de type PrintStream.
 *   On fait donc appel à la méthode printin(Objet) de l'objet PrintSteal,
 *   qui est implémenté comme ceci : public void println(Object x) {
 *                                      String s = String.valueOf(x);
 *                                      synchronized (this) {
 *                                         print(s);
 *                                         newLine();
 *                                      }
 *                                   }
 *  Ainsi on appele toString() via String.valueOf
 ***********************************************************************
 *
 * If you rename the method toString(), what happens? 
 * C1 => ex01F.Circle@6b537e5a
 * 
 * Si toString() n'est pas implementé dans une classe, par défaut Object.toString()
 *   va être automatiquement appelé.
 *   Et Object.toString() va par défaut afficher le nom de la classe suivi par le 
 *   hash code de l'objet.
 */
