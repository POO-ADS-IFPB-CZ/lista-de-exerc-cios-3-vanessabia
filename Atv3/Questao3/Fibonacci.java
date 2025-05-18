package Atv3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author vanessa
 */


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência de Fibonacci: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Informe um valor maior que zero.");
            return;
        }

        int[] fibonacci = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                fibonacci[i] = 0;
            } else if (i == 1) {
                fibonacci[i] = 1;
            } else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }

        System.out.println("Sequência de Fibonacci com " + n + " termos:");
        System.out.println(Arrays.toString(fibonacci));
    }
}
