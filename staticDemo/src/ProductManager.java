public class ProductManager {
    // static kullanımı ile bir kere oluştururuz ve bütün kullanıcılar istediği gibi kullanabilir.
    // static kullanıldığı zaman uygulama kapanana kadar o fonksiyonun kullanımı değişmez
    // bu nedenle de her yerde kullanmayız
    public void add(Product product){
        //ProductValidator validator = new ProductValidator(); static kullanıldığı zaman new e gerek kalmaz
        if(ProductValidator.isValid(product)){
            System.out.println("Eklendi: ");
        }
        else
        {
            System.out.println("Ürün bilgileri geçersizdir: ");
        }
    }
}
