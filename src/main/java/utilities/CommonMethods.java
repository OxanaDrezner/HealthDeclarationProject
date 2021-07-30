package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class CommonMethods extends Base {

    public static void takeSnapShot(String filePath) throws IOException {
        File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File DestFile=new File(filePath);
        FileUtils.copyFile(SrcFile, DestFile);
    }
}
