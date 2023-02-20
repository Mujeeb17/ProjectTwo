package Task4;

public class Tester {
    public static void main(String[] args) {

        RemoteWebDriver[] wd = {new ChromeDriver(), new FirefoxDriver(), new SafariDriver()};

        //running all methods available to the Driver classes
        for (RemoteWebDriver x: wd) {
            System.out.println("Title: " + x.getTitle());
            x.open();
            x.navigate();
            x.getScreenshot();
            x.close();
            System.out.println();
        }
    }
}
