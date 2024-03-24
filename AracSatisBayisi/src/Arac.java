public class Arac {
    private String marka;
    private String model;
    private int maaliyet;
    private int uretim_yili;
    private Kullanici kullanici;
    public Arac(){

    }
    public Arac(String marka , String model , int maaliyet , int uretim_yili ,Kullanici kullanici){
        this.marka = marka;
        this.model = model;
        this.maaliyet = maaliyet;
        this.uretim_yili = uretim_yili;
        this.kullanici = kullanici;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaaliyet() {
        return maaliyet;
    }

    public void setMaaliyet(int maaliyet) {
        this.maaliyet = maaliyet;
    }

    public int getUretim_yili() {
        return uretim_yili;
    }

    public void setUretim_yili(int uretim_yili) {
        this.uretim_yili = uretim_yili;
    }

    public Kullanici getKullanici() {
        return kullanici;
    }

    public void setKullanici(Kullanici kullanici) {
        this.kullanici = kullanici;
    }
    @Override
    public String toString(){
        return "Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", maliyet=" + maaliyet +
                ", uretimYili=" + uretim_yili +
                ", kullanici=" + kullanici.toString() +
                '}';
    }
    public int satisFiyatiHesapla(){
        return maaliyet;
    }
}
