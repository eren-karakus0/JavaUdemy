public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        //customerManager.databaseManager = new OracleDatabaseManager();
        customerManager.databaseManager = new SqlServerDatabaseManager();
        // Göründüğü gibi işlem çok profesyonel ve rahat ayrıca;
        //yeni bir class getirildiği zaman da kolaylıkla eklenebilir
        customerManager.getCustomers();
    }
}