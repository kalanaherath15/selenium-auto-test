import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeClass
    public void setupClass() {
        System.out.println("This is BeforeClass method");
    }

    @AfterClass
    public void setupAfterClass() {
        System.out.println("This is AfterClass method");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This is BeforeSuite method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This is AfterSuite method");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("This is BeforeGroups method");
    }

    @AfterGroups
    public void afterGroups() {
        System.out.println("This is AfterGroups method");
    }

    @BeforeTest
    public void setupDriver() {
        System.out.println("This is BeforeTest method");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("This is AfterTest method");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("This is BeforeMethod method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This is AfterMethod method");
    }

}
