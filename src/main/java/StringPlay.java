import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class StringPlay {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
    String input = scanner.nextLine();
        System.out.println("You Entered: \"" + input + "\"");
        if (StringUtils.isNumeric(input)) {
            System.out.println("\""+input+"\" is a number");
        } else {
            System.out.println("\""+input+"\" is not a number");
        }

    }
}
