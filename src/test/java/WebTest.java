import com.codeborne.selenide.Selenide;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WebTest {
    @Test
    public void testGoogleTitle() {
        Selenide.open("https://google.lv");
        String title = "Google";
        assertEquals(String.format("Title is not: %s", title), title, Selenide.title());
    }
}
