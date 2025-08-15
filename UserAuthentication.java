package AssignmentsTestNG;

public class UserAuthentication {

	public boolean authenticate(String username, String password) {
		// Dummy authentication logic
		if ("admin".equals(username) && "password123".equals(password)) {
			return true;
		} else {
			return false;
		}
	}
}