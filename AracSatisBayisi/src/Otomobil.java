public class Otomobil extends Arac{
    private int silindirHacmi;
    public Otomobil(){

    }
    public Otomobil(String marka , String model , int maaliyet , int uretim_yili , Kullanici kullanici , int silindirHacmi){
        super(marka, model, maaliyet, uretim_yili, kullanici);
        this.silindirHacmi = silindirHacmi;
    }
    public int getSilindirHacmi() {
        return silindirHacmi;
    }

    public void setSilindirHacmi(int silindirHacmi) {
        this.silindirHacmi = silindirHacmi;
    }
    @Override
    public int satisFiyatiHesapla(){
        return getMaaliyet() + getUretim_yili() * 2 + getSilindirHacmi() * 3;
    }
    @Override
    public String toString() {
        return "Otomobil{" +
                "marka='" + getMarka() + '\'' +
                ", model='" + getModel() + '\'' +
                ", maliyet=" + getMaaliyet() +
                ", uretimYili=" + getUretim_yili() +
                ", kullanici=" + getKullanici().toString() +
                ", silindirHacmi=" + silindirHacmi +
                '}';
    }
}
