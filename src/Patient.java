public class Patient {
    private String name;
    private int IDnumber;
    private int age;
    public BloodData bloodData;

    public Patient() { //default constructor
        this.name = "Joe";
        this.IDnumber = 0;
        this.age = 0;
        this.bloodData = new BloodData();
    }

    public Patient(String name, int IDnumber, int age, BloodData bloodData) { //user constructor
        this.name = name;
        this.IDnumber = IDnumber;
        this.age = age;
        this.bloodData = bloodData;
    }

    public String getName() { return name; }
    public int getIDnumber() {
        return IDnumber;
    }

    public int getAge() {
        return age;
    }

    public BloodData getBloodData() {
        return bloodData;
    }
}