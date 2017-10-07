package ex01C;
import org.apache.log4j.*;

public class Log4jBasics {
	protected static Logger log = Logger.getLogger(Log4jBasics.class);

	public static void main(String[] args) {
		log.debug("DEBUG: Cool !");
		log.info("INFO: Cool !");
	}
}

/*
*** In the lo4j.properties, change the level from INFO to DEBUG, what happens?

with INFO => 18:35:00,097  INFO Log4jBasics:9 - INFO: Cool !

with DEBUG => 18:37:46,780 DEBUG Log4jBasics:8 - DEBUG: Cool !
              18:37:46,788  INFO Log4jBasics:9 - INFO: Cool !
              
On active le monde DEBUG, du coup, on a également les logs de "debuggage" en plus des
logs d'informations.

*/
