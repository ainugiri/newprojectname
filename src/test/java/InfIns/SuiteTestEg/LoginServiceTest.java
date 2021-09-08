package InfIns.SuiteTestEg;

import junit.framework.TestCase;

public class LoginServiceTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	 @Test
	 public void authenticateSuccessTest(){
	  LoginService login = new LoginService();
	  assertTrue("authenticate failed", login.authenticate("demo", "demo"));
	 }
	 
	 @Test
	 public void authenticateFailTest(){
	  LoginService login = new LoginService();
	  assertFalse("authenticate failed", login.authenticate("demo1", "demo"));
	 }
}
