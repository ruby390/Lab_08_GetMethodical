import java.util.Scanner;
public class SafeInput {
    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    /**
     * Get an int value within a specified numeric range
     *
     * @param pipe   - Scanner to read from System.in
     * @param prompt - input prompt message
     * @param low    - low end of range
     * @param high   - high end of range
     * @return - int within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("\nNumber is not in range [" + low + "-" + high + "]: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer: " + trash + "is not a valid input.");
            }
        } while (!done);

        return retVal;
    }

    /**
     * Get an int value with no specific range
     *
     * @param pipe   - Scanner to read from System.in
     * @param prompt - input any integer prompt msg
     * @return - int value
     */
    public static int getInt(Scanner pipe, String prompt) {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println(prompt + ": ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an int: " + trash);
            }
        } while (!done);
        return retVal;
    }

    /**
     * get a double value within a specific range
     *
     * @param pipe   - Scanner instance to read the data System.in
     * @param prompt - input prompt msg should not contain range info
     * @param low    - low value inclusive
     * @param high   - high value inclusive
     * @return - double value within the inclusive range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, int low, int high) {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + "[" + low + "-" + high + "]: ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("\nNumber is out of range [" + low + "-" + high + "]: " + retVal);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * Get a double value with no specific range
     *
     * @param pipe   - Scanner instance to read the data System.in in most cases
     * @param prompt - input prompt msg should not contain range info
     * @return - an unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt) {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter a double: " + trash);
            }
        } while (!done);

        return retVal;
    }

    /**
     * Get a [Y/N] confirmation from the user
     *
     * @param pipe   - Scanner instance to read the data System.in
     * @param prompt -input prompt msg for user
     * @return - true or false, yes or no
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean retVal = true;
        String response = "";
        boolean gotAVal = false;

        do {
            System.out.print("\n" + prompt + " [Y/N] ");
            response = pipe.nextLine();
            if (response.equalsIgnoreCase("Y")) {
                gotAVal = true;
                retVal = true;
            } else if (response.equalsIgnoreCase("N")) {
                gotAVal = true;
                retVal = false;
            } else {
                System.out.println("Answer with [Y/N]! " + response);
            }

        } while (!gotAVal);

        return retVal;
    }

    /**
     * Get a string that matches a RegEx pattern
     *
     * @param pipe         - Scanner instance to read the data System.in
     * @param prompt       - prompt for user
     * @param regExPattern - java style RegEx pattern for the input
     * @return a String that matches the RegEx pattern
     */

    public static String getRegExString(Scanner pipe, String prompt, String regExPattern) {
        String response = "";
        boolean gotAVal = false;

        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regExPattern)) {
                gotAVal = true;
            } else {
                System.out.println("\n" + response + " must match the pattern " + regExPattern);
                System.out.println("Try again!");
            }

        } while (!gotAVal);

        return response;
    }
}

