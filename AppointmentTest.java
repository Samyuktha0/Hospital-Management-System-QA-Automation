package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.AppointmentPage;
import utils.BaseTest;
import utils.DBValidator;

public class AppointmentTest extends BaseTest {
    AppointmentPage appointmentPage;

    @BeforeMethod
    public void setupTest() {
        appointmentPage = new AppointmentPage(driver);
    }

    @Test
    public void testAppointmentBooking() {
        appointmentPage.bookAppointment("Dr. Smith", "2025-10-10");
        Assert.assertTrue(DBValidator.validateAppointment("P123", "2025-10-10"));
    }
}
