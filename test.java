import java.util.Scanner;

public class test {
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sayi gireceksiniz ?: ");
        int n = input.nextInt();

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int k = 0;
        while (k < n) {
            k++;
            System.out.print(k + ". sayiyi giriniz : ");
            int i = input.nextInt();

        if (i > largest) {
            largest = i;
        }
        if (i < smallest) {
            smallest = i;
        }
}
        System.out.println("En buyuk sayi : " + largest + " En kucuk sayi : " + smallest);
}








