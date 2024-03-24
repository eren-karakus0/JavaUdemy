public class Main {
    public static void main(String[] args) {
        OgrenciBilgileri ogrenciBilgileri = new OgrenciBilgileri();
        OgrenciIslemleri ogrenciIslemleri = new OgrenciIslemleri();

        ogrenciBilgileri.setOgrenciNumarasi(123456789);
        ogrenciBilgileri.setOgrenciAdi("Eren");
        ogrenciBilgileri.setOgrenciTc(987654321);
        ogrenciBilgileri.setOgrenciYas(19);

        System.out.println(ogrenciBilgileri.getOgrenciAdi());

        ogrenciIslemleri.ekle(ogrenciBilgileri);
    }
}