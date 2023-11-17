public class Main {
    public static void main(String[] args) {
       Customer customer=new Customer();

       IScreen screenWindows=customer.screenFactory(ScreenModel.WINDOWS);
       IScreen screenWeb=customer.screenFactory(ScreenModel.WEB);
       IScreen screenMobile=customer.screenFactory(ScreenModel.MOBILE);

       screenWindows.draw();
       screenWeb.draw();
       screenMobile.draw();
    }
}