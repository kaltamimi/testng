package extentreports;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
    public static ExtentReports getInstance() {
        ExtentReports extent;
        String Path = "./report/report-demo.html";
        extent = new ExtentReports(Path, false);
        extent
                .addSystemInfo("Selenium Version", "3.12.0")
                .addSystemInfo("Platform", "window");

        return extent;
    }
}