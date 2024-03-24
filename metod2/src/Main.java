public class Main {
    public static void main(String[] args) {
        String mesaj = "Hello python ";
        String yenimesaj = mesaj.substring(0,2); // değer döndürüyor
        int sayi = topla(5,7);
        System.out.println(yenimesaj);
        System.out.println(sayi);
        int toplam = topla2(56,1,4,7,8,5);
        System.out.println(toplam);
    }
        public static void ekle(){
            System.out.println("Eklendi: ");
        }
        public static void sil(){
            System.out.println("Silindi");

        }
        public static void guncelle(){
            System.out.println("Güncellendi");
        }
        public static int topla(int a,int b){
        return a + b;
        }
        public static int topla2 (int... sayilar){ // variable argumans 3 nokta daha fazla sayı almamızı sağlar
        int toplam = 0;
        for(int sayi : sayilar){
            toplam += sayi;

        }
        return toplam;
        }

}