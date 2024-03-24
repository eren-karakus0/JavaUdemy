public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        ProductManager productManager = new ProductManager();

        // aşşadaki kullanım hem görüntü hem de temiz çalışma açısından kötü
       // Product product = new Product(int 5, String "name", String "description", double 500, String "renk")
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("ASUS laptop");
        product.setPrice(5000);
        product.setStockAmount(3);


        System.out.println(product.getName());
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}

