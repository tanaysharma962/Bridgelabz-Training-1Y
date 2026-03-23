package Applying_Encapsulation.HospitalPatientManagement;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private String diagnosis; // Encapsulated sensitive data

    public InPatient(int id, String name, int age, int daysAdmitted) {
        super(id, name, age);
        this.daysAdmitted = daysAdmitted;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * 2000; // cost per day
    }

    @Override
    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
}
