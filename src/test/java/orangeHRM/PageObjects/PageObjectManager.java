package orangeHRM.PageObjects;

import orangeHRM.Defination.QATestStepDefination;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public QATestPage qATestPage;
    public DashboardPage dashboardPage;
    public LoginPage loginPage;
    public AdminPage adminPage;
    public WebDriver driver;

    public PageObjectManager(WebDriver driver){
        this.driver = driver;
    }
    public DashboardPage getDashboardPage(){
        dashboardPage = new DashboardPage(driver);
        return dashboardPage;
    }
    public QATestPage getQATestPage(){
        qATestPage  = new QATestPage(driver);
        return qATestPage;
    }

    public LoginPage getLoginPage(){
        loginPage = new LoginPage(driver);
        return loginPage;
    }
    public AdminPage getAdminPage(){
        adminPage = new AdminPage(driver);
        return adminPage;
    }
}
