public class Product {

    // Attribute | field
    // private sadece tanımlandığı blokta geçerli private tanımladığım için main bölümünde çalışmaz
    // this bu class demek - içerisinde bulunduğum classtaki id
    // this i daha iyi kullanmak için id yi tanımlarken başına _ getirdik
    // daha iyi okunup anlaşılabilmesi için
    // get ile alıyorsun set ile yazdırılıyor kullanıcıdan giriş istemiyorsan set kullanma

    public Product /* böyle tanımladığında mainde product içinde değer verebiirsin değişkenlere(int id, String name, String description, double price, String renk)*/{
        System.out.println("yapıcı blok çalıştı");
        /*
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.renk = renk;
        */
    }
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

}
