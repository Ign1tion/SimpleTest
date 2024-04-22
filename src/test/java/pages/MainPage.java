package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class MainPage {
private SelenideElement input = $(By.className("gLFyf"));
private SelenideElement searchButton = $(By.xpath(".//div[@class = 'FPdoLc lJ9FBc']//input[@class = 'gNO89b' and @value = 'Поиск в Google']"));
@Step
@Description("entering 'selenide' in search input and presses enter after")

public void searchText(){
    input.setValue("selenide").pressEnter();

}
}
