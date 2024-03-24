public class Dikdortgen extends Sekil{
    public Dikdortgen(){

    }
    public Dikdortgen(int kisaKenar , int uzunKenar){
        super(kisaKenar , uzunKenar);
    }
    @Override
    public int alanHesapla(){
        return kisaKenar * uzunKenar;
    }
}
