// Logger.java
public class Logger {
    // The single instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation from outside
    private Logger() {
        // Initialization code, if any
    }

    // Method to get the single instance of Logger
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
