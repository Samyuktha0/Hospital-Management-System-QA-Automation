package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AppointmentPage {
    WebDriver driver;

    @FindBy(id = "doctorSelect") WebElement doctor;
    @FindBy(id = "date") WebElement date;
    @FindBy(id = "bookBtn") WebElement bookBtn;

    public AppointmentPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void bookAppointment(String doctorName, String appointmentDate) {
        new Select(doctor).selectByVisibleText(doctorName);
        date.sendKeys(appointmentDate);
        bookBtn.click();
    }
}
