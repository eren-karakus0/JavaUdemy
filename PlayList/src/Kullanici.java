import java.util.ArrayList;
public class Kullanici {
    String ad;
    String soyad;
    MuzikKoleksiyonu koleksiyon;
    public Kullanici(String ad , String soyad){
        this.ad = ad;
        this.soyad = soyad;
        koleksiyon = new MuzikKoleksiyonu();
    }
    public void sarkiEkle(Sarki sarki){
        koleksiyon.ekle(sarki);
    }
    public void sarkiKaldir(Sarki sarki){
        koleksiyon.kaldir(sarki);
    }
    public ArrayList<Sarki> sarkiListele(){
        return koleksiyon.getSarkilar();
    }
    public ArrayList<Sarki> sarkiAra(String arananSarki){
        ArrayList<Sarki> bulunanSarki = new ArrayList<>();
        for (Sarki sarki : koleksiyon.getSarkilar()){
            if (sarki.getAd().contains(arananSarki))
            {
                bulunanSarki.add(sarki);
            }
        }
        return bulunanSarki;
    }
    public int toplamSure(){
        return koleksiyon.toplamSure();
    }
}
