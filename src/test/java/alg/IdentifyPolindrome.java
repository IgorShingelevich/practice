package alg;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IdentifyPolindrome {

    public static void main(String[] args) {
        try {
            BufferedReader object = new BufferedReader(new InputStreamReader(
                    System.in));
            System.out.println("Введите число");
            int inputValue = Integer.parseInt(object.readLine());
            int n = inputValue;
            int rev = 0;
            System.out.println("Введенное число - это : ");
            System.out.println(" " + inputValue);
            for (int i = 0; i <= inputValue; i++) {
                int r = inputValue % 10;
                inputValue = inputValue / 10;
                rev = rev * 10 + r;
                i = 0;
            }
            System.out.println("После перевертывания : " + " ");
            System.out.println(" " + rev);
            if (n == rev) {
                System.out.print("Введенное число является палиндромом.");
            } else {
                System.out.println("Введенное число не является палиндромом.");
            }
        } catch (Exception e) {
            System.out.println("Недопустимое число.");
        }
    }
}
