import java.util.ArrayList;

public class Bayi {
    private String ad;
    private int kurulus_yili;
    private int uretilenAracSayisi;
    private ArrayList<Arac> araclar;
    public Bayi(){

    }

    public Bayi(String ad , int kurulus_yili , int uretilenAracSayisi , ArrayList araclar){
        this.ad = ad;
        this.kurulus_yili = kurulus_yili;
        this.uretilenAracSayisi = uretilenAracSayisi;
        this.araclar = araclar;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getKurulus_yili() {
        return kurulus_yili;
    }

    public void setKurulus_yili(int kurulus_yili) {
        this.kurulus_yili = kurulus_yili;
    }

    public int getUretilenAracSayisi() {
        return uretilenAracSayisi;
    }

    public void setUretilenAracSayisi(int uretilenAracSayisi) {
        this.uretilenAracSayisi = uretilenAracSayisi;
    }

    public ArrayList<Arac> getAraclar() {
        return araclar;
    }

    public void setAraclar(ArrayList<Arac> araclar) {
        this.araclar = araclar;
    }
    public void aracEkle(Arac arac){
        araclar.add(arac);
    }
    public void aracSat(Arac arac , Kullanici kullanici){
        arac.setKullanici(kullanici);
        kullanici.setKullaniciAracSayisi(kullanici.getKullaniciAracSayisi()+1);
        kullanici.getSatinAlinanlar().add(arac);
    }
}
