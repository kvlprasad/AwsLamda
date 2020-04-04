
import com.amazonaws.services.lambda.runtime.*;

public class HelloLamda implements RequestHandler<String, String> {

    public String handleRequest(String input, Context context) {
        String output = "Hello, " + input + "!!!!";
        return output;
    }

    public static void main(String[] args){
        System.out.println("Test123");
    }
}
