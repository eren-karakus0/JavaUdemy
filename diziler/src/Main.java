import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("--------------------");
        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
        System.out.println("--------------------");

        Scanner girdi = new Scanner(System.in);
        System.out.println("Dizinin boyutunu girin: ");
        int n = girdi.nextInt();

        double[] myList = new double[n];
        System.out.println("Lütfen " + n + " tane değer girin: ");

        for (int i = 0; i < n; i++) {
            myList[i]= girdi.nextDouble();
        }
        double total = 0;
        double max = myList[0];
        double min = myList[0];

        for (int i = 0; i < n; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
            if (myList[i] < min) {
                min = myList[i];
            }
            total += myList[i];
            System.out.println(myList[i]);
        }
        System.out.println("Toplam : " + total);
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);

        System.out.println("--------------------");

        Scanner deger = new Scanner(System.in);

        String[][] sehirler = new String[3][3];

        System.out.println("Text lerinizi giriniz: ");
        for(int i = 0; i < 3;i ++)
        {
            for(int j = 0; j < 3; j++)
            {
                sehirler[i][j] = deger.next();
            }
            System.out.println();
        }
        System.out.println("Textler");
        for(int i = 0;i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.printf(" " +sehirler[i][j]);
            }
            System.out.println();
        }

    }
}