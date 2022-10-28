import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;
        switch (birthYear) {
            case 1: birthYear = 1950-2010;
        }
        switch (birthMonth) {
            case 1: birthMonth = 1-12;
        }
        switch (birthDay) {
            case 1: birthDay = 1-28;
            case 2: birthDay = 1-30;
            case 3: birthDay = 1-31;
                break;
        }
        switch (birthHour) {
            case 1: birthHour = 1-12;
        }
        switch (birthMinute) {
            case 1: birthMinute = 1-60;
        }
        birthYear = SafeInput.getInt(in, "Enter your birth year");
        birthMonth = SafeInput.getInt(in, "Enter your birth month");
        birthDay = SafeInput.getInt(in, "Enter your birth day");
        birthHour = SafeInput.getInt(in, "Enter your birth hour");
        birthMinute = SafeInput.getInt(in, "Enter your birth minute");
        System.out.println("Your birthday is " + birthMonth + " , " + birthDay + " , " + birthYear + " at " + birthHour + ":" + birthMinute);
    }
}
