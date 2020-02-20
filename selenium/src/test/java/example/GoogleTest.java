Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@Nithinrao9696 
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


joeg3
/
selenium-grid-example
2
00
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights
selenium-grid-example/src/test/java/org/example/seleniumgrid/SearchTest.java
@joeg3 joeg3 Add package for page objects
a55fb4c on Oct 25, 2016
38 lines (31 sloc)  1.03 KB
  
package org.example.seleniumgrid;

import static org.junit.Assert.assertEquals;

import org.example.seleniumgrid.pageobjects.HomePage;
import org.example.seleniumgrid.pageobjects.SearchResultsPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
  
public class SearchTest {
    
    WebDriver driver;
    HomePage homepage;
    SearchResultsPage searchResultsPage;
    
    @Before
    public void setup() {
        driver = new FirefoxDriver();
        homepage = new HomePage(driver, "https://www.duckduckgo.com");
        //homepage.get();
    }
    
    @After
    public void tearDown() {
        driver.quit();
    }
    
    @Test
    public void testSearch() throws Exception {
        //homepage.isLoaded(); // Throws error if not loaded
        assertEquals("DuckDuckGo", homepage.getTitle());
        searchResultsPage = homepage.search("packers");
        assertEquals("packers at DuckDuckGo", searchResultsPage.getTitle());
  }
}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
