import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Kullanici kullanici = new Kullanici("Walter","White",3,new ArrayList<>());
        Otomobil otomobil = new Otomobil("Wolkswagen","Passat",150000,2000,new Kullanici() ,3287);
        Bayi bayi = new Bayi("KNKCHN",2018,46000,new ArrayList<>());
        bayi.aracEkle(otomobil);
        bayi.aracSat(otomobil,kullanici);
        kullanici.satinAlinanAraclarListele();
        Kamyon kamyon = new Kamyon ("Lamborghini", "Lambo", 98000, 2013, new Kullanici(), 12000);
        bayi.aracEkle(kamyon);
        bayi.aracSat(kamyon,kullanici);
        kullanici.satinAlinanAraclarListele();
    }
}