package InterfaceSegregation.wrongExample;

/**
 * Created by luis on 7/01/17.
 */
public class DatabaseLogger implements ILogger {

    //DatabaseLogger implements methods that don't use so it is broken ISP y SRP

    public String logConnectionSuccessful() {

        return "The connection has been successful";
    }

    public String logConnectionError() {

        return "There was an error - Cannot connect";
    }

    public String logState() {

        return "My state as database is : XXXX_0000";
    }

    public String logSizeFile() {

        return "Im not a file! So I should't " +
                "implement this method! FIX IT!" ; //<--- Here is what we shouldn't implement
    }
}
