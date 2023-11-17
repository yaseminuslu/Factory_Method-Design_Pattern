public class Customer {
    public IScreen screenFactory(ScreenModel screenModel){
        IScreen iScreen=null;

        switch (screenModel)
        {
            case ScreenModel.WINDOWS:
                iScreen=new WinScreen();
                break;

            case ScreenModel.WEB:
                iScreen=new WebScreen();
                break;

            case ScreenModel.MOBILE:
                iScreen =new MobileScreen();
                break;
        }
        return iScreen;
    }
}
