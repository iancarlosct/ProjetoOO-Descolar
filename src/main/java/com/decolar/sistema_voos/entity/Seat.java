public class Seat {
    private String seatNumber;
    private String classType;
    private boolean isOccupied;
    private double price;

    public Seat(String seatNumber, String classType, boolean isOccupied, double price) {
        this.seatNumber = seatNumber;
        this.classType = classType;
        this.isOccupied = isOccupied;
        this.price = price;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
