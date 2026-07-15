package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.baseclass.Reporting; 

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature File",
    glue = "org.stepdefinition",
    tags="not @SkipMe",
    monochrome = true,
    dryRun = false,
    plugin = {
        "pretty",
        "html:C:\\Users\\Admin\\eclipse-workspace\\LOCATION360\\Reports\\HtmlReport\\index.html",
        "json:C:\\Users\\Admin\\eclipse-workspace\\LOCATION360\\Reports\\jsonReport\\JSONREPORT.json",
        "junit:C:\\Users\\Admin\\eclipse-workspace\\LOCATION360\\Reports\\JunitReports\\junit.xml"
    }
)
public class TestRunner {
    @AfterClass
    public static void aftClass() {
        
        Reporting.generateJVMReport("C:\\Users\\Admin\\eclipse-workspace\\LOCATION360\\Reports\\jsonReport\\JSONREPORT.json");
        System.out.println("REPORTS GENERATED");
    }
}

