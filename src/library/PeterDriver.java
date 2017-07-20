package library;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.FileDetector;
import org.openqa.selenium.remote.service.DriverCommandExecutor;
import sun.awt.image.PNGImageDecoder;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by peterli on 2017-06-22.
 */
public class PeterDriver extends FirefoxDriver {

    @Override
    public void setFileDetector(FileDetector detector) {

        System.out.println("I dont know what im doing haha");

    }

    public void setFileDetector(FileDetector detector, String name) {
        throw new WebDriverException("Setting the file detector only works on remote webdriver instances obtained via RemoteWebDriver");
    }



}
