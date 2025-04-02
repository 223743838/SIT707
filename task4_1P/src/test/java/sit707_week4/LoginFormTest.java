package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * @author Ahsan Habib
 */
public class LoginFormTest 
{

	@Test
	public void testStudentIdentity() {
		String studentId = "223743838";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Sushma Singh";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
    public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode()
    {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue( status.isLoginSuccess() == false );
    }
	
	/*
	 * Write more test functions below.
	 */
	
	@Test
	public void test1_EmptyUsernameEmptyPassword() {
	    LoginStatus status = LoginForm.login(null, null);
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void test2_EmptyUsernameCorrectPassword() {
	    LoginStatus status = LoginForm.login(null, "sushma_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void test3_EmptyUsernameWrongPassword() {
	    LoginStatus status = LoginForm.login(null, "wrong");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Username", status.getErrorMsg());
	}

	@Test
	public void test4_WrongUsernameEmptyPassword() {
	    LoginStatus status = LoginForm.login("wrong", null);
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Empty Password", status.getErrorMsg());
	}

	@Test
	public void test5_WrongUsernameCorrectPassword() {
	    LoginStatus status = LoginForm.login("wrong", "sushma_pass");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void test6_WrongUsernameWrongPassword() {
	    LoginStatus status = LoginForm.login("wrong", "wrong");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void test7_CorrectUsernameWrongPassword() {
	    LoginStatus status = LoginForm.login("sushma", "wrong");
	    Assert.assertFalse(status.isLoginSuccess());
	    Assert.assertEquals("Credential mismatch", status.getErrorMsg());
	}

	@Test
	public void test8_CorrectUsernameCorrectPasswordEmptyCode() {
	    LoginStatus status = LoginForm.login("sushma", "sushma_pass");
	    Assert.assertTrue(status.isLoginSuccess());
	    Assert.assertFalse(LoginForm.validateCode(null));
	}

	@Test
	public void test9_CorrectUsernameCorrectPasswordWrongCode() {
	    LoginStatus status = LoginForm.login("sushma", "sushma_pass");
	    Assert.assertTrue(status.isLoginSuccess());
	    Assert.assertFalse(LoginForm.validateCode("wrong"));
	}

	@Test
	public void test10_CorrectUsernameCorrectPasswordCorrectCode() {
	    LoginStatus status = LoginForm.login("sushma", "sushma_pass");
	    Assert.assertTrue(status.isLoginSuccess());
	    Assert.assertTrue(LoginForm.validateCode("123456"));
	}
}
