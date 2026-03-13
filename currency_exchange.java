import java.util.InputMismatchException;
import java.util.Scanner;

public class currency_exchange {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            double exchange;
            double THrate = 0.031;
            double USDrate = 31.18;

            System.out.printf("what you want to exchange\nTHB|USD| : ");
            String lang = input.nextLine();

            if (lang.equalsIgnoreCase("thb")) {

                System.out.printf("ใส่ค่าเงินบาท (THB) :");
                exchange = input.nextDouble();
                double money = exchange * THrate;
                System.out.printf("เงินของคุณ :%.3f\nexchange rate:%.3f\nคุณได้ :%.3f USD", exchange, THrate, money);
            } else if (lang.equalsIgnoreCase("usd")) {

                System.out.printf("Enter your money (USD) :");
                exchange = input.nextDouble();
                double money = exchange * USDrate;
                System.out.printf("Your money :%.3f\nexchange rate:%.3f\nYou got :%.3f THB", exchange, USDrate, money);
            }

        } catch (InputMismatchException e) {
            System.out.printf("incorrect input");
        }

    }
}