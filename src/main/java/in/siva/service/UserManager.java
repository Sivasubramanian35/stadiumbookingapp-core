package in.siva.service;

import java.util.HashSet;

import in.siva.model.User;
import in.siva.validator.PasswordValidator;
import in.siva.validator.StringValidator;

public class UserManager {

	static HashSet<User> userList = new HashSet<User>();
	static {
		User user = new User();
		user.userName = "sankar";
		user.password = "sankar123";
		userList.add(user);
	}

	/**
	 * This method is used to register the data.
	 * 
	 * @param name
	 * @param password
	 */

	public static boolean registration(String userName, String password) {
		boolean register = false;
		if (StringValidator.isValidString(userName) && PasswordValidator.isValidPassword(password)) {
			User user = new User();
			user.userName = userName;
			user.password = password;
			userList.add(user);
			register = true;
			System.out.println("Register successfull");
		} else {
			System.out.println("Enter the valid credentials");
			register = false;
		}
		return register;
	}

	/**
	 * This method is used to validate the login credentials.
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public static boolean login(String name, String password) {
		boolean loggedIn = false;
		for (User user : userList) {
			if (user.userName.equalsIgnoreCase(name) && user.password.equalsIgnoreCase(password)) {
				System.out.println("Login successfull");
				loggedIn = true;
				break;
			}
		}
		if (loggedIn) {
			System.out.println("Invalid Login credentials");
		}
		return loggedIn;

	}

}
