public class Main {
    public static void main(String[] args) {
        // Create objects
        Doctor doctor = new Doctor("Dr. Smith", 45, "123-456-7890", "D001", "Cardiology");
        Nurse nurse = new Nurse("Nurse Jane", 30, "987-654-3210", "N001", "Pediatrics");
        Patient patient = new Patient("John Doe", 25, "555-1234", "P001", "Flu");
        Ward ward = new Ward(101, 10, "ICU");

        // Demonstrate polymorphism (inheritance)
        Person personRef;
        personRef = doctor;
        personRef.performRole();   // Doctor's version
        personRef = nurse;
        personRef.performRole();   // Nurse's version
        personRef = patient;
        personRef.performRole();   // Patient's version

        // Interface method calls
        IManageable manageable = doctor;
        manageable.saveData();
        manageable.deleteData();

        IResource resource = ward;
        System.out.println("Ward available? " + resource.checkAvailability());
        resource.assign();
        resource.assign();   // second assignment (may fill up)

        // Class‑specific methods
        patient.payBill();
        nurse.administerMedication();

        // Static data demonstration
        System.out.println("Total people in system: " + Person.getTotalPeopleCount());
        System.out.println("Occupied beds: " + Ward.getOccupiedBeds());

        // Using inherited concrete method
        patient.updateContact("555-5678");
        System.out.println(patient.getName() + " new contact: " + patient.getContactInfo());
    }
}
