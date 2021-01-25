package alpha;
import org.apache.logging.log4j.*;



public class Demo {
	
	
	private static Logger log = LogManager.getLogger(Demo.class.getName()); //creating log object

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		log.debug("Iam Debugging");
		
		if (5>4)
		{
			log.info("Object is present");
			
			log.error("Object is not Present");
			
			log.fatal("this fatal ");
			
		}
		
		
	

}
}
