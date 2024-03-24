public class Util {
    public static <E> void yazdir(E[] dizi) {
        for (E eleman : dizi) {
            System.out.print(eleman + " ");
        }
        System.out.println();
    }
}
