package com.yuliiakulyk.app.homework.lesson23.tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuliia Kulyk on 27.12.2016.
 */
public abstract class EquerestBaseTest {
    public WebDriver driver;
    private String BROWSER = System.getProperty("browser");
    private static String OS = System.getProperty("os.name").toLowerCase();
    private static final String CHROME_PATH_MAC = "src/../../chromedriver";
    private static final String CHROME_PATH_WIN = "src/test/resources/drivers/chromedriver.exe";

    @Before
    public void setUp() {
        if (BROWSER == null || BROWSER.equalsIgnoreCase("Firefox") ||
                BROWSER.equalsIgnoreCase("")) {
            this.driver = new FirefoxDriver();
        } else if (BROWSER.equalsIgnoreCase("Chrome")) {
            if (isWindows()) {
                System.setProperty("webdriver.chrome.driver", CHROME_PATH_WIN);
            } else if (isMac()){
                System.setProperty("webdriver.chrome.driver", CHROME_PATH_MAC);
            }
            this.driver = new ChromeDriver();
        }
        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        saveImageAttach("screenshot from " + BROWSER);
        driver.quit();
    }

    private static boolean isWindows() {
        return (OS.contains("win"));
    }

    private static boolean isMac() {
        return (OS.contains("mac"));
    }

    public static boolean isUnix() {
        return (OS.contains("nix") || OS.contains("nux") || OS.contains("aix"));
    }

    @Attachment(value = "{0}", type = "image/png")
    public byte[] saveImageAttach(String attachName) {
        try {
            File srcFile =
                    ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            return toByteArray(srcFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    private static byte[] toByteArray(File file) throws IOException {
        return Files.readAllBytes(Paths.get(file.getPath()));
    }
}
