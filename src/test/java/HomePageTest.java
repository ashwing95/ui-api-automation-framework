import com.ashwin.framework.base.BaseTest;
import com.ashwin.framework.pages.LoginPage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    @Test(dataProvider = "LoginData" , dataProviderClass = TestDataProvider.class)

    public void verifySearchProducts(String url  ){
        driver.get(url) ;
        driver.manage().window().maximize();
        LoginPage lp = new LoginPage(driver) ;
        lp.searchProducts("Apple");



    }
}
