package Task2;

public class VehicleTypeByPurpose extends VehicleType {
    public VehicleTypeByPurpose(String att) {
        super(att);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}