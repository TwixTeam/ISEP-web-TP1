package ex01F;
import org.apache.log4j.*;

public class ToStringOverloading {

	protected static Logger log = Logger.getLogger(ToStringOverloading.class);

	public static void main(String[] args) {
		
		Circle c1 = new Circle(0, 0, 5);
		log.debug(
			"Circle c1 values : \n"
			+ "x : " + c1.x + "\n"
			+ "y : " + c1.y + "\n"
			+ "radius : " + c1.radius
		);

		Circle c2 = new Circle(0, 0, 3);
		log.debug(
			"Circle c1 values : \n"
			+ "x : " + c2.x + "\n"
			+ "y : " + c2.y + "\n"
			+ "radius : " + c2.radius
		);

		System.out.println("C1 => " + c1);
	}
}