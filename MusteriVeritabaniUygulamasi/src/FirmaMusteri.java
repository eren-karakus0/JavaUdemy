import java.lang.reflect.Field;
public class FirmaMusteri extends Musteri{
    private int musteriVergiNo;
    public FirmaMusteri(String musteriAdi, String musteriSoyadi, int musteriNo , int musteriVergiNo) {
        super(musteriAdi, musteriSoyadi, musteriNo);
        this.musteriVergiNo = musteriVergiNo;
    }
    @Override
    public void bilgiGoster(){
        System.out.println("Müşteri türü = Firma müşteri ");
        System.out.println("Müşteri adı : "+getMusteriAdi()+"\nMüşteri soyadı : "+getMusteriSoyadi()+"\nMüşteri numarası : "+getMusteriNo()+"\nMüşteri vergi numarası : "+getMusteriVergiNo());
    }
    public int getMusteriVergiNo(){
        return musteriVergiNo;
    }
    public void setMusteriVergiNo(int musteriVergiNo) {
        this.musteriVergiNo = musteriVergiNo;
    }
}
