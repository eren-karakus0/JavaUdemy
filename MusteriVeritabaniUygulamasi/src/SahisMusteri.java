public class SahisMusteri extends Musteri{
    private int musteriTelNo;
    public SahisMusteri(String musteriAdi, String musteriSoyadi, int musteriNo , int musteriTelNo) {
        super(musteriAdi, musteriSoyadi, musteriNo);
        this.musteriTelNo = musteriTelNo;
    }
    public int getMusteriTelNo() {
        return musteriTelNo;
    }
    public void setMusteriTelNo(int musteriTelNo) {
        this.musteriTelNo = musteriTelNo;
    }
    @Override
    public void bilgiGoster(){
        System.out.println("Müşteri türü = Şahıs müşteri");
        System.out.println("Müşteri adı : "+getMusteriAdi()+"\nMüşteri soyadı : "+getMusteriSoyadi()+"\nMüşteri numarası : "+getMusteriNo()+"\nMüşteri telefon numarası : "+getMusteriTelNo());
    }

}
