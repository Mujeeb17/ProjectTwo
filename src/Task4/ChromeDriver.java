package Task4;

public class ChromeDriver implements RemoteWebDriver{

    @Override
    public void open() {
        System.out.println("Opening chrome");
    }

    @Override
    public void close() {
        System.out.println("Closing chrome");
    }

    @Override
    public String getTitle() {
        return "ChromeDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot on chrome");
    }

    @Override
    public void navigate() {
        System.out.println("navigating chrome browser");
    }
}
class FirefoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing Firefox");
    }

    @Override
    public String getTitle() {
        return "FirefoxDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot on Firefox");
    }

    @Override
    public void navigate() {
        System.out.println("navigating Firefox browser");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening Safari");
    }

    @Override
    public void close() {
        System.out.println("Closing Safari");
    }

    @Override
    public String getTitle() {
        return "SafariDriver";
    }

    @Override
    public void getScreenshot() {
        System.out.println("Getting screenshot on Safari");
    }

    @Override
    public void navigate() {
        System.out.println("navigating Safari browser");
    }
}