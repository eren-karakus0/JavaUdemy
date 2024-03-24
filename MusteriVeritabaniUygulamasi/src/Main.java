public class Main {
    public static void main(String[] args) {
        SahisMusteri sahisMusteri = new SahisMusteri("Harvey","Specter",148,123456);
        FirmaMusteri firmaMusteri = new FirmaMusteri("Mike","Rose",12,852);
        sahisMusteri.bilgiGoster();
        System.out.println("-----------------------------------");
        firmaMusteri.bilgiGoster();
    }
}