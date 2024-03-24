import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Asal sayı hesaplama
       /* boolean sonuc = true;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = girdi.nextInt();

        if (sayi < 1)
        {
            System.out.println("Geçersiz sayı girdiniz: ");
        }
        else
        {
            for(int i = 2 ;i < sayi ;i++)
            {
                if(sayi % i == 0)
                {
                    sonuc = false;
                }
            }
            if(sonuc)
            {
                System.out.println("Girilen "+sayi+" sayısı asaldır.");
            }
            else
            {
                System.out.println("Girilen "+sayi+" sayısı asal değildir.");
            }
        }*/
        // Mükemmel sayı

        /*Scanner girdi = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = girdi.nextInt();
        int toplam = 0;

        for(int i = 1 ;i < sayi ; i++)
        {
            if (sayi % i == 0)
            {
                toplam += i;
            }
        }
        if (toplam == sayi)
        {
            System.out.println("Girilen "+sayi+" sayısı mükemmel sayıdır.");
        }
        else
        {
            System.out.println("Girilen "+sayi+" sayısı mükemmel sayı değildir.");
        }
*/

        //Arkadaş sayılar

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz: ");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int toplam1 = 0;
        int toplam2 = 0;

        for (int i = 1 ;i < sayi1 ; i++)
        {
            if (sayi1 % i == 0)
            {
                toplam1 += i;
            }
        }
        for (int i = 1 ;i < sayi2 ; i++)
        {
            if (sayi2 % i == 0)
            {
                toplam2 += i;
            }
        }
        if(toplam1 == sayi2 && toplam2 == sayi1)
        {
            System.out.println("Girilen "+sayi1+" ve "+sayi2+" sayıları arkadaş sayılardır.");
        }
        else
        {
            System.out.println("Girilen "+sayi1+" ve "+sayi2+" sayıları arkadaş sayı değiller.");
        }*/
        //Sayı bulma

        /*int []dizi = {10,20,30,40,50,60};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        for (int eleman:dizi)
        {
            if (sayi == eleman)
                System.out.println("Girilen sayı dizinin içindedir.");
        }*/
        //Harf değiştirme

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = scanner.nextLine();

        System.out.println("Lütfen değiştirilecek karakteri giriniz: ");
        char old = scanner.next().charAt(0);

        System.out.println("Lütfen yeni karakteri giriniz: ");
        char yeni = scanner.next().charAt(0);

        String yeniCumle = cumle.replace(old,yeni);

        System.out.println("Yeni cümle = "+yeniCumle);
        System.out.println("Eski cümle = "+cumle);
        System.out.println("Orijinal karakter = "+old);
        System.out.println("Yeni karakter = "+yeni);
*/
        //Eleman toplamı

        /*Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        System.out.println("Dizini eleman sayısını giriniz: ");
        int sayi = scanner.nextInt();

        int []dizi = new int[sayi];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < dizi.length; i++)
        {
            dizi[i] = scanner.nextInt();
        }
        for (int i = 0; i < dizi.length; i++)
        {
            toplam += dizi[i];
        }
        System.out.println("Dizi:");
        for (int i = 0; i < dizi.length; i++)
        {
            System.out.println(dizi[i]);
        }
        System.out.println();
        System.out.println("Toplam = "+toplam);*/

        //Satır sütun toplamı

        /*int [][] matris = new int[5][3];
        int []veriler = {20,40,50,12,53,56,89,78,4,5,69,87,41,255,9};
        int [] sutunToplam = new int[3];

        int index = 0;
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                matris[i][j] = veriler[index];
                sutunToplam[j] += veriler[index];
                index++;
            }
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print(matris[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < sutunToplam.length; i++)
        {
            System.out.printf("%d. sütun toplamı = %d",i+1,sutunToplam[i]);
            System.out.println();
        }
*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matrisin boyutlarını giriniz: ");
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int [][]matris = new int[N][M];
        double []satirOrtalamasi = new double[N];
        Random random = new Random();

        for (int i = 0; i < N; i++)
        {
            int satirtoplami = 0;
            for(int j = 0; j < M; j++)
            {
                matris[i][j] = random.nextInt(100)+1;
                satirtoplami += matris[i][j];
            }
            satirOrtalamasi[i] = (double) satirtoplami / M;
        }
        for(int i = 0; i < N; i++)
        {
            for(int j = 0; j < M; j++)
            {
                System.out.print(matris[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < N; i++)
        {
            System.out.printf("%d. satırın ortalaması = %.2f",i+1,satirOrtalamasi[i]);
            System.out.println();
        }

    }
}