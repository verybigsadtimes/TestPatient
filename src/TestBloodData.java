import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BloodData data1 = new BloodData(); //creates first default BloodData

        //user inputs
        System.out.println("Enter blood type (O, A, B or AB): ");
        BloodType bType = null;
        try {
            bType = BloodType.valueOf(sc.next().toUpperCase());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input, setting to O");
            bType = BloodType.O;
        }

        System.out.println("Enter RH type (POS or NEG): ");
        RhFactor rhType = null;
        try {
            rhType = RhFactor.valueOf(sc.next().toUpperCase());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Invalid input, setting to");
            rhType = RhFactor.POS;
        }

        BloodData data2 = new BloodData(bType, rhType); //creates BloodData with user input

        System.out.println("Default blood data: ");
        System.out.println("Blood Type: " + data1.getBloodType() + ", RH Factor: " + data1.getRhFactor());
        System.out.println("Custom blood data: ");
        System.out.println("Blood Type: " + data2.getBloodType() + ", RH Factor: " + data2.getRhFactor());

        // Change values in default object to user input
        data1.setBloodType(bType);
        data1.setRhFactor(rhType);

        System.out.println("Default blood data after changes: ");
        System.out.println("Blood Type: " + data1.getBloodType() + ", Rh Factor: " + data1.getRhFactor());
    }
}