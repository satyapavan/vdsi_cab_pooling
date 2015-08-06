import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.verizon.cab.management.domain.UserRoute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class UserRouteTest {
	UserRoute obj = new UserRoute();
	private static final Logger logger = LoggerFactory.getLogger(UserRouteTest.class);
	
	@Test
	public void locationTest() {
		logger.info("Inside locationTest");

		double[] tmp = {123};
		obj.setLocation(tmp);

		// assert statements
		assertEquals("SUCCESS", tmp, obj.getLocation());
	}
}