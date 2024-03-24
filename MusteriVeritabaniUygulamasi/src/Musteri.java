import javax.swing.text.StyledEditorKit;

public class Musteri {
    private String musteriAdi;
    private String musteriSoyadi;
    private int musteriNo;

    public Musteri(String musteriAdi , String musteriSoyadi , int musteriNo){
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.musteriNo = musteriNo;
    }
    public void bilgiGoster(){
        System.out.println("Müşteri adı : "+musteriAdi+" Müşteri soyadı : "+musteriSoyadi+" Müşteri numarası : "+musteriNo);
    }
    public String getMusteriAdi(){
        return musteriAdi;
    }
    public String getMusteriSoyadi(){
        return musteriSoyadi;
    }
    public int getMusteriNo(){
        return musteriNo;
    }

}
