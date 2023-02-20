package Task4;

public interface WebDriver {

    void open();
    void close();
    String getTitle();
}

interface TakesScreenshot {
    void getScreenshot();
}

interface RemoteWebDriver extends WebDriver, TakesScreenshot{
    void navigate();
}