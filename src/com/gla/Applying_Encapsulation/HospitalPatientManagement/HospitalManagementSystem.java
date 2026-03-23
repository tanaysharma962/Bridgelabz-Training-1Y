package Applying_Encapsulation.HospitalPatientManagement;
import java.util.ArrayList;
public class HospitalManagementSystem {
    public static void main(String[] args) {

        ArrayList<Patient> patients = new ArrayList<>();

        patients.add(new InPatient(101, "Rahul", 35, 4));
        patients.add(new OutPatient(201, "Anita", 28));

        for (Patient p : patients) {

            System.out.println("\nPatient Details:");
            p.getPatientDetails();

            double bill = p.calculateBill();
            System.out.println("Total Bill: " + bill);

            MedicalRecord record = (MedicalRecord) p;

            record.addRecord("General Checkup Completed");
            record.viewRecords();
        }
    }

}
