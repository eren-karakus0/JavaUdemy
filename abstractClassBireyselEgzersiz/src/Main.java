public class Main {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(5,8);
        System.out.println("Dikdörtgenin kısa kenarı : "+dikdortgen.kisaKenar+"\nDikdörtgenin uzun kenarı : "+dikdortgen.uzunKenar);
        System.out.println("Dikdörtgenin alanı : "+dikdortgen.alanHesapla());
        dikdortgen.bilgiVer();
    }
}