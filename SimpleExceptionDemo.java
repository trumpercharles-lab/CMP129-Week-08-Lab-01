import java.io.UncheckedIOException;
import java.util.*;

public class SimpleExceptionDemo {

    public static double safeDivide(int numerator, int denominator){
        double result;

        try{
            result=numerator/denominator;
        }

        catch(NullPointerException io){
            System.out.print("There has been an error: "+io.getMessage()+"\n");
            result=0;
        }

        catch(ArithmeticException io){
            System.out.print("There has been an error: "+io.getMessage()+"\n");
            result=0;
        }

        catch(NumberFormatException io){
            System.out.print("There has been an error: "+io.getMessage()+"\n");
            result=0;
        }

        return result;
    }

}
