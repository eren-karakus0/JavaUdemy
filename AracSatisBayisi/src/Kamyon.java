public class Kamyon extends Arac{
    private int toplamAgirlik;
    public Kamyon(){
    }
    public Kamyon(String marka , String model , int maaliyet , int uretim_yili , Kullanici kullanici , int toplamAgirlik) {
        super(marka, model, maaliyet, uretim_yili, kullanici);
        this.toplamAgirlik = toplamAgirlik;
    }

    public int getToplamAgirlik() {
        return toplamAgirlik;
    }

    public void setToplamAgirlik(int toplamAgirlik) {
        this.toplamAgirlik = toplamAgirlik;
    }
    @Override
    public int satisFiyatiHesapla() {
        return getMaaliyet() + getUretim_yili() * 2 + getToplamAgirlik() * 6 ;
    }
    @Override
    public String toString() {
        return "Kamyon{" +
                "marka='" + getMarka() + '\'' +
                ", model='" + getModel() + '\'' +
                ", maliyet=" + getMaaliyet() +
                ", uretimYili=" + getUretim_yili() +
                ", kullanici=" + getKullanici().toString() +
                ", toplamAgirlik=" + toplamAgirlik +
                '}';
    }
}
