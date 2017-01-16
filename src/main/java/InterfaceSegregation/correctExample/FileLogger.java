package InterfaceSegregation.correctExample;

/**
 * Created by luis on 7/01/17.
 */
public class FileLogger implements ILogger {

    public String logState() {
        return  "My state as file is : XXXX_0000";
    }

    public String logSizeFile() {
        return "My file name is: YYYY_MM_DD_FILE";
    }
}
