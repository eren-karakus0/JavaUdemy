//Aynı class içinde birden fazla static pek önerilmez böyle yapmak yerine bir tane daha class aç
public class DatabaseHelper {
    public static class Crud{ // Crud --> create read update delete
        public static void Delete(){

        }
        public static void Update(){

        }
    }

    public static class Connection{
        public static void createConnection(){

        }
    }
}
