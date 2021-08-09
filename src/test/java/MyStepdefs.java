import com.codeborne.selenide.Selenide;
import io.cucumber.java.en.Given;

public class MyStepdefs {
    @Given("^user opens browser$")
    public void userOpensBrowser() {
        Selenide.open("https://google.lv");
    }
}
