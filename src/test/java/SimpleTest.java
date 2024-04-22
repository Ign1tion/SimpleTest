import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {
    MainPage mainPage = new MainPage();
@Test
    public void searchValue(){
    Configuration.browser = "ie";
    open("https://www.google.com/");
    mainPage.searchText();
    assert $(By.className("VuuXrf")).isDisplayed();
}
@Test
    public void testInTest(){
    open("https://www.google.com/");
}
}
