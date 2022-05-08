package Task2;

public class VehicleTypeByBodyTypes extends VehicleType {
    public VehicleTypeByBodyTypes(String att) {
        super(att);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByBodyTypes that = (VehicleTypeByBodyTypes) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}