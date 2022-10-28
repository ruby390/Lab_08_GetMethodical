import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double priceOfItem = 0.0;
        double totalCost = 0.0;
        boolean continueCheckout = true;
        boolean done = false;
        String trash = "";
        do
        {
            priceOfItem = SafeInput.getDouble(in, "Enter the price of your item (.50-9.99)");
            continueCheckout = SafeInput.getYNConfirm(in, "Do you have more items Y/N? ");
        }while(!done);
    }
}