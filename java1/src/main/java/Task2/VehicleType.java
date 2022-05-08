package Task2;

public class VehicleType {
    //protected String attribute = VehicleTypeEnum.PASSENGER.name() ;
    protected String attribute;

    VehicleType(String attribute) {
        this.attribute = attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttributeOfType() {
        return attribute;
    }

    public String getTypeName() {
        return "Some vehicle type name";
    }
}