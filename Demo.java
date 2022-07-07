package Ram;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Demo {
	@Before
	public void beforeCase() {
		System.out.println("Wellcome");
	}
	@Test
	public void testCase() {
		System.out.println("This is test case");
	}
	@After
	public void afterCase() {
		System.out.println("How are you");
	}

}
