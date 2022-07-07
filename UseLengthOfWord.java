package Ram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UseLengthOfWord {
	String[] a= {"ram","arun","robin"};
		LengthOfWord l=new LengthOfWord();
		String c=l.findLengthOfWord(a);
//		@Test
//		public void find() {
//			
//		}
		@Test
		public void find1() {
			assertEquals(c,a[2].toUpperCase());
		}
		@Test
		public void find2() {
			assertNotNull(l);
		}
}


