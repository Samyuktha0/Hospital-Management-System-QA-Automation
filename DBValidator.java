package utils;

import java.sql.*;

public class DBValidator {
    public static boolean validateAppointment(String patientId, String date) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM appointments WHERE patient_id = '" + patientId + "' AND date = '" + date + "'");
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
