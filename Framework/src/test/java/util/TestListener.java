package util;

import driver.DriverManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.apache.logging.log4j.LogManager;

import java.io.File;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TestListener implements ITestListener {

    private Logger log = LogManager.getRootLogger();

    public void onStart(ITestContext iTestContext) {
        clearFolderWithScreenshots();
        saveScreenshot();
    }

    private void clearFolderWithScreenshots() {
        String path = ".//target/screenshots/";
        try {
            for (File myFile : new File(path).listFiles())
                if (myFile.isFile()) myFile.delete();
        }
        catch (NullPointerException exception) {
            log.error(exception.getMessage());
        }
    }

    private void saveScreenshot() {
        File screenCapture = ((TakesScreenshot) DriverManager
                .getDriver())
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenCapture, new File(
                    ".//target/screenshots/"
                            + getCurrentTimeAsString() +
                            ".png"));
        } catch (IOException e) {
            log.error("Failed to save screenshot: " + e.getLocalizedMessage());
        }
    }

    private String getCurrentTimeAsString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "uuuu-MM-dd_HH-mm-ss" );
        return ZonedDateTime.now().format(formatter);
    }
}
