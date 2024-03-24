public class Main {
    public static void main(String[] args) {

        customerManager customerManager = new customerManager();
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();


        dortIslem islemler = new dortIslem();

        int sonuc = islemler.topla(5,6);
        System.out.println(sonuc);

    }
}