import java.util.Scanner;
import java.util.InputMismatchException;

public class TestPatient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Patient patient1 = new Patient(); //default patient

        //User inputs for all fields
        String name;
        int idNumber;
        int age;

        try {
            System.out.println("Enter patient name: ");
            name = sc.nextLine();
        } catch (Exception e) {
            System.out.println("Invalid input, setting to Bob");
            name = "Bob";
        }

        try {
            System.out.println("Enter ID number: ");
            idNumber = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, setting to 0");
            idNumber = 0;
        }

            try {
                System.out.println("Enter age: ");
                age = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, setting to 0");
                age = 0;
            }

            System.out.println("Enter blood type (O, A, B or AB): ");
            BloodType bType = null;
            try {
                bType = BloodType.valueOf(sc.next().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input, setting to O");
                bType = BloodType.O;
            }

            System.out.println("Enter RH type (POS or NEG): ");
            RhFactor rhType = null;
            try {
                rhType = RhFactor.valueOf(sc.next().toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input, setting to POS");
                rhType = RhFactor.POS;
            }

            BloodData userData = new BloodData(bType, rhType);
            Patient patient2 = new Patient(name, idNumber, age, userData); //patient with user inputs

            Patient patient3 = new Patient(name, idNumber, age, new BloodData()); //patient with default blood data

            System.out.println("Patient one's information: ");
            System.out.println("Name: " + patient1.getName() + ", ID Number: " + patient1.getIDnumber() + ", Age: " + patient1.getAge() + ", Blood Data: " + "Blood Type: " + patient1.getBloodData().getBloodType() + ", Rh Factor: " + patient1.getBloodData().getRhFactor());

            System.out.println("Patient two's information: ");
            System.out.println("Name: " + patient2.getName() + ", ID Number: " + patient2.getIDnumber() + ", Age: " + patient2.getAge() + ", Blood Data: " + "Blood Type: " + patient2.getBloodData().getBloodType() + ", Rh Factor: " + patient2.getBloodData().getRhFactor());

            System.out.println("Patient three's information: ");
            System.out.println("Name: " + patient3.getName() + ", ID Number: " + patient3.getIDnumber() + ", Age: " + patient3.getAge() + ", Blood Data: " + "Blood Type: " + patient3.getBloodData().getBloodType() + ", Rh Factor: " + patient3.getBloodData().getRhFactor());

    }

}