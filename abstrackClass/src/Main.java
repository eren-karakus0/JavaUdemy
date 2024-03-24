public class Main {
    public static void main(String[] args) {
        WomamGameCalculator womamGameCalculator = new WomamGameCalculator();
        womamGameCalculator.gameOver();
        womamGameCalculator.hesapla();

        // abstrack sınıfları new'leme

        GameCalculator gameCalculator = new WomamGameCalculator();
        gameCalculator.hesapla();
    }
}