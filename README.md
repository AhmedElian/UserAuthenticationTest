🔐 User Authentication Test – Java + TestNG
----------------

📌 Overview

This project is a Java TestNG-based automated testing suite for a UserAuthentication class.
It verifies functional correctness and security resilience by running multiple scenarios, including valid logins, invalid credentials, edge cases, and security injection attempts.

----------------

✨ Features

- ✅ Valid Login verification

- 🚫 Invalid Credentials handling

- ⚠️ Edge Case Testing (null, empty strings, whitespace)

- 🔒 Security Checks:

- SQL Injection payloads

- XSS (Cross-Site Scripting) attempts

- Null byte injection

----------------

📂 Project Structure

📁 src

 ├── 📄 UserAuthentication.java        # Authentication logic
 
 └── 📄 UserAuthenticationTest.java    # TestNG test cases
 
📄 README.md                           # Project documentation

----------------

🛠️ Technologies Used

- Java 8+

- TestNG Framework

- IDE (IntelliJ IDEA / Eclipse / VS Code)

----------------

📦 Installation & Running Tests

1- Clone the repository

  - git clone https://github.com/AhmedElian/UserAuthenticationTest.git
   
2- Open the project in your IDE (IntelliJ / Eclipse / VS Code)

3- Run the TestNG suite

  - Option 1: Run UserAuthenticationTest.java directly from your IDE

  - Option 2: If using Maven:

----------------

📊 Test Data Coverage

Username | Password	| Expected Result

admin |	password123	| ✅ true

admin	| paSsword12 |	❌ false

' OR '1'='1	| password123	| ❌ false

admin; DROP TABLE users; -- | password123 |	❌ false

<script>alert('XSS')</script>	| password123	| ❌ false

admin\0	| password123	| ❌ false

----------------

⚠️ Disclaimer

This project is for educational purposes only and is not intended for production use.

The payloads used in testing are for security awareness and should never be applied to real systems.

----------------

⭐ If you like this project, consider giving it a star on GitHub!
----------------
