package com.softwaretestingboard.magento.pages;

import com.aventstack.extentreports.Status;
import com.softwaretestingboard.magento.customlisteners.CustomListeners;
import com.softwaretestingboard.magento.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility
{
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    //---------------Homepage action takes to WomanPage------------------
    //Mouse Hover on Women Menu
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement mouseHoverWomenMenu;

    // Mouse Hover on Tops
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement mouseHoverTop;

    public void mouseHoverWomenMenu()
    {
        mouseHoverToElement1(mouseHoverWomenMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Women Menu");
    }

    public void mouseHoverOnTop()
    {
        mouseHoverToElement1(mouseHoverTop);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Tops");
    }

    //----------------Homepage action takes to MenPage----------------
    //By mouseHoverOnMenMenu = By.xpath("//span[normalize-space()='Men']");

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement mouseHoverOnMenMenu;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement mouseHoverOnBottom;

    //Mouse Hover on Men Menu
    public void mouseHoverOnMenMenu()
    {
        mouseHoverToElement1(mouseHoverOnMenMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Men Menu");
    }

    //Mouse Hover On Bottom
    public void mouseHoverOnBottom()
    {
        mouseHoverToElement1(mouseHoverOnBottom);
        CustomListeners.test.log(Status.PASS,"Mouse Hover On Bottom");
    }

    //--------------Homepage action takes to GearPage---------

    //By mouseHoverGearMenu = By.xpath("//span[normalize-space()='Gear']");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement mouseHoverGearMenu;

    // Mouse Hover on Gear Menu
    public void mouseHoveOnGearMenu()
    {
        mouseHoverToElement1(mouseHoverGearMenu);
        CustomListeners.test.log(Status.PASS,"Mouse Hover on Gear Menu");
    }
}
