public class CustomerManager{
    //Burada ana sınıf olan BaseDatabaseManager i alarak
    // alt sınıflarıyla da işlem yapabilme imkanını sağladım
    // örneğin OracleDatabaseManager oracleDatabaseManager = new OracleDatabaseManager();
    //kullanmak yerine bunu yaptığımda ana sınıf içinden istediğim
    // diğer sınıflara erişebilme imkanını elde etmiş oluyorum.
    //Bu yöntemi her zaman kullan.
    BaseDatabaseManager databaseManager;
    public void getCustomers(){
        databaseManager.getData();
    }
}
