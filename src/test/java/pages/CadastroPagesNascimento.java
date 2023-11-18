package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CadastroPagesNascimento {
    static WebDriver driver;

    public CadastroPagesNascimento(WebDriver driver) {
        this.driver = driver;
    }

    public void preencherCampoBox() {
        WebElement dia = driver.findElement(By.id("day"));
        dia.sendKeys("10");

        Select mes = new Select(driver.findElement(By.id("month")));
        mes.selectByValue("10");

        WebElement ano = driver.findElement(By.id("year"));
        ano.sendKeys("1997");

        Select genero = new Select(driver.findElement(By.id("gender")));
        genero.selectByVisibleText("Feminino");



    }
}
