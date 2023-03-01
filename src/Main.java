import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int binary_num, ondalik_num = 0, base = 1, rem;

        Scanner input = new Scanner(System.in);
        System.out.print("İkilik tabanda bir sayı giriniz. ");
        binary_num = input.nextInt();


        //while döngüsü kullanarak, binary sayının her bir basamağını ondalık sayı sistemine dönüştürüyoruz.
        while (binary_num > 0) {
            rem = binary_num % 10;
            ondalik_num += rem * base;
            binary_num /= 10;
            base *= 2;
        }

        System.out.println("Ondaklık olarak eşiti: " + ondalik_num);
    }
}