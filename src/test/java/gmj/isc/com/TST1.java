package gmj.isc.com;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TST1 {
   @Test
	
   public void testAdd() {
		  System.out.println("TST1 start");
	      String str = "Junit is working fine";      
	      assertEquals("Junit is working fine",str);
	      System.out.println("TST1 complete");
   }
}