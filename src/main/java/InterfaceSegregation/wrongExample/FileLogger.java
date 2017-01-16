package InterfaceSegregation.wrongExample;

/**
 * Created by luis on 7/01/17.
 */
public class FileLogger implements ILogger {

    //FileLogger implements methods that don't use so it is broken ISP y SRP

    public String logConnectionSuccessful() {

        return "I'm not a database so why I'm implementing this? FIX it!";
    }

    public String logConnectionError() {

        return "I'm not a database so why I'm implementing this? FIX it!";
    }

    public String logState() {

        return "My state as file is : XXXX_0000";
    }

    public String logSizeFile() {

        return "My file name is: YYYY_MM_DD_FILE";
    }
}
