package org.example.dip.good;

/*
    Now, the UserService class no longer depends on a specific logging mechanism.
    It depends on the Logger abstraction, which can be any logger.
 */
public class UserService {
    private Logger logger;

    // Inject the Logger dependency via constructor
    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void registerUser(String userName) {
        // Use the logger abstraction
        logger.log("Registering user: " + userName);
    }
}

