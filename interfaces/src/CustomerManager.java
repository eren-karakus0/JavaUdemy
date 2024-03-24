public class CustomerManager {
    // birinci yöntem abstractlarda kullanılan gibi
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal = customerDal;
    }
    public void add(){
        //iş kodları yazılır
        customerDal.Add();
    }
}
