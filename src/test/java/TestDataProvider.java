import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "LoginData")

    public Object[][] getLoginData(){

        return new Object[][] {
                {"https://www.kapruka.com"}
        };

    }

}
