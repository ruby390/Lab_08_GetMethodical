import java.util.Scanner;
public class GetUserName {
        public static void main(String[]args)
        {
            Scanner in = new Scanner(System.in);
            String firstName = "";
            String lastName = "";
            firstName = SafeInput.getNonZeroLenString(in, "enter your first name");
            lastName = SafeInput.getNonZeroLenString(in, "enter your last name");
            System.out.println("\nyour full name is: " + firstName + " " + lastName);
        }
}
