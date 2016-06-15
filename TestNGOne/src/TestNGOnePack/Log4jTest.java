package TestNGOnePack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jTest {

	static Logger  log = Logger.getLogger(Log4jTest.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicConfigurator.configure();
		log.info("Type text into my first name textboxahii");
	}

}
