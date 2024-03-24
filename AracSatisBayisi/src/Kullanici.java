import java.util.ArrayList;
import java.util.Objects;

public class Kullanici {
    private String kullaniciAdi;
    private String kullaniciSoyad;
    private int kullaniciAracSayisi;
    private ArrayList<Arac> satinAlinanlar;
    public Kullanici(){

    }
    public Kullanici(String kullaniciAdi , String kullaniciSoyad , int kullaniciAracSayisi , ArrayList satinAlinanlar){
        this.kullaniciAdi = kullaniciAdi;
        this.kullaniciSoyad = kullaniciSoyad;
        this.kullaniciAracSayisi = kullaniciAracSayisi;
        this.satinAlinanlar = satinAlinanlar;
    }

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciSoyad() {
        return kullaniciSoyad;
    }

    public void setKullaniciSoyad(String kullaniciSoyad) {
        this.kullaniciSoyad = kullaniciSoyad;
    }

    public int getKullaniciAracSayisi() {
        return kullaniciAracSayisi;
    }

    public void setKullaniciAracSayisi(int kullaniciAracSayisi) {
        this.kullaniciAracSayisi = kullaniciAracSayisi;
    }

    public ArrayList getSatinAlinanlar() {
        return satinAlinanlar;
    }

    public void setSatinAlinanlar(ArrayList satinAlinanlar) {
        this.satinAlinanlar = satinAlinanlar;
    }
    public void satinAlinanAraclarListele(){
        System.out.println(getKullaniciAdi() + getKullaniciSoyad() +"'in aldigi araclar:");
        for (int i = 0; i < getSatinAlinanlar().size(); i++) {
            Object arac = null;
            if(Objects.equals(getSatinAlinanlar().get(i).getClass().getCanonicalName(), "Otomobil"))
            {
                arac = (Otomobil) getSatinAlinanlar().get(i);
            }
            else if(Objects.equals(getSatinAlinanlar().get(i).getClass().getCanonicalName(), "Kamyon"))
            {
                arac = (Kamyon) getSatinAlinanlar().get(i);
            }
            System.out.println(arac.toString());
        }
    }

}
