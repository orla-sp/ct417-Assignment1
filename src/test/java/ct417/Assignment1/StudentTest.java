package ct417.Assignment1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

	@Test
	public void usernameTest() {
		Student test = new Student();
		test.setName("orla");
		test.setAge(21);
		String uName = test.getUsername();
		assertTrue(uName.equals("orla21"));
	}
}
