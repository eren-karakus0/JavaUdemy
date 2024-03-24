import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);
/*
        System.out.println("Eleman sayısı : "+mesaj.length());
        System.out.println("5. eleman : "+mesaj.charAt(4));
        System.out.println(mesaj.concat(" o yüzden dışarı çıkma!"));
        System.out.println(mesaj.startsWith("B")); //hangi harfle başladığını true false olarak gösterir
        System.out.println(mesaj.endsWith("."));
        char [] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a")); // ilk a kaçıncı indexte
        System.out.println(mesaj.lastIndexOf("a")); // sondan başlar
 */
        String yenimesaj =mesaj.replace(' ','-');
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(2,4)); // girilen indexten itibaren
        for(String kelime : mesaj.split(" "))
        {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase()); // küçük harf
        System.out.println(mesaj.toUpperCase(Locale.ROOT)); // büyük harf
        System.out.println(mesaj.trim()); // başındaki ve sonundaki boşlukları atar




    }
}