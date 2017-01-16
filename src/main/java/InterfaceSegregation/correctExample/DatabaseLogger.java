package InterfaceSegregation.correctExample;

/**
 * Created by luis on 7/01/17.
 */
public class DatabaseLogger implements ILogger {

    public String logState() {
        return "My state as database is : XXXX_0000";
    }

    public String logConnectionSuccessful() {
        return "The connection has been successful";
    }

    public String logConnectionError() {
        return "There was an error - Cannot connect";
    }




}
