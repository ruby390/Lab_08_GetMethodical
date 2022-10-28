import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String socialSecNumber;
        String mNumber;
        String menuChoice;
        //- get a SSN from the user using this pattern: \\d{3}-\\d{2}-\\d{4}
        socialSecNumber = SafeInput.getRegExString(in, "Enter your social security number:", "\\d{3}-\\d{2}-\\d{4]");
        System.out.println("Your social security number is" + socialSecNumber);
        // - get a UC Student M number using this pattern (M|m)\\d{5}
        mNumber = SafeInput.getRegExString(in, "Enter your M Number" , "(M|m)\\d{5}");
        System.out.println("Your M number is " + mNumber);
    }
}
