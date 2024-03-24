public class Main {
    public static void main(String[] args) {
        // polymorphism çok biçimlilik demek

        /*BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsolLogger()};
        for (BaseLogger logger:loggers){
            logger.Log("log mesajı ");
        }*/
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}