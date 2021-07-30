package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base {

    /*
    ############################################################################
    Method Name: getData
    Method Description: This Method Extracts data from xml configuration file
    Method Parameters: String
    Method Return Type: String
    ############################################################################
     */
    public static String getData (String nodeName)
    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e) {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

    /*
    #####################################################################################################
    Method Name: initBrowser
    Method Description: This Method Initializes the Driver with desired Browser Type Driver. Configures
                        Objects and Parameters needed and launches the Browser with defined URL.
    Method Parameters: String
    Method Return Type: void
    #####################################################################################################
     */
    @BeforeClass
    public static void startSession(){
        if (getData("BrowserName").equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (getData("BrowserName").equalsIgnoreCase("firefox"))
            driver = initFirefoxDriver();
        else if (getData("BrowserName").equalsIgnoreCase("ie"))
            driver = initIEDriver();
        else
            throw new RuntimeException("Invalid Browser Type");

        ManagePages.initEducation();
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver,Long.parseLong(getData("TimeOut")));
        driver.get(getData("url"));
        driver.manage().window().maximize();
    }

    /*
    ################################################################################
    Method Name: initChromeDriver
    Method Description: This Method Sets Up System Property of Updated ChromeDriver
    Method Parameters: void
    Method Return Type: WebDriver
    ################################################################################
     */
    public static WebDriver initChromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    /*
    ##################################################################################
    Method Name: initFirefoxDriver
    Method Description: This Method Sets Up System Property of Updated FirefoxDriver
    Method Parameters: void
    Method Return Type: WebDriver
    ##################################################################################
     */
    public static WebDriver initFirefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    /*
    ###########################################################################################
    Method Name: initIEDriver
    Method Description: This Method Sets Up System Property of Updated InternetExplorerDriver
    Method Parameters: void
    Method Return Type: WebDriver
    ###########################################################################################
     */
    public static WebDriver initIEDriver(){
        WebDriverManager.iedriver().setup();
        return new InternetExplorerDriver();
    }


    /*
    ##################################################################
    Method Name: closeSession
    Method Description: This Method closes Connection to AUT.
    Method Parameters: void
    Method Return Type: void
    ##################################################################
     */
    @AfterClass
    public void closeSession(){
        driver.quit();
    }

}
