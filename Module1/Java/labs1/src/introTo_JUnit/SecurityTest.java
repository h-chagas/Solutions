package introTo_JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SecurityTest {

		
	@Test
	public void testLogonEmptyUserId() {
		String userId = "";
		String password = "Freddy99";
		Security s = new Security();
		boolean actual = s.logon(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert }
	}
	
	@Test
	public void testLogonNullUserId() {
		String userId = null;
		String password = "Freddy99";
		Security s = new Security();
		boolean actual = s.logon(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert }
	}
	
	@Test
	public void testPasswordNotLongEnoughUserId() {
		String password = "Freddy9";
		Security s = new Security();
		boolean actual = s.validatePassword(password);
		boolean expected = false;
		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert }
	}
	
	@Test
	public void testPasswordEmpty() {
		String password = "";
		Security s = new Security();
		boolean actual = s.validatePassword(password);
		boolean expected = false;
		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert }
	}
	
	@Test
	public void testPasswordWithoutCapital() {
		String password = "trtrtry5";
		Security s = new Security();
		boolean actual = s.validatePassword(password);
		boolean expected = false;
		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert }
	}
	

}
