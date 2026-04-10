public class FlightSearchCriteria {
    private String from;
    private String to;
    private String date;
    private String returnDate;
    private String maxPrice;
    private String minPrice;

    public FlightSearchCriteria(String from, String to, String date, String returnDate, String maxPrice, String minPrice) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.returnDate = returnDate;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(String maxPrice) {
        this.maxPrice = maxPrice;
    }

    public String getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(String minPrice) {
        this.minPrice = minPrice;
    }
}
