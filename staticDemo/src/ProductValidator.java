public class ProductValidator {
    //isEmpty() boş anlamında gelir aşşağıda yaptığımız
    // boş değilse ! ile ve fiyat 0 dan büyükse true döndür
    static {
        System.out.println("Yapıcı blok çalıştı: ");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok çalıştı: ");//bunu çalıştırmak için new lemek gerekiyor
        //ayrıca çalıştırmak için static blok kurarız
    }
    public static boolean isValid(Product product){
        if(product.price > 0 && !product.name.isEmpty()){
            return true;
        }
        else
        {
            return false;
        }
    }
    // ana class ı static yapamazsın ama class içinde başka bir calas
    // açtığında onu static yapabilirsin buna da inner class denir.
    // bir temel class ve onu içinden bölümlendirecek küçük class lar --> inner class
}
