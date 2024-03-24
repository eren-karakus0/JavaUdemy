public class BaseKrediManager {
    public /*final methodu ile hesapla fonksiyonunu başka bir classta ezemezsin yani
    normalde tutar 1.18 le çarpılıyor ogrenci kredi manager de ise 1.10 ile final sayesinde
    bu ortadan kalkar sen tutarı 1.18 dışında herhangi bir sayıyla çarpamazsın*/
    double hesapla(double tutar){
        return (tutar * 1.18);
    }
}
