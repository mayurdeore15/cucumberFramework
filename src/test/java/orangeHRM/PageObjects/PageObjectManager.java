package orangeHRM.PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
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
    public LoginPage getLoginPage(){
        loginPage = new LoginPage(driver);
        return loginPage;
    }
    public AdminPage getAdminPage(){
        adminPage = new AdminPage(driver);
        return adminPage;
    }
}
