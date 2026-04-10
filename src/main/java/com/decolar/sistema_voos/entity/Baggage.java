public class Baggage {
    private String type;
    private double weightLimit;
    private double extraFee;
    private boolean isChecked;

    public Baggage(String type, double weightLimit, double extraFee, boolean isChecked) {
        this.type = type;
        this.weightLimit = weightLimit;
        this.extraFee = extraFee;
        this.isChecked = isChecked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }

    public double getExtraFee() {
        return extraFee;
    }

    public void setExtraFee(double extraFee) {
        this.extraFee = extraFee;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }
}
