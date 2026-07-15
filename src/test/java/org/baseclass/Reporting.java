package org.baseclass;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
    public static void generateJVMReport(String jsonPath) {
        
        File f = new File("C:\\Users\\Admin\\eclipse-workspace\\LOCATION360\\Reports\\JVMReport");
        
        Configuration c = new Configuration(f, "Locate360");
        c.addClassifications("Browser", "Chrome");
        c.addClassifications("OS", "Windows 10");
        
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(jsonPath);
        
        ReportBuilder builder = new ReportBuilder(jsonFiles, c);
        builder.generateReports();
    }
}