public abstract class Sekil {
    int uzunKenar;
    int kisaKenar;
    public Sekil(){

    }
    public Sekil(int kisaKenar , int uzunKenar){
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }
    public abstract int alanHesapla();

    public void bilgiVer(){
        System.out.println("Bu bir şekildir: ");
    }
}
