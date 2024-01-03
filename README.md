# Password Reset System 
This Java program is an assignment for [patika.dev](https://patika.dev) and serves as a simple password reset system. The program prompts the user to enter their username and password. If the entered credentials match the predefined values (**patika** for the username and **java123** for the password), the user is informed that they have successfully logged in. If the credentials do not match, the system presents an option to reset the password.

Upon an unsuccessful login attempt, the user is given two options:

**Reset Password:** By pressing 1, the user is prompted to enter a new password. However, the system ensures that the new password is not the same as the old password or the default password **java123**. If the user attempts to set the password as either of these, a message "Password creation failed, please enter a different password." is displayed. 
**Cancel Operation:** By pressing 2, the user cancels the password reset operation and is informed with a message "Operation canceled."