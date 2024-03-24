public class Main {
    public static void main(String[] args) {

        // interface ler de abstractlar gibi new lenemez
        // classlar birden fazla classtan inmplement edilebilir
        // extends e benzerdir
        // imza
        ICustomerDal iCustomerDal = new OracleCustomerDal();

        /* Birinci yöntem -->
        Abstarctlarda kullanıldığı gibi
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();*/
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}