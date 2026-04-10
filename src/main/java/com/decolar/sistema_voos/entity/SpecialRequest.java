public class SpecialRequest {
    private int requestId;
    private String description;
    private boolean needsWheelchair;
    private boolean needsDietaryRestriction;

    public SpecialRequest(int requestId, String description, boolean needsWheelchair, boolean needsDietaryRestriction) {
        this.requestId = requestId;
        this.description = description;
        this.needsWheelchair = needsWheelchair;
        this.needsDietaryRestriction = needsDietaryRestriction;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isNeedsWheelchair() {
        return needsWheelchair;
    }

    public void setNeedsWheelchair(boolean needsWheelchair) {
        this.needsWheelchair = needsWheelchair;
    }

    public boolean isNeedsDietaryRestriction() {
        return needsDietaryRestriction;
    }

    public void setNeedsDietaryRestriction(boolean needsDietaryRestriction) {
        this.needsDietaryRestriction = needsDietaryRestriction;
    }
}
