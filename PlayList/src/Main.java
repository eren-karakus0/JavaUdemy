import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kullanici kullanici = new Kullanici("Eren ","Karakuş");
        Sarki sarki1 = new Sarki("Reckless","Madison Beer","Hell",200);
        Sarki sarki2 = new Sarki("Too much love will kill you","Quenn","Live Aid",250);
        Sarki sarki3 = new Sarki("Dont stop me now","Quenn","Live Aid",240);

        kullanici.sarkiEkle(sarki1);
        kullanici.sarkiEkle(sarki2);
        kullanici.sarkiEkle(sarki3);

        System.out.println("Kullanıcı Bilgileri : ");
        System.out.println("Kullanıcı ismi : "+kullanici.ad+"\nKullanıcı soyadı : "+kullanici.soyad);

        System.out.println("------------------------------------------------------");
        System.out.println("Kullanıcının Şarkıları: ");
        for (Sarki sarki : kullanici.sarkiListele()){
            System.out.println("Ad : "+sarki.getAd()+"\nSanatçı : "+sarki.getSanatci()+"\nAlbüm : "+sarki.getAlbum()+"\nSüre : "+sarki.getSure()+" Saniye");
            System.out.println("-------------");
        }
        System.out.println("Kullaıncının toplam şarkı süresi : "+kullanici.toplamSure()+" Saniye");

        System.out.println("------------------------------------------------------");

        System.out.println("Listeden silinecek şarkı : ");
        System.out.println(sarki1.getAd());
        kullanici.sarkiKaldir(sarki1);

        System.out.println("------------------------------------------------------");
        System.out.println("Kullanıcının Şarkıları : ");
        for (Sarki sarki : kullanici.sarkiListele()){
            System.out.println("Ad : "+sarki.getAd()+"\nSanatçı : "+sarki.getSanatci()+"\nAlbüm : "+sarki.getAlbum()+"\nSüre : "+sarki.getSure()+" Saniye");
            System.out.println("-------------");
        }
        System.out.println("------------------------------------------------------");
        System.out.println("Şarkı Arama : ");

        ArrayList<Sarki> bulunanSarkilar = kullanici.sarkiAra("Too much love will kill you");
        for (Sarki sarki : bulunanSarkilar) {
            System.out.println("Ad : " + sarki.getAd() + "\nSanatçı : " + sarki.getSanatci() + "\nAlbüm : " + sarki.getAlbum() + "\nSüre : " + sarki.getSure());
        }

    }
}