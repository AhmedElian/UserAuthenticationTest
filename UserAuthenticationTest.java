package AssignmentsTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserAuthenticationTest {
	UserAuthentication auths = new UserAuthentication();

	@Test(dataProvider = "loginData")
	public void TestAuthentication(String username, String password, boolean expectedResult) {
		Reporter.log("Starting Test With Username: " + username + ", Password: " + password, true);
		System.out.println("Testing login for username: " + username + " password: " + password);

		boolean actualResult = auths.authenticate(username, password);
		Reporter.log("Expected Result: " + expectedResult + ", Actual Result: " + actualResult, true);

		Assert.assertEquals(actualResult, expectedResult,
				"Login failed for username: " + username + " password: " + password);

		Reporter.log("Test Passed For Username: " + username + ", Password: " + password, true);
		System.out.println("----------------------------------------------------------------------");
	}

	@DataProvider(name = "loginData")
	public Object[][] provideLoginData() {
		return new Object[][] { { "admin", "password123", true }, { "admin", "paSsword123", false },
				{ "Admin", "password123", false }, { " ", "password123", false }, { "", "password123", false },
				{ "admin", "", false }, { "admin", " ", false }, { "admin", "321drowssap", false },
				{ "password123", "admin", false }, { "admin", "password1234", false },
				{ "admin1", "password123", false }, { null, "password123", false }, { "admin", null, false },
				{ null, null, false }, { "' OR '1'='1", "password123", false }, { "admin", "' OR '1'='1", false },
				{ "admin", "'1'='1", false }, { "'", "password123", false },
				{ "admin; DROP TABLE username; --", "password123", false },
				{ "<script>alert('XSS')</script>", "password123", false }, { "admin\0", "password123", false } };
	}
}
