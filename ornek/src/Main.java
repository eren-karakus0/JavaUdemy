import java.util.ArrayList;

class Sarki {
    private String ad;
    private String sanatci;
    private String album;
    private int sure;

    public Sarki(String ad, String sanatci, String album, int sure) {
        this.ad = ad;
        this.sanatci = sanatci;
        this.album = album;
        this.sure = sure;
    }

    public String getAd() {
        return ad;
    }

    public String getSanatci() {
        return sanatci;
    }

    public String getAlbum() {
        return album;
    }

    public int getSure() {
        return sure;
    }
}

class MuzikKoleksiyonu {
    private ArrayList<Sarki> sarkilar;

    public MuzikKoleksiyonu() {
        this.sarkilar = new ArrayList<>();
    }

    public void sarkiEkle(Sarki sarki) {
        sarkilar.add(sarki);
    }

    public void sarkiSil(Sarki sarki) {
        sarkilar.remove(sarki);
    }

    public ArrayList<Sarki> getSarkilar() {
        return sarkilar;
    }

    public int toplamSure() {
        int toplamSure = 0;
        for (Sarki sarki : sarkilar) {
            toplamSure += sarki.getSure();
        }
        return toplamSure;
    }
}

class Kullanici {
    private String kullaniciAdi;
    private String soyadi;
    private MuzikKoleksiyonu koleksiyon;

    public Kullanici(String kullaniciAdi, String soyadi) {
        this.kullaniciAdi = kullaniciAdi;
        this.soyadi = soyadi;
        this.koleksiyon = new MuzikKoleksiyonu();
    }

    public void sarkiEkle(Sarki sarki) {
        koleksiyon.sarkiEkle(sarki);
    }

    public void sarkiSil(Sarki sarki) {
        koleksiyon.sarkiSil(sarki);
    }

    public ArrayList<Sarki> sarkilariListele() {
        return koleksiyon.getSarkilar();
    }

    public ArrayList<Sarki> sarkiAra(String aranan) {
        ArrayList<Sarki> bulunanSarkilar = new ArrayList<>();
        for (Sarki sarki : koleksiyon.getSarkilar()) {
            if (sarki.getAd().contains(aranan)) {
                bulunanSarkilar.add(sarki);
            }
        }
        return bulunanSarkilar;
    }

    public int toplamSure() {
        return koleksiyon.toplamSure();
    }
}

public class SarkiListesiUygulamasi {
    public static void main(String[] args) {
        Kullanici kullanici = new Kullanici("kullaniciAdi", "soyadi");

        Sarki sarki1 = new Sarki("Şarkı 1", "Sanatçı 1", "Albüm 1", 180);
        Sarki sarki2 = new Sarki("Şarkı 2", "Sanatçı 2", "Albüm 2", 200);
        kullanici.sarkiEkle(sarki1);
        kullanici.sarkiEkle(sarki2);

        System.out.println("Kullanıcının Toplam Şarkı Süresi: " + kullanici.toplamSure() + " saniye");
        System.out.println("Kullanıcının Şarkıları:");
        for (Sarki sarki : kullanici.sarkilariListele()) {
            System.out.println("Ad: " + sarki.getAd() + ", Sanatçı: " + sarki.getSanatci() + ", Albüm: " + sarki.getAlbum() + ", Süre: " + sarki.getSure() + " saniye");
        }

        kullanici.sarkiSil(sarki1);

        System.out.println("Kullanıcının Toplam Şarkı Süresi: " + kullanici.toplamSure() + " saniye");
        System.out.println("Kullanıcının Şarkıları:");
        for (Sarki sarki : kullanici.sarkilariListele()) {
            System.out.println("Ad: " + sarki.getAd() + ", Sanatçı: " + sarki.getSanatci() + ", Albüm: " + sarki.getAlbum() + ", Süre: " + sarki.getSure() + " saniye");
        }

        System.out.println("Şarkı arama sonucu:");
        ArrayList<Sarki> bulunanSarkilar = kullanici.sarkiAra("Şarkı");
        for (Sarki sarki : bulunanSarkilar) {
            System.out.println("Ad: " + sarki.getAd() + ", Sanatçı: " + sarki.getSanatci() + ", Albüm: " + sarki.getAlbum() + ", Süre: " + sarki.getSure() + " saniye");
        }
    }
}
