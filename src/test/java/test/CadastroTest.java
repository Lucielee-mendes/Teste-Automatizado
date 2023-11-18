package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroPagesNascimento;
import pages.CadastroPagesNome;

import java.time.Duration;

import static org.junit.Assert.fail;

public class CadastroTest {

    static WebDriver driver;
    static CadastroPagesNome cadastroPages;
    static CadastroPagesNascimento cadastroPagesNascimento;
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver-win64/chromedriver.exe");
        driver =new ChromeDriver();
        driver.get("https://accounts.google.com/SignUp?hl=pt");

        cadastroPages = new CadastroPagesNome(driver);
        cadastroPagesNascimento = new CadastroPagesNascimento(driver);
    }

    @Test
    public void test() {
        cadastroPages.preencherCampo();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        cadastroPagesNascimento.preencherCampoBox();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
       // driver.quit();
    }
}
