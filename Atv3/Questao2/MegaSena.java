package Atv3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author vanessa
 */
public class MegaSena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[6];
        int count = 0;

        while (count < 6) {
            System.out.print("Digite um número entre 1 e 60: ");
            int num = sc.nextInt();

            if (num < 1 || num > 60) {
                System.out.println("Número fora do intervalo.");
            } else if (jaExiste(numeros, count, num)) {
                System.out.println("Número duplicado.");
            } else {
                numeros[count++] = num;
            }
        }

        Arrays.sort(numeros);
        System.out.println("Seus números da sorte: " + Arrays.toString(numeros));
    }

    public static boolean jaExiste(int[] array, int tamanho, int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i] == valor) {
                return true;
            }
        }
        return false;
    }
}
