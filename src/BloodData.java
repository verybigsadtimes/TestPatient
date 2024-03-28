public class BloodData {
    private BloodType bloodType;
    private RhFactor rhFactor;
    public BloodData() { //default constructor
        this.bloodType = BloodType.O;
        this.rhFactor = RhFactor.POS;
    }
    public BloodData(BloodType bloodType, RhFactor rhFactor) { //user constructor
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public BloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(BloodType bloodType) {
        this.bloodType = bloodType;
    }

    public RhFactor getRhFactor() {
        return rhFactor;
    }

    public void setRhFactor(RhFactor rhFactor) {
        this.rhFactor = rhFactor;
    }
}