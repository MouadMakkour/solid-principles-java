package org.example.dip.good;

/*
    Create a Logger interface that defines the contract for logging.
    This interface is the abstraction that both the UserService and
    logging implementations will depend on.
 */
public interface Logger {
    void log(String message);
}
