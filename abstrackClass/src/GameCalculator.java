public abstract class GameCalculator {
    public abstract void hesapla();
    //abstrack işlemi herkes kendi hesapla fonksiyonunu yazmak zorunda
    // gibi bir anlam verir. Kısaca fonksiyonu Override ederiz.

    public void gameOver(){
        System.out.println("Oyun bitti");
    }
}
