package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BongoDramaSportsTest_01_PageObject extends PageObjectMain {

    @FindBy(xpath = "//span[contains(text(),'Drama')]")
    public WebElement dramaMenu;

    @FindBy(xpath = "//span[contains(text(),'Sports')]")
    public WebElement sportsMenu;

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]")
    public WebElement search;

    //header/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/input[1]

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/div[1]/div[1]")
    public WebElement firstNews;

    @FindBy(xpath = "//h5[contains(text(),'Ganjam 420')]")
    public WebElement dramaName;
    //h5[contains(text(),'Ganjam 420')]

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/a[1]/div[1]/div[1]")
    public WebElement thirdNews;

    @FindBy(xpath = "//h5[contains(text(),\"Lionel Messi's PSG Press Conference\")]")
    public  WebElement thirdNewsName;


    @FindBy(xpath = "//button[contains(@title,'Play')]")
    public WebElement playAndPauseButton;

    public BongoDramaSportsTest_01_PageObject(WebDriver driver) {
        super(driver);
    }
}
