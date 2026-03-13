import java.util.InputMismatchException;
import java.util.Scanner;

import com.npru.SE.Hello;

public class NumInput {
    public static void main(String[] args) {
        int GetNum;
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter number : ");

            GetNum = input.nextInt();
            input.close();

            Hello greet = new Hello();
            greet.Thai();
            greet.Lao();
            String JapanGreet = greet.Japan();

            System.out.printf("%s\nInput is :%d", JapanGreet, GetNum);

        } catch (InputMismatchException e) {
            System.out.println("Input must be number. ");
        }

    }
}
