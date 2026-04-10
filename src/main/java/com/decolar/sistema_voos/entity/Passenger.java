public class Passenger extends Person {
    private String gender;
    private String nationality;
    private String passengerType; //Adult, Child, Infant
    private String specialNeeds;
    private String passportNumber;

    public Passenger(String fullName, String cpf, String gender, String nationality, String passengerType, String specialNeeds, String passportNumber) {
        super(fullName, cpf);
        this.gender = gender;
        this.nationality = nationality;
        this.passengerType = passengerType;
        this.specialNeeds = specialNeeds;
        this.passportNumber = passportNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(String passengerType) {
        this.passengerType = passengerType;
    }

    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
}
