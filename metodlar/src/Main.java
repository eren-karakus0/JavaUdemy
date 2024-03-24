import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        sayiBulmaca();
        mesajVer();
    }
    public static void sayiBulmaca(){
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz: ");
        int num1 = girdi.nextInt(); int num2 = girdi.nextInt();
        int toplam1 = 0;
        int toplam2 = 0;

        for(int i = 1; i < num1; i++)
        {
            if(num1 % i == 0)
            {
                toplam1 += i;
            }
        }
        for(int i = 1; i < num2; i++)
        {
            if(num2 % i == 0)
            {
                toplam2 += i;
            }
        }
        if(num1 == toplam2 && num2 == toplam1)
        {
            System.out.println("Girilen sayılar arkadaştır: ");
        }
        else
        {
            System.out.println("Girilen sayılar arkadaş değldir: ");
        }


    }
    public static void mesajVer(){
        System.out.println("Sayı mevcuttur: ");
    }
}