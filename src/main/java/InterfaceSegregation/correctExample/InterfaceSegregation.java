package InterfaceSegregation.correctExample;


/**
 * Created by luis on 7/01/17.
 */
public class InterfaceSegregation {

    public static void main(String args[]){

        DatabaseLogger myDbLogger=new DatabaseLogger();
        FileLogger myFileLogger=new FileLogger();

        //myDbLogger only have access and implement only the methods that it needs
        System.out.println(myDbLogger.logConnectionSuccessful());
        System.out.println(myDbLogger.logConnectionError());
        System.out.println(myDbLogger.logState());

        //myFileLogger only have access and implement only the methods that it needs
        System.out.println(myFileLogger.logSizeFile());
        System.out.println(myFileLogger.logState());


    }
}
