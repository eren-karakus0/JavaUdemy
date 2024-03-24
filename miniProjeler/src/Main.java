import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int num = girdi.nextInt();
        boolean asal = true;

        for(int i = 2; i < num; i++)
        {
            if (num % i == 0){
                asal = false;
            }
        }
        if(asal)
        {
            System.out.println("Girilen sayı asal sayıdır. ");
        }
        else{
            System.out.println("Girilen sayı asal sayı değildir");
        }

 */
/*
        char harf = 'I';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf: ");
                break;
            default:
                System.out.println("İnce sesli harf:");
        }
 */
/*
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int num = girdi.nextInt();
        boolean muksayi = true;
        int toplam = 0;
        for(int i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                toplam += i;
            }
        }
        if(toplam != num)
        {
            muksayi = false;
        }
        if(muksayi)
        {
            System.out.println("Girilen sayı mükemmel sayıdır: ");
        }
        else
        {
            System.out.println("Sayı mükemmel sayı değidir: ");
        }
 */

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
}