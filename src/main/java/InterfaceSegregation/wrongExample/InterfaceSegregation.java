package InterfaceSegregation.wrongExample;

/**
 * Created by luis on 7/01/17.
 */
public class InterfaceSegregation {

    public static void main(String args[]){

        DatabaseLogger myDbLogger=new DatabaseLogger();
        FileLogger myFileLogger=new FileLogger();

        /* The method logSizeFile is not useful on a database but it was
        necessary to include to avoid an error, this is a BAD practice*/
        System.out.println(myDbLogger.logSizeFile());

        /*The same problem appears for a FileLogger, we shouldn't implement
         a method for display a message when a database can connect*/
        System.out.println(myFileLogger.logConnectionSuccessful());


    }
}
