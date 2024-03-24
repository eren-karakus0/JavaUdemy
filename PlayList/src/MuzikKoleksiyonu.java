import java.util.ArrayList;
public class MuzikKoleksiyonu {
    ArrayList<Sarki> sarkilar;
    public MuzikKoleksiyonu(){
        sarkilar = new ArrayList<>();
    }
    public void ekle(Sarki sarki){
        sarkilar.add(sarki);
    }
    public void kaldir(Sarki sarki){
        sarkilar.remove(sarki);
    }
    public ArrayList<Sarki> getSarkilar(){
        return sarkilar;
    }
    public int toplamSure(){
        int toplamSure = 0;
        for (Sarki sarki: sarkilar){
            toplamSure += sarki.getSure();
        }
        return toplamSure;
    }
}
