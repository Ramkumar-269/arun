package Ram;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertClass {
		@Test
		public void assertEqual() {
			assertEquals("ram","ram");
		}
		@Test
		public void assertnoEqu() {
			assertNotEquals("ram","arun");
		}
		@Test
		public void asseSame() {
			assertSame("arun","arun");
		}
		@Test
		public void assenoSame() {
			assertNotSame("ram","arun");
		}
		@Test
		public void asseNul() {
			assertNull(null);
		}
		@Test
		public void assenoNul() {
			assertNotNull("word");
		}
		@Test
		public void asseTrue() {
			assertTrue("ram".equals("ram"));
		}
		@Test
		public void assefal() {
			assertFalse("ram".equals("arun"));
		}
		@Test
		public void assArrEqual() {
			String[] a= {"ram","arun","parthi"};
			String[] b= {"ram","arun","parthi"};
			assertArrayEquals(a,b);
			
		
			
	}

}
