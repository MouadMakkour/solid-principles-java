package org.example.dip.bad;

/*
    Here, UserService directly depends on System.out.println,
    which is a concrete way to log information.
    This violates the Dependency Inversion Principle because UserService (a high-level module)
    depends on a low-level detail (logging with System.out.println).

    Now, what if you want to change the logging to write to a file instead of the console?
    You would need to modify the UserService class, which is not flexible or scalable.
 */
public class UserService {
    public void registerUser(String userName) {
        System.out.println("Registering user: " + userName);
    }
}

