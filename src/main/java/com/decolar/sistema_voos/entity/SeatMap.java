import java.util.ArrayList;
import java.util.List;

public class SeatMap {
    private String flightNumber;
    private List<Seat> seats = new ArrayList<>();
    private int totalRows;
    private int totalColumns;

    public SeatMap(String flightNumber, List<Seat> seats, int totalRows, int totalColumns) {
        this.flightNumber = flightNumber;
        this.seats = seats;
        this.totalRows = totalRows;
        this.totalColumns = totalColumns;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalColumns() {
        return totalColumns;
    }

    public void setTotalColumns(int totalColumns) {
        this.totalColumns = totalColumns;
    }
}
