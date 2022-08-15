import java.util.Scanner;

public class girilenSayinin4ve5Kuvvetleri {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır Değerini Giriniz:");
        number = input.nextInt();

        for (int i = 1; i <= number; i *= 4) {
            System.out.println(i);
        }
            System.out.println("-----------");
        for (int i = 1; i <= number; i *= 5){
            System.out.println(i);
    }
        }
    }